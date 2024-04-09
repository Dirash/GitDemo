package selinium;

import java.time.Duration;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class newpackage {
	
   public static void main(String[] args) {
	   
	   //giving path of chrome driver this line is no need from 4.6.0
	   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARDirash\\chromedriver_win32\\chromedriver.exe");
	  
	   //creating a driver	
	   WebDriver driver=new ChromeDriver();
	  
	   // maximise the window
	   driver.manage().window().maximize();
	   
	   //adding durations
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));	
	   
	   //open any browser on the chrome
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 
	   //get the title
	   System.out.println(driver.getTitle());
	
	   //validating the broswer url
	   System.out.println(driver.getCurrentUrl());
	   
	   //entering username and password
	   driver.findElement(By.id("inputUsername")).sendKeys("admin");
	   driver.findElement(By.name("inputPassword")).sendKeys("123456");
	  
	   ///clicking the send
	   driver.findElement(By.className("signInBtn")).click();
	   
	   // displaing incorrect password and name
	  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	  
	  //displaying the link locator
	  driver.findElement(By.linkText("Forgot your password?")).click();
	  
	  //using css selector syntax
	  driver.findElement(By.cssSelector("input[placeholder='Name'])")).sendKeys("name");
	  
	  //using xpath selector syntax
	  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dir@gmail");
	  
	  //using xpath for having same 3 attribute
	  driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("dir@email");
	  
	  //using cssselector for having same 3 attribute
	  driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("mail");
	  
	  //usinf xpath to find the child(parent child traverse)	
	  driver.findElement(By.xpath("//div/span/input[1]")).click();
	  driver.findElement(By.xpath("//div/span[2]/input[1]")).click();
	  
	  //usinf regular expressions
	  driver.findElement(By.xpath("//input[contains(@value,'rmbr')]")).click();
	  driver.findElement(By.cssSelector("input[value*='agree']")).click();
	  
	  //this is used when there is only one tag in the code
	   System.out.println(driver.findElement(By.tagName("p")).getText());
	   
	  // used to compare two values	 
	  Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
      Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello Dirash,");
	


	   
}

}
