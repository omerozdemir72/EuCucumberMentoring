package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.driver2;


@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor.
        }

)

public class RunnerParallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public static void beforeClass(String browser){

        driver2.browserName.set(browser);
    }



    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src\\main\\java\\XMLFiles\\extendReportSet.xml");//ayarlar alındı cucumber extend reporttan haberi oldu
        Reporter.setSystemInfo("QA Tester :  ", "Omer Ozdemir");
        Reporter.setSystemInfo("Application name : ", "International Game Collage   ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}
