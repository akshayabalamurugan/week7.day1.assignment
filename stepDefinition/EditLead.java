package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditLead extends BaseClass {
	
	@And ("click on find lead link")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();	
	}
	
	@And ("enter first name as (.*)$")
	public void enterNameinFindLead(String firstName) {
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys(firstName);
	}
	
	@And ("click find leads button")
	public void findLeads(){
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And ("click on the first resulting lead")
	public void selectLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();	
	}
	@And ("click on edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@And ("change the company name as (.*)$")
	public void updateCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And ("click on update button")
	public void updateLead() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then ("verify whether the lead is updated")
	public void verifyUpdates() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (companyName.contains(companyName)) {
			System.out.println("The company name is updated");
		}
		else {
			System.out.println("The company name is not updated");
		}
	}
}
