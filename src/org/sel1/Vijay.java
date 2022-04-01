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
			System.out.println("Balan");
			System.out.println("Vijay");
					
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		
		System.out.println("Partial Path for Help is - '//a[contains(@title,'Help')]\'");
		
		String printUsername = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(printUsername);
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.id("bank"));
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des1 = driver.findElement(By.id("amt7"));
		
		WebElement srcsales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dessales = driver.findElement(By.id("loan"));
		
		WebElement dessales1 = driver.findElement(By.id("amt8"));
		
		
				
		
		
		
		
		
		
	}
}
