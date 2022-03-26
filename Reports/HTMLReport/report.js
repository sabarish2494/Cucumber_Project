$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate login functionality in fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be enter the login webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_enter_the_login_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate  the empty username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enter to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition2.user_enter_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will navigates to the invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_will_navigates_to_the_invalid_credential_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.step.StepDefinition2.user_will_navigates_to_the_invalid_credential_page(StepDefinition2.java:29)\r\n\tat ✽.user will navigates to the invalid credential page(file:src/test/resources/Features/login.feature:21)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});