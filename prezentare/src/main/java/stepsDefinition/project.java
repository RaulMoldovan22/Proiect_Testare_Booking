package stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static java.lang.Thread.sleep;

public class project {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("Open Booking.com page")
    public void open_site() throws InterruptedException {
        driver.get("https://www.booking.com/index.ro.html");
        sleep(700);
    }
    @Then("Accept")
    public void accept() throws InterruptedException {
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        sleep(700);
    }
    @Then("Open Autentificare")
    public void open_autentificare() throws InterruptedException {
        driver.findElement(By.xpath("//*[@data-testid='header-sign-in-button']")).click();
        sleep(700);
    }

    @Then("Put username")
    public void put_username() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("raul_moldovan22@yahoo.com");
        sleep(700);
    }

    @Then("Click")
    public void click() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']")).click();
        sleep(700);
    }
    @Then("Put password")
    public void put_password() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Azimut12345");
        sleep(700);
    }
    @Then("Click2")
    public void click2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']")).click();
        sleep(7000);
    }
}


