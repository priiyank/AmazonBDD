
package PageLayer;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsLayer.UtilityClass;
import  UtilsLayer.UtilityClass.*;
import UtilsLayer.WindowHandles;
import BaseLayer.BaseClass;

	public class RegisterPage extends BaseClass {
		
		@FindBy(id="createAccountSubmit")
		private WebElement CreateAccount;
		

		@FindBy(id="ap_customer_name")
		private WebElement CName;
		

		@FindBy(id="ap_phone_number")
		private WebElement Phonenumber;
		
		
		@FindBy(id="ap_password")
		private WebElement Pass;
		
		@FindBy(id="continue")
		private WebElement VerifyPhoneNumber;
		
	 public RegisterPage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void ClickOnCreateAccount()
	 {
		UtilityClass.click(CreateAccount);
	 }
	 
	 public void addDetails(String fname,String pnumber,String pass)
	 {
		UtilityClass.click(CName); 
		UtilityClass.sendKeys(CName,fname);
		
		UtilityClass.click(Phonenumber); 
		UtilityClass.sendKeys(Phonenumber,pnumber);
		
		UtilityClass.click(Pass); 
		UtilityClass.sendKeys(Pass,pass);
			
	 }
	 
	 public void verifyNumber()
	 {
		 UtilityClass.click(VerifyPhoneNumber);	
	 }
	  
	 
	}

