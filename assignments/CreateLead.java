package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demoSalesManager");
		String text = user.getText();
		System.out.println(text);

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		WebElement compname = driver.findElement(By.id("createLeadForm_companyName"));
		compname.sendKeys("Testleaf");

		WebElement fstname = driver.findElement(By.id("createLeadForm_firstName"));
		fstname.sendKeys("shri");

		WebElement lstname = driver.findElement(By.id("createLeadForm_lastName"));
		lstname.sendKeys("Sh");

		WebElement localname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localname.sendKeys("local");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876765456");

		WebElement dep = driver.findElement(By.id("createLeadForm_departmentName"));
		dep.sendKeys("chem");

		WebElement desp = driver.findElement(By.id("createLeadForm_description"));
		desp.sendKeys("local");

		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("xyz@gmail.com");

		
		  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		  
		  Select dd = new Select(source);
		  
		  dd.selectByIndex(2);
		  
		  WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select md = new Select(market);
		// md.selectByIndex(3);
		md.selectByVisibleText("Car and Driver");

		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

	}

}
