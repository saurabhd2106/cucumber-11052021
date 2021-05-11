package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				glue = {"stepDefinition"},
				plugin = {"pretty",
						"json:target/reports/reports.json",
						"html:target/reports/reports-html.html",
						"junit:target/reports/reports-html.xml"},
				monochrome = true,
				tags = "@Signup")

public class TestRunner {

}
