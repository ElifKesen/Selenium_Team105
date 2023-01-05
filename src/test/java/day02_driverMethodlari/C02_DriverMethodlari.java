package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //sayfayi tam ekran yapmak icin
        driver.manage().window().maximize();
        System.out.println("Maximize window boyutlari"+driver.manage().window().getSize());
        System.out.println("Maximize window konum"+driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen window boyutlari"+driver.manage().window().getSize());
        System.out.println("Fullscreen window konum"+driver.manage().window().getPosition());

        // browser i istedigimiz konuma ve boyuta getirin

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(3000);
        driver.close();
    }


}
