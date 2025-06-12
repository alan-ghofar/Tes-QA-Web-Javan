package StepDef;

import Config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bug_1 extends env_target {
    @Given("user berada di home page")
    public void userBeradaDiHomePage() {
        System.setProperty("webdriver.microsoft-edge.driver","F:\\QA Testing\\untitled\\src\\main\\resources\\msedgedriver.exe");
        driver = new EdgeDriver();
        //maximize driver
        driver.manage().window().maximize();
        //Set Url
        driver.get(baseURL);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"top_menu\"]/li[1]/a"))
        );
    }

    @When("user klik step satu")
    public void userKlikStepSatu() {
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/section[8]/div/div/div[1]/div/div/p[1]/a/strong/span")).click();
    }

    @Then("user berada di page step satu")
    public void userBeradaDiPageStepSatu() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/section[1]/div/div/div[1]/p[3]/a/span"))
        );
        driver.quit();
    }
}
