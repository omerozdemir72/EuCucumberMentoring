package stepDefinition;

import PageObjectModel.Test1_Page;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Test1 {
   private WebDriver driver;
    Test1_Page test1_page= new Test1_Page();
    @Given("^Websiteye git$")
    public void websiteye_git() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Sign in butonuna tıkla$")
    public void sign_in_butonuna_tıkla() throws Throwable {

        test1_page.clickSignInButton();
    }

    @And("^\"([^\"]*)\" girisi yap$")
    public void girisiYap(String email) throws Throwable {

        test1_page.typeEmail(email);
    }

    @Given("^Create an Account butonuna tıkla$")
    public void create_an_Account_butonuna_tıkla() throws Throwable {

        test1_page.clickSubmit();
    }

    @Given("^Title sec$")
    public void title_sec() throws Throwable {

        test1_page.clickGender();
    }

    @And("^firstname \"([^\"]*)\" ve  lastname \"([^\"]*)\" gir$")
    public void firstnameVeLastnameGir(String arg0, String arg1) throws Throwable {

        test1_page.typeFirstname1(arg0);
        test1_page.typeLasstname1(arg1);
    }

    @And("^password \"([^\"]*)\" gir$")
    public void passwordGir(String arg0) throws Throwable {
        test1_page.password(arg0);
    }
    @When("^Company \"([^\"]*)\" gir$")
    public void companyGir(String arg0) throws Throwable {
        test1_page.typeCompany(arg0);
    }
    @Then("^Adres \"([^\"]*)\" gir$")
    public void adresGir(String arg0) throws Throwable {
        test1_page.typeAddress(arg0);

    }
    @After
    public void driverQuit() throws InterruptedException {

        Thread.sleep(2000);
        Driver.quitDriver();


    }
}
