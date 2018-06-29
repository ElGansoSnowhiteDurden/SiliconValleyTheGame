/*
 *
 */

package com.siliconvalley.it.model.game;

/**
 * The Class Snapshot.
 */
public class Snapshot {

  private int sequence;
  private String player;
  private ActionExec action;

  public Snapshot() {
    super();
  }

  public Snapshot(Snapshot snapshot) {
    // TODO Auto-generated constructor stub
  }

  public ActionExec getAction() {
    return action;
  }

  public String getPlayer() {
    return player;
  }

  public int getSequence() {
    return sequence;
  }

  public void next() {
    sequence++;
  }

  public void setAction(ActionExec action) {
    this.action = action;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

}
