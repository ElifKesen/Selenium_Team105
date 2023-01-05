package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona git, Gift Cards linkini tikla
        //Gift Cards sayfasina gittigini test et

        driver.get("https://www.amazon.com");

       // WebElement giftCardlinki =driver.findElement(By.linkText("Gift Cards"));

        Thread.sleep(6000);
        WebElement giftCardlinki=driver.findElement(By.partialLinkText("Gift"));
        giftCardlinki.click();

        String expectedKelime="Gift Cards";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }





        driver.close();
    }
}
