package com.automatedtest.sample;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/sample/Problem1.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/Problem1.json",
        "html:target/Problem1-html"},
        glue = {"com.automatedtest.sample.infrastructure.driver",
                "com.automatedtest.sample.problem1"})
public class Problem1PageTest {
}
