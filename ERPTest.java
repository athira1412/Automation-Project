package erppackage;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilitypackage.UtilityErp;


public class ERPTest {
	static WebDriver driver;
	UtilityErp obj;
	JavascriptExecutor js;
	UtilityErp read = new UtilityErp();
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 0, enabled=true)
	public void LoginPage() throws InterruptedException, IOException {
		WebElement Username = driver.findElement(By.id("loginform-username"));
		Username.sendKeys(read.ReadExcel(0, 0));
		WebElement Password = driver.findElement(By.id("loginform-password"));
		Password.sendKeys(read.ReadExcel(1, 0));
		UtilityErp.handleSleep(6000);
		WebElement Login = driver.findElement(By.xpath("//*[@name='login-button']"));
		Login.click();
		UtilityErp.handleSleep(6000);
		
	}
	@Test(priority= 1, enabled = true)
	public void EmployeePage() throws InterruptedException {
		WebElement Employees = driver.findElement(By.xpath("//*[@title='Employees']"));
		Employees.click();
		Thread.sleep(3000);
		WebElement Employee = driver.findElement(By.xpath("//*[@href='/erp/employees']"));
		Employee.click();
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.name("WorkerSearch[first_name]"));
		FirstName.sendKeys("sagar", Keys.ENTER);
		Thread.sleep(3000);
			}
	@Test(priority = 2, enabled = true)
	public void CreateEmployeePage() throws InterruptedException{
	WebElement CreateEmployee = driver.findElement(By.xpath("//*[@href='/erp/employee/create']"));
	CreateEmployee.click();
	Thread.sleep(3000);
	WebElement FirstName = driver.findElement(By.name("Worker[first_name]"));
	FirstName.sendKeys("tyh");
	Thread.sleep(3000);
	WebElement MiddleName = driver.findElement(By.name("Worker[middle_name]"));
	MiddleName.sendKeys("o");
	Thread.sleep(3000);
	WebElement LastName = driver.findElement(By.name("Worker[last_name]"));
	LastName.sendKeys("Sh");
	Thread.sleep(3000);
	WebElement FatherName = driver.findElement(By.id("worker-father_name"));
	FatherName.sendKeys("R");
	Thread.sleep(3000);
	WebElement Gender = driver.findElement(By.xpath("//input[@value='1']"));
	Gender.click();
	Thread.sleep(3000);
	WebElement MartialStatus=driver.findElement(By.id("worker-marital_status"));
	  MartialStatus.click();
	  Thread.sleep(3000);
	  Select Married = new Select(MartialStatus);
	  Married.selectByValue("married");
	  Thread.sleep(3000);
	  WebElement CurrentAddress1= driver.findElement(By.xpath("//*[@id='worker-current_address1']"));
	  CurrentAddress1.sendKeys("Dipi House, Central Banglore");
	  Thread.sleep(3000);
	  WebElement CurrentAddress2= driver.findElement(By.xpath("//*[@id='worker-current_address2']"));
	  CurrentAddress2.sendKeys(" Banglore");
	  Thread.sleep(3000);
	  WebElement CurrentPostcode= driver.findElement(By.xpath("//*[@id='worker-current_postcode']"));
	  CurrentPostcode.sendKeys("6547321");
	  Thread.sleep(3000);
	  WebElement CurrentDistrict= driver.findElement(By.xpath("//*[@id='worker-current_district']"));
	  CurrentDistrict.sendKeys("Karnataka");
	  Thread.sleep(3000);
	  WebElement CurrentState= driver.findElement(By.xpath("//*[@id='worker-current_state']"));
	  CurrentState.sendKeys("India");
	  Thread.sleep(3000);
	  WebElement PermanentAddress1= driver.findElement(By.name("Worker[permanent_address1]"));
	  PermanentAddress1.sendKeys("Dipi House, Central Banglore");
	  Thread.sleep(3000);
	  WebElement PermanentAddress2= driver.findElement(By.name("Worker[permanent_address2]"));
	  PermanentAddress2.sendKeys(" Banglore");
	  Thread.sleep(3000);
	  WebElement PermanentPostcode= driver.findElement(By.name("Worker[permanent_postcode]"));
	  PermanentPostcode.sendKeys("6547321");
	  Thread.sleep(3000);
	  WebElement PermanentDistrict= driver.findElement(By.name("Worker[permanent_district]"));
	  PermanentDistrict.sendKeys("Karnataka");
	  Thread.sleep(3000);
	  WebElement PermanentState= driver.findElement(By.name("Worker[permanent_state]"));
	  PermanentState.sendKeys("India");
	  Thread.sleep(3000);
	  WebElement DateOfBirth= driver.findElement(By.id("worker-dob"));
	  DateOfBirth.click();
	  Thread.sleep(3000);
	  WebElement DatePicker= driver.findElement(By.name("Worker[dob]"));
	  DatePicker.clear(); 
	  DatePicker.sendKeys("18-02-1992");
	  Thread.sleep(3000);
	  WebElement Nominee= driver.findElement(By.id("worker-nominee"));
	  Nominee.sendKeys("Karan");
	  Thread.sleep(3000);
	  WebElement NomineeRelation= driver.findElement(By.name("Worker[nominee_relation]"));
	  NomineeRelation.sendKeys("Husband");
	  Thread.sleep(3000);
	  WebElement PoliceStation= driver.findElement(By.id("worker-police"));
	  PoliceStation.sendKeys("Banglore");
	  Thread.sleep(3000);
	  WebElement BloodGroup= driver.findElement(By.id("worker-blood_group"));
	  BloodGroup.click();
	  Thread.sleep(3000);
	  Select Blood = new Select(BloodGroup);
	  Blood.selectByVisibleText("A+");
	  Thread.sleep(3000);
	  WebElement Mobile= driver.findElement(By.xpath("//*[@id='worker-mobile']"));
	  Mobile.sendKeys("9303020500");
	  Thread.sleep(3000);
	  WebElement Experience= driver.findElement(By.xpath("//*[@id='worker-experience']"));
	  Experience.sendKeys("4 Years as Software Tester");
	  Thread.sleep(3000);
	  WebElement JoinDate= driver.findElement(By.id("worker-doj"));
	  JoinDate.clear(); 
	  JoinDate.sendKeys("02-08-2020");
	  Thread.sleep(3000);
	  WebElement EmployeeType= driver.findElement(By.xpath("//*[@id='worker-emp_type']"));
	  //js= (JavascriptExecutor)driver;
	 // js.executeScript("arguments[0].click", EmployeeType);
	 // Assert.assertTrue(ExpectedConditions.titleContains("Employee Type").apply(driver).booleanValue());
	  Select Type = new Select(EmployeeType);
	  Type.selectByVisibleText("Semi Skilled");
	  Thread.sleep(3000);
	  WebElement Designation= driver.findElement(By.xpath("//*[@id='worker-designation']"));
	  Select Type1 = new Select(Designation);
	  Type1.selectByVisibleText("hr");
	  Thread.sleep(3000);
	  WebElement Department= driver.findElement(By.xpath("//*[@id='worker-department']"));
	  Select Type2 = new Select(Department);
	  Type2.selectByVisibleText("IT");
	  Thread.sleep(3000);
	  WebElement EmpCode= driver.findElement(By.id("worker-emp_code"));
	  EmpCode.sendKeys("EMP003020");
	  Thread.sleep(3000);
	  WebElement UAN= driver.findElement(By.id("worker-uan"));
	  UAN.sendKeys("08002002512345");
	  Thread.sleep(3000);
	  WebElement ESI= driver.findElement(By.id("worker-esi"));
	  ESI.sendKeys("450000");
	  Thread.sleep(3000);
	  WebElement MonthlyRate= driver.findElement(By.id("worker-monthly_rate"));
	  MonthlyRate.sendKeys("32000");
	  Thread.sleep(3000);
	  WebElement WorkingDay= driver.findElement(By.xpath("//*[@id='worker-working_day']"));
	  Select Days = new Select(WorkingDay);
	  Days.selectByVisibleText("26");
	  Thread.sleep(3000);
	  WebElement ActualRate= driver.findElement(By.id("worker-actual_rate"));
	  ActualRate.sendKeys("32500");
	  Thread.sleep(3000);
	  WebElement CheckBox = driver.findElement(By.xpath("//*[@id='worker-inter_state']"));
	  CheckBox.click();
	  Thread.sleep(3000);
	  WebElement Status = driver.findElement(By.id("worker-status"));
	  Status.click();
	  Thread.sleep(3000);
	  //WebElement Save = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[4]/div[2]/div/button"));
	 // Save.click();
	// Thread.sleep(3000);
	  }
	@Test(priority= 3, enabled = true)
	public void LoanPage() throws InterruptedException {
		WebElement Loans = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]"));
		Loans.click();
		Thread.sleep(3000);
		WebElement ViewLoan = driver.findElement(By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[10]/a"));
		ViewLoan.click();
		Thread.sleep(3000);
		}
	@Test(priority= 4, enabled = true)
	public void DeductionPage() throws InterruptedException {
		WebElement Deduction= driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]"));
		Deduction.click();
		Thread.sleep(3000);
		WebElement UpdateDeduction= driver.findElement(By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[7]/a[2]"));
		UpdateDeduction.click();
		WebElement UpdateDeductionType= driver.findElement(By.xpath("//*[@id='deduction-type']"));
		UpdateDeductionType.clear();
		UpdateDeductionType.sendKeys("Travel Allowance");
		WebElement UpdateDeductionAmount= driver.findElement(By.xpath("//*[@id='deduction-amount']"));
		UpdateDeductionAmount.clear();
		UpdateDeductionAmount.sendKeys("500");
		WebElement DeductDate= driver.findElement(By.xpath("//*[@id='deduction-effective_from']"));
		  DeductDate.clear(); 
		  DeductDate.sendKeys("17-08-2020");
		  Thread.sleep(3000);
		WebElement Save = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/button"));
		 Save.click();
		Thread.sleep(3000);
		}
	@Test(priority= 5, enabled = true)
	public void ShiftReportPage() throws InterruptedException {
		WebElement ShiftReport= driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[11]/a"));
		ShiftReport.click();
		WebElement ShiftReportDownload= driver.findElement(By.xpath("//*[@id='w1-xlsx']"));
		  ShiftReportDownload.click(); 
		 Thread.sleep(30000);
	}
	@Test(priority=6, enabled = true)
	public void LogoutPage() throws InterruptedException, AWTException {
		WebElement Profile = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[8]/a"));
		Profile.click();
		WebElement Logout = driver.findElement(By.xpath("//*[@class='logout-btn']"));
		Logout.click();	
	}
	 
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		obj = new UtilityErp();
		driver = obj.utility("http://qabible.in/erp/login", "chrome");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}