package com.sapient.trg;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "com.sapient.trg",
		plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},tags = { "@cucumber-demo" }
		)
public class RunCucumberTest {

}
