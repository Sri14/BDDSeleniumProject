$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login in test for Free CRM application",
  "description": "",
  "id": "login-in-test-for-free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User able to log in with valid credentials",
  "description": "",
  "id": "login-in-test-for-free-crm-application;user-able-to-log-in-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on free crm login page and logs in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is able to login to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click on companies tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I create a new company",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_free_crm_login_page_and_logs_in()"
});
formatter.result({
  "duration": 6519157333,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_able_to_login_to_homepage()"
});
formatter.result({
  "duration": 9570829,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_companies_tab()"
});
formatter.result({
  "duration": 4541049946,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_create_a_new_company()"
});
formatter.result({
  "duration": 4622494339,
  "status": "passed"
});
});