package TechnostudyB7.Day7;

import TechnostudyB7.Utilities.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetcssValue extends Utility1 {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        searchInput.getAttribute("autocomplete");
        System.out.println("getAttribute(autocomplete)"+searchInput.getAttribute("autocomplete"));
        searchInput.getAttribute("name");
        System.out.println(searchInput.getAttribute("name"));
        searchInput.getAttribute("id");
        System.out.println(searchInput.getAttribute("id"));
        searchInput.getCssValue("background");
        System.out.println(searchInput.getCssValue("background"));
        searchInput.getCssValue("font-familly");
        searchInput.getCssValue("color");
        System.out.println(searchInput.getCssValue("color"));
    }
}
