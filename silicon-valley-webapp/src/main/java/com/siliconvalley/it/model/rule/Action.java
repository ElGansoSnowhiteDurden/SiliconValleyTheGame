/**
 *
 */
package com.siliconvalley.it.model.rule;

import com.siliconvalley.it.model.support.SupportedAction;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class Action {

  private SupportedAction type;
  private String name;
  private String description;
  private Integer firstPrize;
  private Integer nextPrize;
  private Integer level;

  private int startMonth;
  private int endMonth;

  public Action() {
    super();
  }

  public Action(String name, String description, Integer firstPrize, Integer nextPrize,
      int startMonth, int endMonth, Integer level, SupportedAction type) {
    super();
    this.name = name;
    this.description = description;
    this.firstPrize = firstPrize;
    this.nextPrize = nextPrize;
    this.startMonth = startMonth;
    this.endMonth = endMonth;
    this.level = level;
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public int getEndMonth() {
    return endMonth;
  }

  public Integer getFirstPrize() {
    return firstPrize;
  }

  public Integer getLevel() {
    return level;
  }

  public String getName() {
    return name;
  }

  public Integer getNextPrize() {
    return nextPrize;
  }

  public int getStartMonth() {
    return startMonth;
  }

  public SupportedAction getType() {
    return type;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setEndMonth(int endMonth) {
    this.endMonth = endMonth;
  }

  public void setFirstPrize(Integer firstPrize) {
    this.firstPrize = firstPrize;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNextPrize(Integer nextPrize) {
    this.nextPrize = nextPrize;
  }

  public void setStartMonth(int startMonth) {
    this.startMonth = startMonth;
  }

  public void setType(SupportedAction type) {
    this.type = type;
  }
}
