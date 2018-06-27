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
    private Integer[] requiredWorkers;

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

    public Integer[] getRequiredServers() {
        return requiredServers;
    }

    public Integer[] getRequiredWorkers() {
        return requiredWorkers;
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

    public void setRequiredServers(Integer[] requiredServers) {
        this.requiredServers = requiredServers;
    }

    public void setRequiredWorkers(Integer[] requiredWorkers) {
        this.requiredWorkers = requiredWorkers;
    }

    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }

}
