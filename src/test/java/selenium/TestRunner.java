package selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {
                "src/test/resources/FlujoHappyPath/CP01ValidarFlujoCompraHappyPath.feature",
                "src/test/resources/FlujoUnhappyPath/CP01ValidarUsuarioBloqueadoUnhappyPath.feature"

        },
        glue = "selenium",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports/CucumberTestReport.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

