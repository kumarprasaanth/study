package case4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class case45 {
	 WebDriver driver;
	@Given("page")
	public void page() {
		System.setProperty("webdriver.chrome.driver","C:\\kprasaanth\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("enter product name {string}")
	public void enter_product_name(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@And("click find element")
	public void click_find_element() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("click add to cart")
	public void click_add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    Assert.assertEquals(driver.getTitle(),"Login");
	}

}
