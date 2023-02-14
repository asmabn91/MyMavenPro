package TechnostudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com");
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement messageBox=driver.findElement(By.id("user-message"));
       messageBox.sendKeys("hi world");
       WebElement button=driver.findElement(By.cssSelector("button[class='btn btn-default']"));
       button.click();
    }
}
