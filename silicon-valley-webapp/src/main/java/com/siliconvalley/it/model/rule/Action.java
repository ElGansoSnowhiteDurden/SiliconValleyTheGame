/**
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class Action {

    private String name;
    private String description;
    private Integer firstPrize;
    private Integer nextPrize;
    private int startMonth;
    private int endMonth;

    public String getDescription() {
        return description;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public Integer getFirstPrize() {
        return firstPrize;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }

    public void setFirstPrize(Integer firstPrize) {
        this.firstPrize = firstPrize;
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
}
