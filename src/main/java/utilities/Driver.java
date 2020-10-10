package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;

import java.util.logging.Level;

public class Driver {


    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
            driver= new FirefoxDriver();
        }
        return driver;
    }


    public static void quitDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
    public static void clearConsoleErrors(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        String script = "console.clear();";
        js.executeScript(script);
        getDriver().manage().logs().get(LogType.BROWSER).filter(Level.ALL);
    }


}

