/*
 *
 */
package com.siliconvalley.it.service;

import com.siliconvalley.it.model.game.ActionExec;
import com.siliconvalley.it.model.game.Snapshot;

import org.springframework.stereotype.Service;

@Service
public class ActionService {

  public void performCurrentAction(Snapshot currentSnapshot) {
    final ActionExec currentAction = currentSnapshot.getAction();
    // TODO

  }

}
