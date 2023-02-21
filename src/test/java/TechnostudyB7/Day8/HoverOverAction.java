package TechnostudyB7.Day8;

import TechnostudyB7.Utilities.Utility1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static TechnostudyB7.Day8.ArrowKeysAction.quitDriver;
import static java.time.Duration.*;

public class HoverOverAction extends Utility1 { public static void main(String[] args) {
    driver.get("https://www.etsy.com/");

    /**
     * Hover over Jewelery
     * Earrings
     * click on Clip-On Earrings
     * Check if the url has Clip-On Earrings
     * */

    //<span id="catnav-primary-link-10855" class="wt-text-black"
    // role="menuitem" aria-haspopup="true" tabindex="0">
    //
    //                               Jewelry &amp; Accessories
    //
    //                       </span>

    WebElement jewelery = driver.findElement(By.id("catnav-primary-link-10855"));

    Actions actions = new Actions(driver);

    Action hoverOverJeweleryAction = actions.moveToElement(jewelery).build();
    hoverOverJeweleryAction.perform();

    //<span id="side-nav-category-link-10896"
    // class="wt-text-black wt-pr-xs-1 wt-pl-xs-2 wt-pl-md-3 wt-pt-xs-2 wt-pb-xs-1 wt-text-caption wt-display-flex-xs wt-justify-content-space-between"
    // role="menuitem" aria-haspopup="true" tabindex="-1">
    //                        Earrings
    //                        <span class="etsy-icon wt-nudge-b-2"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" aria-hidden="true" focusable="false"><path d="M10,17a1,1,0,0,1-.707-1.707L12.586,12,9.293,8.707a1,1,0,0,1,1.414-1.414L15.414,12l-4.707,4.707A1,1,0,0,1,10,17Z"></path></svg></span>
    //                    </span>

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement earrings = driver.findElement(By.id("side-nav-category-link-10896"));
    wait.until(ExpectedConditions.visibilityOf(earrings));

    Action hoverOverEarringsAction = actions.moveToElement(earrings).build();
    hoverOverEarringsAction.perform();

    //<a id="catnav-l3-10904"
    // class="wt-display-block wt-text-black wt-text-link-no-underline "
    // href="/c/jewelry/earrings/clip-on-earrings?ref=catnav-10855" role="menuitem" tabindex="-1">
    //                                    Clip-On Earrings
    //                                </a>
    WebElement clipOnEarring = driver.findElement(By.id("catnav-l3-10904"));
    clipOnEarring.click();

    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl.contains("clip-on-earrings"));

    quitDriver(4);

}

}
