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

  private int numberOfPlayers;

  private int initialEthereum;
  private int initialServer;
  private int initialDesk;
  private int initialRoom;
  private int initialEmployee;

  private List<Action> actions;

  private List<ImprovementCard> improvements;

  private List<ToolCard> tools;
  private List<Project> projects;
  private List<PocCard> pocs;
  private BillOfExchange billOfExchange;
  private Map<Integer, Integer> workerSalary;

  private Map<Integer, Integer> consultantSalary;

  public RuleConfig() {
    super();
  }

  public RuleConfig(String version, int numberOfMonths, int numberOfPlayers,
      int initialEthereum, int initialServer, int initialDesk, int initialRoom,
      int initialEmployee, List<Action> actions, List<ImprovementCard> improvements,
      List<ToolCard> tools, List<Project> projects, List<PocCard> pocs,
      BillOfExchange billOfExchange, Map<Integer, Integer> workerSalary,
      Map<Integer, Integer> consultantSalary) {
    super();
    this.version = version;
    this.numberOfMonths = numberOfMonths;
    this.numberOfPlayers = numberOfPlayers;
    this.initialEthereum = initialEthereum;
    this.initialServer = initialServer;
    this.initialDesk = initialDesk;
    this.initialRoom = initialRoom;
    this.setInitialEmployee(initialEmployee);
    this.actions = actions;
    this.improvements = improvements;
    this.tools = tools;
    this.projects = projects;
    this.pocs = pocs;
    this.billOfExchange = billOfExchange;
    this.workerSalary = workerSalary;
    this.consultantSalary = consultantSalary;
  }

  public List<Action> getActions() {
    return actions;
  }

  public BillOfExchange getBillOfExchange() {
    return billOfExchange;
  }

  public Map<Integer, Integer> getConsultantSalary() {
    return consultantSalary;
  }

  public List<ImprovementCard> getImprovements() {
    return improvements;
  }

  public int getInitialDesk() {
    return initialDesk;
  }

  public int getInitialEmployee() {
    return initialEmployee;
  }

  public int getInitialEthereum() {
    return initialEthereum;
  }

  public int getInitialRoom() {
    return initialRoom;
  }

  public int getInitialServer() {
    return initialServer;
  }

  public int getNumberOfMonths() {
    return numberOfMonths;
  }

  public int getNumberOfPlayers() {
    return numberOfPlayers;
  }

  public List<PocCard> getPocs() {
    return pocs;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public List<ToolCard> getTools() {
    return tools;
  }

  public String getVersion() {
    return version;
  }

  public Map<Integer, Integer> getWorkerSalary() {
    return workerSalary;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public void setBillOfExchange(BillOfExchange billOfExchange) {
    this.billOfExchange = billOfExchange;
  }

  public void setConsultantSalary(Map<Integer, Integer> consultantSalary) {
    this.consultantSalary = consultantSalary;
  }

  public void setImprovements(List<ImprovementCard> improvements) {
    this.improvements = improvements;
  }

  public void setInitialDesk(int initialDesk) {
    this.initialDesk = initialDesk;
  }

  public void setInitialEmployee(int initialEmployee) {
    this.initialEmployee = initialEmployee;
  }

  public void setInitialEthereum(int initialEthereum) {
    this.initialEthereum = initialEthereum;
  }

  public void setInitialRoom(int initialRoom) {
    this.initialRoom = initialRoom;
  }

  public void setInitialServer(int initialServer) {
    this.initialServer = initialServer;
  }

  public void setNumberOfMonths(int numberOfMonths) {
    this.numberOfMonths = numberOfMonths;
  }

  public void setNumberOfPlayers(int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  public void setPocs(List<PocCard> pocs) {
    this.pocs = pocs;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  public void setTools(List<ToolCard> tools) {
    this.tools = tools;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setWorkerSalary(Map<Integer, Integer> workerSalary) {
    this.workerSalary = workerSalary;
  }

}
