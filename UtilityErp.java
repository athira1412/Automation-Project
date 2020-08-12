package utilitypackage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class UtilityErp {
	public static  WebDriver driver;
	JavascriptExecutor js;
    FileInputStream obj;
    XSSFWorkbook book;
    XSSFSheet objsheet;
    XSSFRow row;
    XSSFCell cell;
	public WebDriver utility(String url, String browser)
	{
		switch(browser)
		{
		case "ie":
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_3.150.1.exe");
			 driver=new InternetExplorerDriver();
			 driver.manage().window().maximize();//fullscreen
		    driver.get(url);	
		
		case "chrome":
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();//fullscreen
	    driver.get(url);
		}
	    return driver;
	} 
	public void clickInterceptedException(By property) 
	{
	driver.findElement(property).click();
    }
	public void sendkeys(By property,String value) //sendKeys
	{
	driver.findElement(property).sendKeys(value);
	}
	public void implicitywait() //wait
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public String ReadExcel(int r, int c) throws IOException
	{
		String Value="";
		obj = new FileInputStream("C:\\Users\\Athira\\Desktop\\Book1erp.xlsx");
		 book = new XSSFWorkbook(obj);
		 objsheet = book.getSheet("Sheet1");
		 row = objsheet.getRow(r);	
		 cell = row.getCell(c);
		 CellType type = cell.getCellType();
		 if (type == CellType.NUMERIC) {
			 double Value1 = cell.getNumericCellValue();
			 String str = String.valueOf(Value1);
			 return str;
		 }
		 else if (type == CellType.STRING) {
			 Value = cell.getStringCellValue();
		 }
		 return Value;
	

		
		
}
	public static void handleSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
	
}
