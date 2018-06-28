/**
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class ToolCard {

  private String name;
  private String description;
  // TODO
  // 1 strategy to apply
  // 2 strategy to apply
  // 3 strategy to apply

  public ToolCard() {
    super();
  }

  public ToolCard(String name, String description) {
    super();
    this.name = name;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

}
