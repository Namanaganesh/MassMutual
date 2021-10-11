$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/automatedtest/sample/Search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search cucumber studio",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@search_01"
    }
  ]
});
formatter.step({
  "name": "A user navigates to HomePage \"fr\"",
  "keyword": "Given "
});
formatter.step({
  "name": "a user searches for \"cucumber studio\"",
  "keyword": "When "
});
formatter.step({
  "name": "\"CucumberStudio\" is displayed in the first \"\u003cnbOfResultsToSearch\u003e\" results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "nbOfResultsToSearch"
      ]
    },
    {
      "cells": [
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search cucumber studio",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@search_01"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:843)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:142)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:36)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:195)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:389)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:118)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:139)\r\n\tat com.automatedtest.sample.infrastructure.driver.Setup.setWebDriver(Setup.java:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "A user navigates to HomePage \"fr\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automatedtest.sample.homepage.HomePageSteps.aUserNavigatesToHomePage(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a user searches for \"cucumber studio\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automatedtest.sample.homepage.HomePageSteps.aUserSearchesFor(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"CucumberStudio\" is displayed in the first \"3\" results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automatedtest.sample.searchresultpage.SearchResultPageSteps.isDisplayedInTheFirstResults(java.lang.String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat com.automatedtest.sample.infrastructure.driver.TearDown.saveScreenshotsForScenario(TearDown.java:28)\r\n\tat com.automatedtest.sample.infrastructure.driver.TearDown.quitDriver(TearDown.java:20)\r\n",
  "status": "failed"
});
});