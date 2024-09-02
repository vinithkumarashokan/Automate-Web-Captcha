package captchaAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaptcha {
	static WebDriver driver;
	
@Test	
public void captchaAutomate() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
	WebElement element = driver.findElement(By.xpath("//label[@id='ebcaptchatext']"));
	String str = element.getText();
	//math captcha
	String s1 = str.substring(8,9);
	String s2 = str.substring(12,13);
	
	Integer i1 = Integer.valueOf(s1);
	Integer i2 = Integer.valueOf(s2);
	
	System.out.println("No1:"+i1+"No2:"+i2);
	Integer i= i1+i2;
	String ans = String.valueOf(i);
	
	WebElement element2 = driver.findElement(By.xpath("//input[@id='ebcaptchainput']"));
	element2.sendKeys(ans);
	
}

}
