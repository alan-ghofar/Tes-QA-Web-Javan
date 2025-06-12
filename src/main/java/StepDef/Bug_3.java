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

public class Bug_3 extends env_target {
    @Given("user berada di solusi-dari-odoo page")
    public void userBeradaDiSolusiDariOdooPage() {
        System.setProperty("webdriver.microsoft-edge.driver","F:\\QA Testing\\untitled\\src\\main\\resources\\msedgedriver.exe");
        driver = new EdgeDriver();
        //maximize driver
        driver.manage().window().maximize();
        //Set Url
        driver.get(ordoo);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/section[1]/div/div/div[1]/h1/strong/span[2]"))
        );
    }

    @When("user input data pribadi")
    public void userInputDataPribadi() {
        //nama
        driver.findElement(By.id("ogel69u5av19")).sendKeys("coba");
        //email
        driver.findElement(By.id("oub62hlfgjwf")).sendKeys("coba");
        //nomor hp
        //field nomor hp bisa input selain angka
        driver.findElement(By.id("ozp7022vqhe")).sendKeys("coba");
        //perushaan
        driver.findElement(By.id("onr8vugh4wa")).sendKeys("coba");
        //posisi
        driver.findElement(By.id("oqsf4m51acj")).sendKeys("coba");
        //bagaimana anda menemukan kami
        driver.findElement(By.id("owkramkw4lcd0")).click();
        //pernyataan anda
        driver.findElement(By.id("oyeqnysxh10b")).sendKeys("coba");
    }

    @And("user klik submit")
    public void userKlikSubmit() {
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/section[11]/div/form/div/div[10]/a")).click();
    }

    @Then("user berhasil submit")
    public void userBerhasilSubmit() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("s_website_form_result"))
        );

        driver.quit();

    }
}
