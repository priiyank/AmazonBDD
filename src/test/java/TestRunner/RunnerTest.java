
	
	package TestRunner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
		
		        features= {"AllFeatureFile"},
		        glue= {"StepDefination"},
		        dryRun=true
		
	)
	public class RunnerTest extends AbstractTestNGCucumberTests {


	}

