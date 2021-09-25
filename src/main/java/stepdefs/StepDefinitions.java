package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    WebDriver driver;


    @Given("I open Browser")
    public void i_open_browser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.broadleafcommerce.org/");
        System.out.println("I opened Browser");
        Thread.sleep(5000);

    }
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("I clicked on the login Page");
    }
    @When("I enter username")
    public void i_enter_username() {

    }
    @When("I enter password")
    public void i_enter_password() {

    }
    @Then("I should see the customer welcome page")
    public void i_should_see_the_customer_welcome_page() {

    }
    @Then("I should see the logout button")
    public void i_should_see_the_logout_button() {

    }
    @Then("I close browser")
    public void i_close_browser() {

        driver.quit();
    }


}
