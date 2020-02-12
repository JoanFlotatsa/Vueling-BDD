package vuelingApp.acceptancetests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions( plugin= {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},features="src/test/resources", glue="vuelingApp")
public class AcceptanceTestSuite extends RunnerBase
{
}
