/**
 *
 */
package com.siliconvalley.it.model.rule;

import java.util.Map;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class ConsultantCard {

  private Map<Category, Integer[]> requests;
  private int startMonth;
  private int endMonth;

  public ConsultantCard() {
    super();
  }

  public ConsultantCard(Map<Category, Integer[]> requests, int startMonth, int endMonth) {
    super();
    this.requests = requests;
    this.startMonth = startMonth;
    this.endMonth = endMonth;
  }

  public int getEndMonth() {
    return endMonth;
  }

  public Map<Category, Integer[]> getRequests() {
    return requests;
  }

  public int getStartMonth() {
    return startMonth;
  }

  public void setEndMonth(int endMonth) {
    this.endMonth = endMonth;
  }

  public void setRequests(Map<Category, Integer[]> requests) {
    this.requests = requests;
  }

  public void setStartMonth(int startMonth) {
    this.startMonth = startMonth;
  }

}
