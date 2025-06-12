package StepDef;

import Config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bug_2 extends env_target {
    @When("user klik step dua")
    public void userKlikStepDua() {
        System.setProperty("webdriver.microsoft-edge.driver","F:\\QA Testing\\untitled\\src\\main\\resources\\msedgedriver.exe");
        driver = new EdgeDriver();
        //maximize driver
        driver.manage().window().maximize();
        //Set Url
        driver.get(baseURL);

        driver.findElement(By.xpath("//*[@id=\"wrap\"]/section[8]/div/div/div[2]/div/div/p[1]/a/strong/span")).click();
    }

    @Then("user berada di page step dua")
    public void userBeradaDiPageStepDua() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/section[1]/div/div/div[1]/p[3]/a"))
        );
    }
}
