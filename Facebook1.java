package week5.day1.program1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monisha");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7397232614");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Moni07122001@");
		WebElement day=driver.findElement(By.id("day"));
		Select daydd=new Select(day);
		daydd.selectByValue("7");
		WebElement date=driver.findElement(By.id("month"));
		Select datedd=new Select(date);
		datedd.selectByVisibleText("Dec");
		WebElement year=driver.findElement(By.id("year"));
		Select yeardd=new Select(year);
		yeardd.selectByValue("2001");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
	}
}
