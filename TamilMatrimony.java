package week5.day1.program1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement profile=driver.findElement(By.id("REGISTERED_BY"));
		Select profiledd=new Select(profile);
		profiledd.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("Monisha");
		driver.findElement(By.id("genderfemale")).click();
		WebElement date=driver.findElement(By.id("DOBDAY"));
		Select datedd=new Select(date);
		datedd.selectByValue("7");
		WebElement month=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select monthdd=new Select(month);
		monthdd.selectByVisibleText("Dec");
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select yeardd=new Select(year);
		yeardd.selectByValue("2001");
		WebElement religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select religiondd=new Select(religion);
		religiondd.selectByVisibleText("Hindu");
		WebElement mother=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select motherdd=new Select(mother);
		motherdd.selectByVisibleText("Tamil");
		WebElement country=driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select countrydd=new Select(country);
		countrydd.selectByVisibleText("India");
		WebElement countrycode=driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select countrycodedd=new Select(countrycode);
		countrycodedd.selectByVisibleText("+91");
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7397232614");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("moni@gmail.com");
		driver.close();
		
	}

}
