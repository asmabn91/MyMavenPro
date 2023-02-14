package TechnostudyB7.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//2- create object of ChromeDriver to open the browser
        WebDriver driver= new ChromeDriver();
//3- go to google page
        driver.get("https://www.google.com");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://campus.techno.study");
        String expectedTitle="Join the best coding bootcamp online and get IT training in the US";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.printf("verification is done: Pass");
            System.out.printf("Actual Title = "+actualTitle);
        }else {
            System.out.println("verification is Failed");
            System.out.println("actual Title = "+actualTitle);
        }


    }
}
