import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {

        // WebDriverManager kullanarak ChromeDriver'ı ayarla
        WebDriverManager.chromedriver().setup();

        // ChromeDriver objesini oluştur
                WebDriver driver = new ChromeDriver();

        // Pencereyi maksimize et
                driver.manage().window().maximize();

        // Google'a git ve sayfayı aç
                driver.get("https://www.google.com");

        // Udemy'ye yönlendir
                driver.navigate().to("https://www.udemy.com");

        // Udemy'nin geçerli URL'sini al
                String udemyUrl = driver.getCurrentUrl();
                System.out.println("udemyUrl: " + udemyUrl);

        // Geri git
                driver.navigate().back();

        // Geçerli URL'yi al, bu noktada yapılacak bir şey yok
                driver.getCurrentUrl();

        // Google'ın geçerli URL'sini al
                String googleUrl = driver.getCurrentUrl();
                System.out.println("googleUrl: " + googleUrl);

        // Pencereyi tam ekran yap
                driver.manage().window().fullscreen();

        // 2 saniye bekle
                Thread.sleep(2000);

        // Sayfayı yenile
                driver.navigate().refresh();

        // İleri git
                driver.navigate().forward();

        // 1 saniye bekle
                Thread.sleep(1000);

        // Sürücüyü kapat
                driver.quit();


    }
}
