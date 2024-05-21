package com_nopcommerce_homework;
/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl= %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser_NopCommerce {
    // 1. Setup  Browser.
    static String browser = "Edge";
    static String BaseUrl =  "https://demo.nopcommerce.com/";
    static WebDriver driver;

    //IF-Else loop for selecting different browser
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser has been selected");
        }


        //Maximise the Browser window
        driver.manage().window().maximize();

        //2. Open URL into Browser
        driver.get(BaseUrl);

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println("The title of the page is:" + title);

        //4. Print the current url.
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("The Current Url of the page is:" + CurrentUrl);

        //5. Print the page source.
        System.out.println("To print the the page source" + driver.getPageSource());

        //6. Navigate to Url “https://demo.nopcommerce.com/login?returnUrl= %2F”
        String navigateUrl = "https://demo.nopcommerce.com/login?returnUrl= %2F";
        driver.navigate().to(navigateUrl);

        // 7. Print the current url.
        System.out.println("Get current url: " + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();

        //9. Navigate to the login page.
        driver.navigate().to(navigateUrl);

        //10. Print the current url.
        System.out.println("The Current URl is: " + CurrentUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("jagrutijadeja842@gmail.com");

        //13. Enter the password to password field.
        driver.findElement(By.id("Password")).sendKeys("helloworld");

        // 14. Click on Login Button.
        WebElement LoginButton = driver.findElement(By.linkText("Log in"));
        LoginButton.click();

        // 15. Close the browser.
        driver.quit();


    }
}
