import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*getWindowHandle() metodu, Selenium WebDriver ile çalışırken kullanılan bir metoddur.
Bu metod, şu anda kontrol edilen pencerenin benzersiz bir tanıtıcı (handle) değerini döndürür.
Bu tanıtıcı değeri, tarayıcı penceresinin benzersiz bir kimliğini temsil eder.

Özellikle, bir tarayıcıda birden fazla pencere (window) açıldığında veya sekmeler (tab) bulunduğunda,
her pencere veya sekmenin kendine özgü bir tanıtıcı değeri vardır.
getWindowHandle() metodunu kullanarak, mevcut pencerenin tanıtıcı değerini alabilir ve daha sonra
bu değeri kullanarak o pencereye odaklanabilirsiniz.
Bu, özellikle çoklu pencere yönetimi veya pencere arası etkileşimlerde kullanışlı bir özelliktir.
*/
    public class C03_GetPageTitleGetPageSource {
        public static void main(String[] args) throws InterruptedException {

            // WebDriverManager kullanarak ChromeDriver'ı ayarla
            WebDriverManager.chromedriver().setup();

            // ChromeDriver objesini oluştur
            WebDriver driver = new ChromeDriver();

            // Pencereyi maksimize et
            driver.manage().window().maximize();

            // Google'a git ve sayfayı aç
            driver.get("https://www.google.com");

            // Google penceresinin tanıtıcısını al
            String googleHandle = driver.getWindowHandle();
            System.out.println(googleHandle);

            // Google sayfasının başlığını al
            String googleTitle = driver.getTitle();
            System.out.println("googleTitle: " + googleTitle);

            // Udemy'ye yönlendir ve sayfanın başlığını al
            driver.navigate().to("https://www.udemy.com");
            String udemyTitle = driver.getTitle();
            System.out.println("udemyTitle: " + udemyTitle);

            // 2 saniye bekle
            Thread.sleep(2000);

            // Sürücüyü kapat
            driver.quit();


        }
    }

