package TechnostudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        //set up browser
        WebDriverManager.chromedriver().setup();
        // open browser
        WebDriver driver=new ChromeDriver();
        driver.get("https:techno.study");
        Thread.sleep(2000);
        driver.navigate().to("https:facebook.com");
        driver.navigate().back();
        //driver .get wait for the page to upload but navigate .to doesn't
        driver.navigate().forward();

        //finding the first element on facebook
       WebElement slogantext= driver.findElement(By.className("_8eso"));
        String expSloganText = "Connect with friends and the world around you on Facebook.";
        String actSloganText = slogantext.getText();

        if(expSloganText.equals(actSloganText)){

            System.out.println("Verification is done : PASS");

        }else {

            System.out.println("Verification is done : FAILED");
            System.out.println("Actual slogan text is " + actSloganText);

        }

    }
}
