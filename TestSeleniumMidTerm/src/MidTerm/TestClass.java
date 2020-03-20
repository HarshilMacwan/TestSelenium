package MidTerm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{	
	 public static void main(String[] args){
	        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/login.html");

	        WebElement email=driver.findElement(By.id("email"));
	        WebElement password=driver.findElement(By.id("passwd"));
	        WebElement login=driver.findElement(By.id("SubmitLogin"));

	        email.sendKeys("hmacwan@gmail.com");
	        password.sendKeys("Password@123");
	        login.submit();
	        String title="Login Page";
	        String actualTitle="";

	        if(actualTitle.contentEquals(title))
	        {
	            System.out.println("login failed");
	        }
	        else
	        {
	            System.out.println("successfully log in using email and password");
	        }

	    }

}
