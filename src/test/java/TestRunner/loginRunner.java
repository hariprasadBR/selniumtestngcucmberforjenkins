package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)


@CucumberOptions(
		features= {"AllFeature/googlepageload.feature"},
		glue= {"StepDefination"},
		dryRun=false
		)

public class loginRunner extends AbstractTestNGCucumberTests {

}
