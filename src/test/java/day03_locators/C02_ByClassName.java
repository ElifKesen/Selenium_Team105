package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        // amazona gidip nutella icin arama yap
        //ilk sayfada cikan urunlerin icerisinde en yuksek fiyati bul

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement>fiyatlarListesi=driver.findElements(By.className("a-price-whole"));


        //Webelement bir obje oldugundan direkt yazdirilamaz
        System.out.println(fiyatlarListesi);

        //Bunun icin for each loop kullanarak herbir
        // webelement uzerindeki yazilari tek tek yazdirmaliyiz

        for (WebElement each:fiyatlarListesi
             ) {
            System.out.print(each.getText()+ " ");
        }

        //en yuksek fiyati bulabilmek icin java bilgimizi kullanmaliyiz.
        //1- webelementlerden getText ile fiyati String olarak alin
        //2- string fiyati kiyaslama yapabilmek icin integar a cevirin
        //3- en yuksek fiyati bulup yazdirin

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;
        for (WebElement each:fiyatlarListesi
             ) {

            fiyatStr = each.getText();
            fiyatInt= Integer.parseInt(fiyatStr);



        }



        Thread.sleep(3000);
        driver.close();
    }
}
