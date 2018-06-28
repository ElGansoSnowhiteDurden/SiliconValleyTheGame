/*
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class PocCard {

  private String name;
  private String description;
  private Category category;

  public PocCard() {
    super();
  }

  public PocCard(String name, String description, Category category) {
    super();
    this.name = name;
    this.description = description;
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

}
