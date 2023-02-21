package TechnostudyB7.Day8;

import TechnostudyB7.Utilities.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements extends Utility1 {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        List<WebElement> videoTitles = driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.get(10).getText());
    }
}
