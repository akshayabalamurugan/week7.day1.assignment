package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLeaftabs extends BaseClass {
	
	@Given ("Enter the username as {string}")
	public void typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And ("Enter the password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When ("click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
	
	@Then ("verify homepage is displayed")
	public void verifyLogin() {
		WebElement logout=driver.findElement(By.className("decorativeSubmit"));
		String attribute=logout.getAttribute("value");
		if (attribute.equals("Logout")) {
			System.out.println("The page is logged in successfully");
		}
		else {
			System.out.println("Login is failed");
		}
	}
	
	@But("verify error message is displayed")
	public void verifyError() {
		String text = driver.findElement(By.xpath("(//div[@id='errorDiv']/p)[2]")).getText();
		if(text.contains("User not found")) {
			System.out.println("Error message is displayed");
		}
	}

}
