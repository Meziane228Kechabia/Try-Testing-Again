package com.Try_Testing_Again;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown_Exercice {
	public DropDown_Exercice() throws Exception {
		super();
	}
	WebDriver driver;
	ChromeOptions options;
	
	


	public static void main (String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    options.addArguments("--disable-geolocation");
	    options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		//WebElement createNewAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		//createNewAccountButton.click();
		driver.findElement(By.linkText("Create new account")).click();		
		//createNewAccountButton.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aziz");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Boutef");
		Select monthDropdown = new Select(driver.findElement(By.id("month")));
		Select dayDropdown = new Select(driver.findElement(By.id("day")));
		Select yearDropdown = new Select(driver.findElement(By.id("year")));
		monthDropdown.selectByValue("11");
		dayDropdown.selectByValue("19");
		yearDropdown.selectByValue("1973");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='reg_email__']"))).sendKeys("571 465 6756");
		//phoneField.sendKeys("510 546 0793");
		driver.findElement(By.xpath("//input[@id='password_step_input' and @type='password']")).sendKeys("USA2025");
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement signUp = waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign Up']")));
		//signUp.click();
		//The precedent 2 lignes of code could be replaced by one single ligne as in the following:
		waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign Up']"))).click();
		driver.findElement(By.xpath("//button[@type='submit' and @id='u_0_n_9s']")).click();
	}
	public void tearDown() {
		
		driver.quit();
	}
}
