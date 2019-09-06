package case1.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class class2 {
	WebDriver driver;

@Given("Homepage of testmeapp")
public void homepage_of_testmeapp() {
	System.setProperty("webdriver.chrome.driver","C:\\kprasaanth\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/");
    driver.manage().window().maximize();
    
}

@And("signin option in homepage")
public void signin_option_in_homepage() {
	System.out.println("sigin option available");
  
}

@When("click on signin")
public void click_on_signin() {
	
   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
}

@And("username is entered as {string}")
public void username_is_entered_as(String string) {
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);

}

@And("firstname is entered as {string}")
public void firstname_is_entered_as(String string) {
	driver.findElement(By.id("firstName")).sendKeys(string);
  
}

@And("lastname is enteres as {string}")
public void lastname_is_enteres_as(String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);
   
}

@And("password is entered as {string}")
public void password_is_entered_as(String string) {
	driver.findElement(By.id("password")).sendKeys(string);
   
}

@And("confirm password is entered as {string}")
public void confirm_password_is_entered_as(String string) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(string);
}

@And("gender is selected as male")
public void gender_is_selected_as_male() {
	driver.findElement(By.xpath("//input[@value='Male']")).click();
  
}

@And("email id is {string}")
public void email_id_is(String string) {
	driver.findElement(By.id("emailAddress")).sendKeys(string);
   
}

@And("mobile number is {string}")
public void mobile_number_is(String string) {
	driver.findElement(By.id("mobileNumber")).sendKeys(string);
}

@And("DOB is {string}")
public void dob_is(String string) {
	driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);;

}

@And("address is {string}")
public void address_is(String string) {
	driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
   
}

@And("security question is {string}")
public void security_question_is(String string) {
	WebElement ques = driver.findElement(By.xpath("//select[@name='securityQuestion']"));
	Select sel=new Select(ques);
	sel.selectByIndex(2);
}

@And("answer is {string}")
public void answer_is(String string) {
	driver.findElement(By.xpath("//input[@name='answer']")).sendKeys(string);
   
}

@Then("click on register")
public void click_on_register() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("registration successful");
}


}
