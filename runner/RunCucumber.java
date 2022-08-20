package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features={"src/test/java/features"},
				glue={"stepDefinition"},
				monochrome= true,
				publish= true)

public class RunCucumber extends BaseClass {

}
