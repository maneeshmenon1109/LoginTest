$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the Login Application",
  "description": "",
  "id": "testing-the-login-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testtag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Positive scenario -1",
  "description": "",
  "id": "testing-the-login-application;positive-scenario--1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@positive-1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Enter the valid \"\u003cUsername\u003e\" and valid \"\u003cPassword\u003e\" with case-sensitive",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "it should be navigated to result page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "testing-the-login-application;positive-scenario--1;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "testing-the-login-application;positive-scenario--1;;1"
    },
    {
      "cells": [
        "Maneesh",
        "GamePlan"
      ],
      "line": 14,
      "id": "testing-the-login-application;positive-scenario--1;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "all input fields are available",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.goToApplication()"
});
formatter.result({
  "duration": 6903440698,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.validatePage()"
});
formatter.result({
  "duration": 395982071,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Positive scenario -1",
  "description": "",
  "id": "testing-the-login-application;positive-scenario--1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Testtag"
    },
    {
      "line": 8,
      "name": "@positive-1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Enter the valid \"Maneesh\" and valid \"GamePlan\" with case-sensitive",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "it should be navigated to result page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Maneesh",
      "offset": 17
    },
    {
      "val": "GamePlan",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.EnterInput_1(String,String)"
});
formatter.result({
  "duration": 9782329099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.postiveValidation1()"
});
formatter.result({
  "duration": 59697242,
  "status": "passed"
});
formatter.after({
  "duration": 3954250093,
  "status": "passed"
});
});