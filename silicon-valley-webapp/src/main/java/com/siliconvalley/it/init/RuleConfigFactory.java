/*
 *
 */
package com.siliconvalley.it.init;

import com.siliconvalley.it.model.rule.Action;
import com.siliconvalley.it.model.rule.BillOfExchange;
import com.siliconvalley.it.model.rule.Category;
import com.siliconvalley.it.model.rule.ConsultantCard;
import com.siliconvalley.it.model.rule.ImprovementCard;
import com.siliconvalley.it.model.rule.PocCard;
import com.siliconvalley.it.model.rule.Project;
import com.siliconvalley.it.model.rule.RuleConfig;
import com.siliconvalley.it.model.rule.ToolCard;
import com.siliconvalley.it.model.support.SupportedAction;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A factory for creating RuleConfig objects.
 */
@Component
public class RuleConfigFactory {

  private final static Category PHARMA_CATEGORY = new Category("Pharmaceutical", "");
  private final static Category INDUSTRY_CATEGORY = new Category("Industry", "");
  private final static Category PUBLIC_ADM_CATEGORY =
      new Category("Public Administration", "");
  private final static Category MILITARY_CATEGORY = new Category("Military", "");

  public RuleConfig createStaticRule() {
    List<Category> categories = createCategories();
    List<Action> actions = createActions();
    List<ImprovementCard> improvements = createImprovements();
    List<ToolCard> tools = createTools();
    List<Project> projects = createProjects();
    List<PocCard> pocs = createPocs();
    List<ConsultantCard> consultantRequests = createConsultantRequests();
    Map<Integer, Integer> workerSalary = new HashMap<>();
    workerSalary.put(1, 4);
    workerSalary.put(2, 6);
    workerSalary.put(3, 8);
    Map<Integer, Integer> consultantSalary = new HashMap<>();
    consultantSalary.put(1, 5);
    consultantSalary.put(2, 8);
    consultantSalary.put(3, 11);
    BillOfExchange billOfExchange = new BillOfExchange(15, 20);
    Integer[] monthsOfPoc = new Integer[] { 7, 10, 13, 16, 19, 22 };
    Integer[] monthsOfConsultantRequests =
        new Integer[] { 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19, 21, 22, 23, 24 };
    return new RuleConfig("v3", 24, 4,
        20, 1, 2, 2, 2, actions,
        improvements, tools, projects, pocs,
        consultantRequests, monthsOfPoc, monthsOfConsultantRequests, billOfExchange,
        workerSalary, consultantSalary, categories);
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
        .add(createProjectAction());
    actions
        .add(createProjectAction());
    actions
        .add(createProjectAction());
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

  private List<Category> createCategories() {
    List<Category> categories = new ArrayList<>();
    categories.add(PHARMA_CATEGORY);
    categories.add(INDUSTRY_CATEGORY);
    categories.add(PUBLIC_ADM_CATEGORY);
    categories.add(MILITARY_CATEGORY);
    return categories;
  }

  private List<ConsultantCard> createConsultantRequests() {
    List<ConsultantCard> consultantRequests = new ArrayList<>();
    final Integer[] oneLiv1 = new Integer[] { 1, 0, 0 };
    final Integer[] oneLiv2 = new Integer[] { 0, 1, 0 };
    final Integer[] oneLiv3 = new Integer[] { 0, 0, 1 };
    consultantRequests.add(new ConsultantCard(
        createRequests(PHARMA_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(INDUSTRY_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(PUBLIC_ADM_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(MILITARY_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(PHARMA_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(INDUSTRY_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(PUBLIC_ADM_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(MILITARY_CATEGORY, oneLiv1), 6, 14));
    consultantRequests.add(new ConsultantCard(
        createRequests(PHARMA_CATEGORY, oneLiv2), 16, 19));
    consultantRequests.add(new ConsultantCard(
        createRequests(INDUSTRY_CATEGORY, oneLiv2), 16, 19));
    consultantRequests.add(new ConsultantCard(
        createRequests(PUBLIC_ADM_CATEGORY, oneLiv2), 16, 19));
    consultantRequests.add(new ConsultantCard(
        createRequests(MILITARY_CATEGORY, oneLiv2), 16, 19));
    consultantRequests.add(new ConsultantCard(
        createRequests(PHARMA_CATEGORY, oneLiv3), 21, 24));
    consultantRequests.add(new ConsultantCard(
        createRequests(INDUSTRY_CATEGORY, oneLiv3), 21, 24));
    consultantRequests.add(new ConsultantCard(
        createRequests(PUBLIC_ADM_CATEGORY, oneLiv3), 21, 24));
    consultantRequests.add(new ConsultantCard(
        createRequests(MILITARY_CATEGORY, oneLiv3), 21, 24));
    return consultantRequests;
  }

  private List<ImprovementCard> createImprovements() {
    List<ImprovementCard> improvements = new ArrayList<>();
    // TODO Auto-generated method stub
    return improvements;
  }

  private List<PocCard> createPocs() {
    List<PocCard> pocs = new ArrayList<>();
    pocs.add(new PocCard("Pharmaceutical Poc A", "", PHARMA_CATEGORY));
    pocs.add(new PocCard("Pharmaceutical Poc B", "", PHARMA_CATEGORY));
    pocs.add(new PocCard("Industry Poc A", "", INDUSTRY_CATEGORY));
    pocs.add(new PocCard("Industry Poc B", "", INDUSTRY_CATEGORY));
    pocs.add(new PocCard("Public Administration Poc A", "", PUBLIC_ADM_CATEGORY));
    pocs.add(new PocCard("Public Administration Poc B", "", PUBLIC_ADM_CATEGORY));
    pocs.add(new PocCard("Military Poc A", "", MILITARY_CATEGORY));
    pocs.add(new PocCard("Military Poc B", "", MILITARY_CATEGORY));
    return pocs;
  }

  private Action createProjectAction() {
    return new Action("Project", "", null, null, 1, 25, null,
        SupportedAction.PROJECT);
  }

  private List<Project> createProjects() {
    List<Project> projects = new ArrayList<>();
    projects.add(new Project("1", "Example Project 1", PHARMA_CATEGORY, true, 3, 30,
        8, new Integer[] { 2 }, new Integer[] { 1, 0 }, new Integer[] { 1, 0, 0 }));
    projects.add(new Project("2", "Example Project 2", INDUSTRY_CATEGORY, true, 3, 54,
        20, new Integer[] { 4 }, new Integer[] { 1, 0 }, new Integer[] { 2, 0, 0 }));
    projects.add(new Project("3", "Example Project 3", PHARMA_CATEGORY, false, 3, 42,
        12, new Integer[] { 2 }, new Integer[] { 1, 0 }, new Integer[] { 0, 1, 0 }));
    projects.add(new Project("4", "Example Project 4", PHARMA_CATEGORY, false, 6, 106,
        30, new Integer[] { 10 }, new Integer[] { 1, 0 }, new Integer[] { 2, 0, 0 }));
    // TODO
    return projects;
  }

  private Map<Category, Integer[]> createRequests(final Category category, Integer[] value) {
    Map<Category, Integer[]> requests = new HashMap<>();
    requests.put(category, value);
    return requests;
  }

  private List<ToolCard> createTools() {
    List<ToolCard> tools = new ArrayList<>();
    // TODO Auto-generated method stub
    return tools;
  }

}
