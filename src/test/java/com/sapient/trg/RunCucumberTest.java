package com.sapient.trg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
		features = "src/test/resources",
		glue = "com.sapient.trg",
		format = { "json:target/cucumber.json" }
		)
public class RunCucumberTest {

}
