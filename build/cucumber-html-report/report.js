$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/example/freelance/definitions/add.feature");
formatter.feature({
  "line": 2,
  "name": "add two numbers",
  "description": " \n  Description:\n      Adding two numbers . to test the Hooks with tags feature in cucumber.",
  "id": "add-two-numbers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DontNeedHook"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "add-two-numbers;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "two numbers 1  and 2",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "add them",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify result is 3",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    },
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "AddDef.two_numbers_and(int,int)"
});
formatter.result({
  "duration": 115511374,
  "status": "passed"
});
formatter.match({
  "location": "AddDef.add_them()"
});
formatter.result({
  "duration": 36654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "AddDef.verify_result_is(int)"
});
formatter.result({
  "duration": 2314484,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "add-two-numbers;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "two numbers add and verify",
  "rows": [
    {
      "cells": [
        "1",
        "2",
        "3"
      ],
      "line": 23
    },
    {
      "cells": [
        "3",
        "4",
        "7"
      ],
      "line": 24
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "AddDef.two_numbers_add_and_verify(DataTable)"
});
formatter.result({
  "duration": 1438965,
  "status": "passed"
});
formatter.uri("com/example/freelance/definitions/cucumbertag.feature");
formatter.feature({
  "line": 1,
  "name": "Search scenario",
  "description": "\nDescription:\n  This test is a example for the tag feature and uses scenario outline.",
  "id": "search-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "search in snapdeal website",
  "description": "",
  "id": "search-scenario;search-in-snapdeal-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "you search for fan",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "number of products listed should be \u003cnumber\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "search-scenario;search-in-snapdeal-website;",
  "rows": [
    {
      "cells": [
        "number"
      ],
      "line": 12,
      "id": "search-scenario;search-in-snapdeal-website;;1"
    },
    {
      "cells": [
        "25"
      ],
      "line": 13,
      "id": "search-scenario;search-in-snapdeal-website;;2"
    }
  ],
  "keyword": "Examples",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 4053446402,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "search in snapdeal website",
  "description": "",
  "id": "search-scenario;search-in-snapdeal-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "you search for fan",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "number of products listed should be 25",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BaseTest.open_browser()"
});
formatter.result({
  "duration": 28828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fan",
      "offset": 15
    }
  ],
  "location": "SearchDefinition.you_search_for(String)"
});
formatter.result({
  "duration": 3177100783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 36
    }
  ],
  "location": "SearchDefinition.you_search_for(int)"
});
formatter.result({
  "duration": 99244531,
  "status": "passed"
});
formatter.after({
  "duration": 18704463,
  "status": "passed"
});
formatter.uri("com/example/freelance/definitions/search.feature");
formatter.feature({
  "line": 1,
  "name": "Search scenario",
  "description": "",
  "id": "search-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3320023346,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "search and open product page",
  "description": "",
  "id": "search-scenario;search-and-open-product-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "you search for fan",
  "keyword": "When "
});
formatter.match({
  "location": "BaseTest.open_browser()"
});
formatter.result({
  "duration": 32386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fan",
      "offset": 15
    }
  ],
  "location": "SearchDefinition.you_search_for(String)"
});
formatter.result({
  "duration": 3048738706,
  "status": "passed"
});
formatter.after({
  "duration": 11767078,
  "status": "passed"
});
});