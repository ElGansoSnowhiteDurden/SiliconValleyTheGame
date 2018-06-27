/**
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class ImprovementCard {

    private String name;
    private String description;
    private boolean remainsInPlay;
    // TODO
    // strategy to apply
    // trigger condition

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isRemainsInPlay() {
        return remainsInPlay;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemainsInPlay(boolean remainsInPlay) {
        this.remainsInPlay = remainsInPlay;
    }

}
