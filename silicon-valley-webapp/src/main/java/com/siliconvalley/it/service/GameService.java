/*
 *
 */
package com.siliconvalley.it.service;

import com.siliconvalley.it.init.RuleConfigFactory;
import com.siliconvalley.it.model.game.ActionExec;
import com.siliconvalley.it.model.game.Game;
import com.siliconvalley.it.model.game.Snapshot;
import com.siliconvalley.it.model.rule.RuleConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  @Autowired
  private RuleConfigFactory factory;
  @Autowired
  private ActionService actionService;
  private Snapshot currentSnapshot;
  private Game game;

  public void execAction(String player, ActionExec action) {
    currentSnapshot.next();
    currentSnapshot.setPlayer(player);
    currentSnapshot.setAction(action);
    actionService.performCurrentAction(currentSnapshot);
    update();
  }

  public void startNewGame(String name) {
    // TODO retrive rule from db by version
    final RuleConfig rule = factory.createStaticRule();
    game = new Game(name, rule);
    currentSnapshot = convertRuleIntoInitialSnapshot(rule);
    update();
  }

  protected void update() {
    game.addSnapshot(currentSnapshot);
    // TODO save game
    // TODO push websocket
  }

  private Snapshot convertRuleIntoInitialSnapshot(RuleConfig rule) {
    final Snapshot snapshot = new Snapshot();
    snapshot.setSequence(0);
    snapshot.setPlayer("AUTO");
    snapshot.setAction(null);
    return snapshot;
  }

}
