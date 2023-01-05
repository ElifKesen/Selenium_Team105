package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
1- Test otomostonu nedir ?
       Manuel olarak klavye , mouse kullanrak yapabılcegımız testleri , yazdıgımız kodlar aracılıgıyla yapmaya denir.
       2- Yazılım testi nedir ? : Yazılım yapmaya baslarken ortaya konulan requırement'lerin karsılanıp , karsılanmadıgının test edilmesidir.
       3- Bunu tespit edebilmek için developer'lar kodlamaya basladıgında gereksınımleri incelemeye başlarız, gereksinimler
       çerçevesinde expected result'ları belirleriz,
       developer'lar kodlarını bıtırıp test envoırement'ına yukledıkten sonra, hazırladıgımız pozıtıf ve negatıf test senaryolarını calıstırarak actual sonucları elde edip ,
       expected result ile actual result aynı mı diye bakarız.Aynı ise testimiz passed , aynı değil ise testimiz failed olur.
       4- Selenium nedir ? Selenium browser'ları otomate edecek toolların calısmasına ımkan tanıyan bir suite'dir
      Selenıum browser'ları otomate eder, bu gucle ne yapacagınız sıze kalmıs
      5- Selenium browser'ları nasıl kontrol eder ? Kullandıgımız programlama dili ile, çalıştıgımız İDE 'de  olusturacagımız
      webdriver sayasinde bilgisayarımızda ıstedıgımız browser'i kullanarak testlerimizi yapabiliriz.
 */

        // Biz browserlari, olusturdugumuz driver sayesinde otomate edebiliyoruz
        //Bunun icin her testin basinda mutlaka driver objesi olusturacagiz

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        //acilan sayfanin basliginin amazon icerdigini test edin

        String expectedKelime="amazon";
        String actualResult= driver.getTitle();
        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println(driver.getTitle());
        }

        // gittiğimiz sayfanın url'sinin https://www.amazon.com/ olduğunu test edin.


        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url istediğimiz değeri içermiyor test, FAILED");
            System.out.println(driver.getCurrentUrl());
        }



        Thread.sleep(5000);
        driver.close();
    }
}
