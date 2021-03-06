package runnerIO;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = {".\\src\\test\\resources\\Features\\Organization.feature"},
					glue= {"stepDefinitions","hookClass"},
					dryRun = false,
					plugin = {"pretty",
							"html:target/cucumber-reports.html"},
					monochrome = true
					
					
)
public class Runner extends AbstractTestNGCucumberTests{

}
