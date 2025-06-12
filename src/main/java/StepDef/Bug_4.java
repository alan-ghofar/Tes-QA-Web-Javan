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

public class Bug_4 extends env_target {
    @Given("user berada di jobs page")
    public void userBeradaDiJobsPage() {
        System.setProperty("webdriver.microsoft-edge.driver","F:\\QA Testing\\untitled\\src\\main\\resources\\msedgedriver.exe");
        driver = new EdgeDriver();
        //maximize driver
        driver.manage().window().maximize();
        //Set Url
        driver.get(jobs);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/nav/div/div/span"))
        );
    }

    @When("user klik menu intersip batch july")
    public void userKlikMenuIntersipBatchJuly() {
        driver.findElement(By.xpath("//*[@id=\"jobs_grid\"]/div/div[1]/div/a/div/div[1]/h3")).click();
    }

    @Then("user berada pada intership batch july")
    public void userBeradaPadaIntershipBatchJuly() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/div/section/div/div/h1"))
        );

    }

    @When("user klik buttom apply di intership batch july page")
    public void userKlikButtomApplyDiIntershipBatchJulyPage() {
        driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/section/div/div/div/a")).click();
    }

    @Then("user berada di pengisian data intership")
    public void userBeradaDiPengisianDataIntership() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"wrap\"]/h1"))
        );
    }

    @When("user input data diri")
    public void userInputDataDiri() {
        //nama
        driver.findElement(By.id("recruitment1")).sendKeys("coba");
        //email
        driver.findElement(By.id("recruitment2")).sendKeys("coba");
        //nomor hp
        //bug field bisa di isi selain angka
        driver.findElement(By.id("recruitment3")).sendKeys("coba");
        //posisi
        driver.findElement(By.id("o8lmahnho1rt")).click();
        driver.findElement(By.id("o8lmahnho1rt")).click();
        //Linkedin
        driver.findElement(By.id("recruitment4")).sendKeys("coba");
        //pengenalan singkat
        driver.findElement(By.id("recruitment5")).sendKeys("coba");
    }

    @And("user klik buttom apply")
    public void userKlikButtomApply() {
        driver.findElement(By.id("apply-btn")).click();
    }

    @Then("user berhasil apply")
    public void userBerhasilApply() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"s_website_form_result\"]"))
        );
        driver.quit();

    }
}
