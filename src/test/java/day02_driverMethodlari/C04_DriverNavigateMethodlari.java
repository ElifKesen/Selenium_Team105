package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        //get ile ayni islevi yapar


        Thread.sleep(3000);
        driver.get("https:www.wisequarter.com");

        Thread.sleep(3000);

        //yeniden amazona dön
        driver.navigate().back();
        Thread.sleep(3000);

        //tekrar wisequarter a dön
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.quit();
    }
}
