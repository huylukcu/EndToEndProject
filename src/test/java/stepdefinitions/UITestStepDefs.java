package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class UITestStepDefs {
    WebDriver driver;
    @Given("user goes to {string}")
    public void user_goes_to(String url) {

        WebDriverManager.chromedriver().create().get(url);

        //WebDriver driver = WebDriverManager.chromedriver().create();
        //driver.get(url);

        //WebDriverManager.chromedriver().setup();
        //new ChromeDriver().get(url);
    }
    @Then("user closes the application")
    public void user_closes_the_application() throws InterruptedException {

//        Thread.sleep(3000);
//        driver.quit();


}}
