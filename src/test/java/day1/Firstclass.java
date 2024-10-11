package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Firstclass {
public static void main(String [] args)
{ try {
	
	WebDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in");
	    
	  driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	  WebElement element=null;
	  element=driver.findElement(By.id("twotabsearchtextbox"));
	  element.sendKeys("i phone");
	  Thread.sleep(3000);
	  
	  element=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div[1]"));
	  element.click();
	  Thread.sleep(3000);
	  
	  element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	  String title=element.getText();
	  System.out.println(title);
	  Thread.sleep(3000);
	  
	  element= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]"));
	  String price=element.getText();
	  System.out.println("\n"+price);
	  
	  Thread.sleep(3000);
	  element= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[4]/div/div/div[1]/span/div/span/span/button"));
	  element.click();
	  System.out.println("\n add to cart");
	  Thread.sleep(3000);
	  
	  element= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]"));
	  element.click();
	  System.out.println("\n cart page");
	  Thread.sleep(3000);
	  
            



}
		catch(Exception obj) {
			obj.printStackTrace();
			
		}
	
}
}