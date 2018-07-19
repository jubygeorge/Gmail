package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin = {"pretty","html:target/cucumberHtmlReport"},
		monochrome = true,
		 features ={"src/main/java/Features"},
		 glue = {"Tests"} 
                   
)
public class Runner {

}

