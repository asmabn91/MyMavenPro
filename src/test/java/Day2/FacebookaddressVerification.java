package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookaddressVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // open browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:facebook.com");
        WebElement emailBox= driver.findElement(By.id("email"));
        emailBox.sendKeys("asma@techno.study");
        WebElement passwordBox=driver.findElement(By.cssSelector("input[type:'password']"));
        passwordBox.sendKeys("132154");
    }
}
