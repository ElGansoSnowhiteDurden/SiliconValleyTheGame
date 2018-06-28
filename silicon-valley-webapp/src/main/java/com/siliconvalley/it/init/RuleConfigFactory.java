/*
 *
 */
package com.siliconvalley.it.init;

import com.siliconvalley.it.model.rule.Action;
import com.siliconvalley.it.model.rule.BillOfExchange;
import com.siliconvalley.it.model.rule.ImprovementCard;
import com.siliconvalley.it.model.rule.PocCard;
import com.siliconvalley.it.model.rule.Project;
import com.siliconvalley.it.model.rule.RuleConfig;
import com.siliconvalley.it.model.rule.ToolCard;
import com.siliconvalley.it.model.support.SupportedAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A factory for creating RuleConfig objects.
 */
public class RuleConfigFactory {

  public RuleConfig createStaticRule() {
    List<Action> actions = createActions();
    List<ImprovementCard> improvements = createImprovements();
    List<ToolCard> tools = createTools();
    List<Project> projects = createProjects();
    List<PocCard> pocs = createPocs();
    Map<Integer, Integer> workerSalary = new HashMap<>();
    workerSalary.put(1, 4);
    workerSalary.put(2, 6);
    workerSalary.put(3, 8);
    Map<Integer, Integer> consultantSalary = new HashMap<>();
    consultantSalary.put(1, 5);
    consultantSalary.put(2, 8);
    consultantSalary.put(3, 11);
    BillOfExchange billOfExchange = new BillOfExchange(15, 20);
    return new RuleConfig("v3", 24, 4,
        20, 1, 2, 2, 2, actions,
        improvements, tools, projects, pocs, billOfExchange, workerSalary, consultantSalary);
  }

  private List<Action> createActions() {
    final List<Action> actions = new ArrayList<>();
    actions.add(new Action("Buy Desk", "", 4, 8, 1, 25, null, SupportedAction.BUY_DESK));
    actions
        .add(new Action("Buy Desk", "", 6, 10, 1, 25, null, SupportedAction.BUY_DESK));
    actions
        .add(new Action("Buy Server Lv.1", "", 4, 8, 1, 25, 1,
            SupportedAction.BUY_SERVER));
    actions
        .add(new Action("Buy Server Lv.1", "", 6, 10, 1, 11, 1,
            SupportedAction.BUY_SERVER));
    actions
        .add(new Action("Buy Server Lv.2", "", 10, 16, 12, 25, 2,
            SupportedAction.BUY_SERVER));
    actions
        .add(new Action("Project", "", null, null, 1, 25, null,
            SupportedAction.PROJECT));
    actions
        .add(new Action("Project", "", null, null, 1, 25, null,
            SupportedAction.PROJECT));
    actions
        .add(new Action("Project", "", null, null, 1, 25, null,
            SupportedAction.PROJECT));
    actions
        .add(new Action("Internal Product", "", null, null, 1, 25, null,
            SupportedAction.INTERNAL_PRODUCT));
    actions
        .add(new Action("Internal Product", "", null, null, 1, 25, null,
            SupportedAction.INTERNAL_PRODUCT));
    actions
        .add(new Action("Tool", "", null, null, 1, 25, null,
            SupportedAction.TOOL));
    actions
        .add(new Action("Improvement", "", null, null, 1, 25, null,
            SupportedAction.IMPROVEMENT));
    actions
        .add(new Action("Request Consultants", "", null, null, 1, 25, null,
            SupportedAction.REQUEST_CONSULTANTS));
    actions
        .add(new Action("Educate Employee", "", null, null, 1, 25, null,
            SupportedAction.EDUCATE_EMPLOYEE));
    actions
        .add(new Action("Offer Consultant", "", null, null, 6, 25, null,
            SupportedAction.OFFER_CONSULTANT));
    actions
        .add(new Action("Offer Consultant", "", null, null, 6, 25, null,
            SupportedAction.OFFER_CONSULTANT));
    actions
        .add(new Action("Hire Employee Lv.1", "", null, null, 1, 25, 1,
            SupportedAction.HIRE_EMPLOYEE));
    actions
        .add(new Action("Hire Employee Lv.1", "", null, null, 1, 11, 1,
            SupportedAction.HIRE_EMPLOYEE));
    actions
        .add(new Action("Hire Employee Lv.2", "", null, null, 12, 25, 2,
            SupportedAction.HIRE_EMPLOYEE));
    actions
        .add(new Action("Hire Employee Lv.2", "", null, null, 12, 25, 2,
            SupportedAction.HIRE_EMPLOYEE));
    actions
        .add(new Action("Hacking", "", null, null, 12, 25, null,
            SupportedAction.HACKING));
    actions
        .add(new Action("Upgrade Server", "", 4, 8, 12, 25, null,
            SupportedAction.UPGRADE_SERVER));
    return actions;
  }

  private List<ImprovementCard> createImprovements() {
    // TODO Auto-generated method stub
    return null;
  }

  private List<PocCard> createPocs() {
    // TODO Auto-generated method stub
    return null;
  }

  private List<Project> createProjects() {
    // TODO Auto-generated method stub
    return null;
  }

  private List<ToolCard> createTools() {
    // TODO Auto-generated method stub
    return null;
  }

}
