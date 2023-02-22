package TechnostudyB7.Day10;

import TechnostudyB7.Utilities.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WindowSwitchExample extends Utility1 {
    public static void main(String[] args) {
        driver.get("https://selenium.dev/");
        List<WebElement> links= driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:links) {
            if (!link.getAttribute("href").contains("mailto")){
                link.click();
            }
        }
        Set<String>idlist= driver.getWindowHandles();
        for (String id:idlist) {

            String mainTabId = "";
            if (!id.equals(mainTabId)){
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());

            }

        }
    }
}
