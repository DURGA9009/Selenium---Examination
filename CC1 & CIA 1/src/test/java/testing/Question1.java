
package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Question1 {
	public static void main( String[] args ) throws InterruptedException

    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        if (cartCount.equals("1")) {
        	System.out.println("TestCase 1  :  Successfully Added To Cart");
        }
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String product = "Sauce Labs Backpack";
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText().equals(product));
        {
        	System.out.println("Testcase 2  :  Cart Can Be Viewed By The User");
        	
        }
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Your Information")) {
        	System.out.println("Testcase 3  :  Address Form Is Displayed");
        }
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("DURGA ");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("V");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("641042");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Overview")) {
        	System.out.println("Testcase 4  :  Overview Of The Product Is Displayed ");
        }
        System.out.println("Testcase 5  :  Name Of The Added Product : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Testcase 6  :  Price Of The Added Product : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        if(driver.getTitle().equals("Swag Labs")) {
        	System.out.println("Testcase 7  :  Website's Title is SWAG LABS ");
        }
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
        	System.out.println("Testcase 8  :  URL Is Asserted With The Provided Link");
        }
    } 
}

