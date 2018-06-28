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

  public ConsultantCard() {
    super();
  }

  public ConsultantCard(Map<Category, Integer[]> requests) {
    super();
    this.requests = requests;
  }

  public Map<Category, Integer[]> getRequests() {
    return requests;
  }

  public void setRequests(Map<Category, Integer[]> requests) {
    this.requests = requests;
  }

}
