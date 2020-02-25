package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	
	
	
	
	
	
WebDriver driver;
public Pageobject(WebDriver driver){
	this.driver=driver;
}
@FindBy(name="username") WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(id="tdb1") WebElement button;
@FindBy(linkText="Online Catalog") WebElement online;
@FindBy(linkText="create an account") WebElement account;
@FindBy(name="gender") WebElement gender1;
@FindBy(name="firstname") WebElement first;
@FindBy(name="lastname") WebElement last;
@FindBy(name="dob") WebElement dob1;
@FindBy(name="email_address") WebElement email;
@FindBy(name="company") WebElement company1;
@FindBy(name="street_address") WebElement street;
@FindBy(name="suburb") WebElement suburb1;
@FindBy(name="postcode") WebElement post1;
@FindBy(name="city") WebElement city1;
@FindBy(name="state") WebElement state1;
@FindBy(name="country") WebElement country1;
@FindBy(name="telephone") WebElement telephone1;
@FindBy(name="fax") WebElement fax1;
@FindBy(name="newsletter") WebElement letter;
@FindBy(name="password") WebElement pass1;
@FindBy(name="confirmation") WebElement confir1;
@FindBy(id="tdb4") WebElement button1;
public void Gcrit(String Uname,String pwd,String first1,String last1,String dob2,String email1,String company2,String street1,String suburb2,String post2,String city2, String state2,String country2,String telephone2,String fax2,String pass2,String confir2){
	user.sendKeys(Uname);
	pass.sendKeys(pwd);
	button.click();
	online.click();
	account.click();
	first.sendKeys(first1);
	last.sendKeys(last1);
	dob1.sendKeys(dob2);
	email.sendKeys(email1);
	company1.sendKeys(company2);
	street.sendKeys(street1);
	suburb1.sendKeys(suburb2);
	post1.sendKeys(post2);
	city1.sendKeys(city2);
	state1.sendKeys(state2);
	country1.sendKeys(country2);
	telephone1.sendKeys(telephone2);
	fax1.sendKeys(fax2);
	letter.click();
	pass1.sendKeys(pass2);
	confir1.sendKeys(confir2);
	button1.click();
	
	
}


}
