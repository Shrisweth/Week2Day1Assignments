package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		


				ChromeDriver driver = new ChromeDriver();

				driver.get("http://leaftaps.com/opentaps/control/login");

				driver.manage().window().maximize();
				Thread.sleep(3000);

				WebElement user = driver.findElement(By.id("username"));
				user.sendKeys("demoSalesManager");

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
				
				
				WebElement edit = driver.findElement(By.linkText("Edit"));
				
				String text = edit.getText();
				System.out.println(text);
				edit.click();
				
		driver.findElement(By.id("updateLeadForm_description")).clear();			
				driver.findElement(By.name("importantNote")).sendKeys("Important note");
				
				WebElement update = driver.findElement(By.className("smallSubmit"));
				
				String upvalue = update.getAttribute("value");
System.out.println(upvalue);
update.click();


System.out.println(driver.getTitle());









			}

		

		
		
	}


