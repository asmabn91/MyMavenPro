package TechnostudyB7.Day7;

import TechnostudyB7.Utilities.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClick extends Utility1 {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleclickboutton= driver.findElement(By.id("doubleClickBtn"));
        Actions actions=new Actions(driver);
        Action action=actions.doubleClick(doubleclickboutton).build();
        action.perform();

        WebElement rightclickaction= driver.findElement(By.id("rightClickBtn"));
        Action rightclickAction=actions.contextClick()
    }
}
