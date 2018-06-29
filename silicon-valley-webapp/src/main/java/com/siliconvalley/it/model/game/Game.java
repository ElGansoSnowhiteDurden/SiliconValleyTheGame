/*
 *
 */
package com.siliconvalley.it.model.game;

import com.siliconvalley.it.model.rule.RuleConfig;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private String name;
  private RuleConfig version;
  private List<Snapshot> snapshots;

  public Game() {
    super();
  }

  public Game(String name, RuleConfig version) {
    super();
    this.name = name;
    this.version = version;
    this.snapshots = new ArrayList<>();
  }

  public void addSnapshot(Snapshot snapshot) {
    snapshots.add(new Snapshot(snapshot));
  }

  public String getName() {
    return name;
  }

  public List<Snapshot> getSnapshots() {
    return snapshots;
  }

  public RuleConfig getVersion() {
    return version;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSnapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
  }

  public void setVersion(RuleConfig version) {
    this.version = version;
  }

}
