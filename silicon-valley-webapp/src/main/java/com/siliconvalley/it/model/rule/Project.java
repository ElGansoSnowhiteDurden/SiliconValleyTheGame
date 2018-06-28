/**
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class Project {

  private String name;
  private String description;
  private Category category;
  private boolean firstMonth;
  private int duration;
  private int startingPrice;
  private int failureTax;
  private Integer[] deleyTax;
  private Integer[] requiredServers;

  private Integer[] requiredEmployees;

  public Project() {
    super();
  }

  public Project(String name, String description, Category category, boolean firstMonth,
      int duration, int startingPrice, int failureTax, Integer[] deleyTax,
      Integer[] requiredServers, Integer[] requiredEmployees) {
    super();
    this.name = name;
    this.description = description;
    this.category = category;
    this.firstMonth = firstMonth;
    this.duration = duration;
    this.startingPrice = startingPrice;
    this.failureTax = failureTax;
    this.deleyTax = deleyTax;
    this.requiredServers = requiredServers;
    this.setRequiredEmployees(requiredEmployees);
  }

  public Category getCategory() {
    return category;
  }

  public Integer[] getDeleyTax() {
    return deleyTax;
  }

  public String getDescription() {
    return description;
  }

  public int getDuration() {
    return duration;
  }

  public int getFailureTax() {
    return failureTax;
  }

  public String getName() {
    return name;
  }

  public Integer[] getRequiredEmployees() {
    return requiredEmployees;
  }

  public Integer[] getRequiredServers() {
    return requiredServers;
  }

  public int getStartingPrice() {
    return startingPrice;
  }

  public boolean isFirstMonth() {
    return firstMonth;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public void setDeleyTax(Integer[] deleyTax) {
    this.deleyTax = deleyTax;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public void setFailureTax(int failureTax) {
    this.failureTax = failureTax;
  }

  public void setFirstMonth(boolean firstMonth) {
    this.firstMonth = firstMonth;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRequiredEmployees(Integer[] requiredEmployees) {
    this.requiredEmployees = requiredEmployees;
  }

  public void setRequiredServers(Integer[] requiredServers) {
    this.requiredServers = requiredServers;
  }

  public void setStartingPrice(int startingPrice) {
    this.startingPrice = startingPrice;
  }

}
