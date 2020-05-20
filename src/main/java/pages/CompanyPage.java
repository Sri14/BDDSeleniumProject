package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class CompanyPage extends TestBase {

	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement Company;
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement NewCompany;
	
	@FindBy(xpath = "//div[@class='ui right corner labeled input']" + " //input[@autocomplete='new-password']")
	WebElement CompanyNameFeild;	

	public  void CompanyButton() {
		//driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		
		Company.click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		
	}

	public  void NewButton() {
		//driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		NewCompany.click();
	}
	
	public  void NewCompanyDeatils() {
//		driver.findElement(
//				By.xpath("//div[@class='ui right corner labeled input']" + " //input[@autocomplete='new-password']"))
//				.sendKeys("Company Name");
//		
		CompanyNameFeild.sendKeys("Caksjhas");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Address");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("City");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description");
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
	}

}
