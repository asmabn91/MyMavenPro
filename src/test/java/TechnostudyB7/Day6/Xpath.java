package TechnostudyB7.Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");
        WebElement worldpopulationTitle= driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(worldpopulationTitle.getText());
        WebElement worldpopulationNumber= driver.findElement(By.xpath("//span[@class='rts-counter']"));
        System.out.println(worldpopulationNumber.getText());
        Thread.sleep(5000);
        driver.close();

    }
}
