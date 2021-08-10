package com.sapient.trg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "com.sapient.trg",
		format = { "json:target/cucumber.json" }
		)
public class RunCucumberTest {

}
