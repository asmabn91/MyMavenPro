package TechnostudyB7.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility1 {
    public static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();

         driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
}
