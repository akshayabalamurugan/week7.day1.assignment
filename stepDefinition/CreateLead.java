package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CreateLead extends BaseClass {
	
	@Given("click on crm_sfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And ("click on leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And ("click on create lead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And ("type the company name as (.*)$")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And ("type the first name as (.*)$")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@And ("type the last name as (.*)$")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@And ("type the first name local as (.*)$")
	public void enterFirstNameLocal(String localName) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localName);
	}
	
	@And ("type the department name as (.*)$")
	public void enterDepartmentName(String departmentName) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(departmentName);
	}
	
	@And ("type the description as (.*)$")
	public void description(String description) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
	}
	
	@And ("type the email id as (.*)$")
	public void enterEmail(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	
	@And ("type the countrycode as (.*)$")
	public void enterCountryCode(String countryCode) {
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(countryCode);
	}
	
	@And ("type the areacode as (.*)$")
	public void enterAreaCode(String areaCode) {
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(areaCode);
	}
	
	@And ("type the phonenumber as (.*)$")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	}
	
	@And ("select the state as new york")
	public void selectState() {
		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1= new Select(state);
		state1.selectByVisibleText("New York");
	}
	
	@And ("click on createLead button")
	public void createLead() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then ("verify the successful lead creation")
	public void verifyLeadCreation() {
		String title=driver.getTitle();
		if (title.contains("iew Lead")) {
			System.out.println("The lead is created successfully");
		}
		else {
			System.out.println("The lead is not created successfully");
		}
	}
}
