package sheet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Paper {

	   @Test(dataProvider ="datas",dataProviderClass = Wastepaper.class)
		
		public void ab(String Username, CharSequence[] Password) throws Throwable {
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://empirehome.myprojectsonline.co.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.name("emailid")).sendKeys(Username);
			driver.findElement(By.id("pword")).sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();


	   }
}
