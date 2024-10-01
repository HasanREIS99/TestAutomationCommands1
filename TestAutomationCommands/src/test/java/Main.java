import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

        // Sets up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Creates a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximizes the browser window
        driver.manage().window().maximize();

        // Opens the Google homepage
        driver.get("https://www.google.com");

        // Closes the browser
        driver.quit();

        // Timeouts
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // Waits for the page to load within 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waits for elements to appear or actions to complete

        // Window Management
        driver.manage().window().maximize(); // Maximizes the browser window
        int X = driver.manage().window().getPosition().getX(); // Gets the X position of the window
        int Y = driver.manage().window().getPosition().getY(); // Gets the Y position of the window

        // URL Management
        driver.get("https://www.google.tr/"); // Navigates to Google Turkey
        String CurrentUrl = driver.getCurrentUrl(); // Gets the current URL of the page
        String Title = driver.getTitle(); // Gets the title of the current page
        String PageSource = driver.getPageSource(); // Gets the page source (HTML) of the current page

        // Navigation
        driver.navigate().back(); // Navigates back to the previous page
        driver.navigate().forward(); // Navigates forward to the next page
        driver.navigate().refresh(); // Refreshes the current page

        // Locating Elements
        WebElement fullName = driver.findElement(By.id("userName")); // Locates the element with id "userName"
        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[type=\"email\"]")); // Locates the email input element by CSS selector
        WebElement currentAdress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]")); // Locates the input element for current address by CSS selector
        WebElement permanentAdress = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")); // Locates the permanent address textarea using XPath
        WebElement submitButton = driver.findElement(By.id("submit")); // Locates the submit button by id
    }
}
