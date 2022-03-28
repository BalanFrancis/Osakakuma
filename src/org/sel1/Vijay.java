package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vijay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Francis Balan\\eclipse-workspace\\TestSel1\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='email']"));
				
			txtUserName.sendKeys("BalanFrancis");

			
			
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		
		System.out.println("Partial Path for Help is - '//a[contains(@title,'Help')]\'");
		
		String printUsername = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(printUsername);
		driver.quit();
		
		
				
		
		
		
		
		
		
	}
}
