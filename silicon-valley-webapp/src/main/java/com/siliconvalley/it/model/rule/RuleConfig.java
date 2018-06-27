/**
 * 
 */
package com.siliconvalley.it.model.rule;

import java.util.List;
import java.util.Map;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class RuleConfig {
    
    private String version;
    
    private int numberOfMonths;
    
    
    public String getVersion() {
        return version;
    }

    
    public void setVersion(String version) {
        this.version = version;
    }

     
    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    
    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    
    public int getInitialEthereum() {
        return initialEthereum;
    }

    
    public void setInitialEthereum(int initialEthereum) {
        this.initialEthereum = initialEthereum;
    }

    
    public int getInitialServer() {
        return initialServer;
    }

    
    public void setInitialServer(int initialServer) {
        this.initialServer = initialServer;
    }

    
    public int getInitialDesk() {
        return initialDesk;
    }

    
    public void setInitialDesk(int initialDesk) {
        this.initialDesk = initialDesk;
    }

    
    public int getInitialRoom() {
        return initialRoom;
    }

    
    public void setInitialRoom(int initialRoom) {
        this.initialRoom = initialRoom;
    }

    
    public int getInitialWorker() {
        return initialWorker;
    }

    
    public void setInitialWorker(int initialWorker) {
        this.initialWorker = initialWorker;
    }

    
    public List<Action> getActions() {
        return actions;
    }

    
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    
    public List<ImprovementCard> getImprovements() {
        return improvements;
    }

    
    public void setImprovements(List<ImprovementCard> improvements) {
        this.improvements = improvements;
    }

    
    public List<ToolCard> getTools() {
        return tools;
    }

    
    public void setTools(List<ToolCard> tools) {
        this.tools = tools;
    }

    
    public List<Project> getProjects() {
        return projects;
    }

    
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    
    public List<PocCard> getPocs() {
        return pocs;
    }

    
    public void setPocs(List<PocCard> pocs) {
        this.pocs = pocs;
    }

    
    public BillOfExchange getBillOfExchange() {
        return billOfExchange;
    }

    
    public void setBillOfExchange(BillOfExchange billOfExchange) {
        this.billOfExchange = billOfExchange;
    }

    
    public Map<Integer, Integer> getWorkerSalary() {
        return workerSalary;
    }

    
    public void setWorkerSalary(Map<Integer, Integer> workerSalary) {
        this.workerSalary = workerSalary;
    }

    
    public Map<Integer, Integer> getConsultantSalary() {
        return consultantSalary;
    }

    
    public void setConsultantSalary(Map<Integer, Integer> consultantSalary) {
        this.consultantSalary = consultantSalary;
    }

    private int numberOfPlayers;
    
    private int initialEthereum;
    private int initialServer;
    private int initialDesk;
    private int initialRoom;
    private int initialWorker;
    
    private List<Action> actions;
    private List<ImprovementCard> improvements;
    private List<ToolCard> tools;
    private List<Project> projects;
    private List<PocCard> pocs;
    
    private BillOfExchange billOfExchange;
    
    private Map<Integer,Integer> workerSalary;
    
    private Map<Integer,Integer> consultantSalary;

}
