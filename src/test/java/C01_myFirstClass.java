import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_myFirstClass {
    public static void main(String[] args) throws InterruptedException {

        // WebDriverManager kullanarak ChromeDriver'ı ayarla
        WebDriverManager.chromedriver().setup();

        // ChromeDriver örneğini oluştur
                WebDriver driver = new ChromeDriver();

        // Google'a giderek sayfayı aç
                driver.get("https://www.google.com");

        // 3 saniye bekle
                Thread.sleep(3000);

        // Sürücüyü kapat
                driver.quit();


    }
}
