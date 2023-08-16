package week5.day1.program1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiPath {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://uibank.uipath.com/register-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bommi");
	WebElement title=driver.findElement(By.xpath("//select[@id='title']"));
	Select titledd=new Select(title);
	titledd.selectByVisibleText("Ms");
	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("N");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Natarajan");
	WebElement gender=driver.findElement(By.id("sex"));
	Select genderdd=new Select(gender);
	genderdd.selectByVisibleText("Female");
	WebElement employ=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
	Select employdd=new Select(employ);
	employdd.selectByVisibleText("Full-time");
	driver.findElement(By.id("username")).sendKeys("moni");
	driver.findElement(By.id("email")).sendKeys("moni@gmail.com");
	driver.findElement(By.id("password")).sendKeys("bomminini");
	driver.close();
	
}
}
