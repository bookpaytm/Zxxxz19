package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import com.beust.jcommander.Parameter;

import Utilities.Browserfactory;
import Utilities.Configuredataprovider;
import Utilities.Exceldataprovider;
import Utilities.Helper;



public class Baseclass {
public WebDriver driver;
public Exceldataprovider excel;
public Configuredataprovider config;
public ExtentReports report;
public ExtentTest logger;

@BeforeSuite
public void setsuite(){
	excel=new Exceldataprovider();
	config=new Configuredataprovider();
	report=new ExtentReports();
ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/salman.html"));
	report.attachReporter(extent);
	
}
@Parameters("browser")
@BeforeClass
public void setup(String browser){
driver=Browserfactory.startapplication(driver, browser, config.getappurl());
}
@AfterClass
public void shutdown(){
	Browserfactory.quitbrowser(driver);
}
@AfterMethod
public void CurrentFormatDateTime(ITestResult result) throws IOException{
if(result.getStatus()==ITestResult.SUCCESS){
logger.pass("test case is pass", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CapturedScreenshots(driver)).build());

}
else if(result.getStatus()==ITestResult.FAILURE){
logger.fail("test case is fail", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CapturedScreenshots(driver)).build());

}
else if(result.getStatus()==ITestResult.SKIP){
logger.info("test case is skip", MediaEntityBuilder.createScreenCaptureFromPath(Helper.CapturedScreenshots(driver)).build());
}
else{
System.out.println("test case is success");
}
report.flush();
}

}
