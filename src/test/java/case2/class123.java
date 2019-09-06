package case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
  
public class class123 {
	 WebDriver driver;
	@Given("homepage")
	public void homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\kprasaanth\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().window().maximize();
	    
	    
	}

	@When("user enter {string}")
	public void user_enters1(String string) {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
	   
	}

	@Then("user enters {string}")
	public void user_enters(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	   
	}

}
