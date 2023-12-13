

	
	package StepDefination;

	import java.util.Set;


import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import PageLayer.SearchPage;
import UtilsLayer.WindowHandles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class RegisterPageStep extends BaseClass{
		
		public static SearchPage Search;
		public static RegisterPage resiter;
		public static Set<String>s;
		
		@Given("User open the appllication")
		public void user_open_the_appllication() {
			
			BaseClass.initialization();
		}

		@When("user search iphone product and click on Iphone15 Pro Max")
		public void user_search_iphone_product_and_click_on_iphone15_pro_max() {

	    Search=new SearchPage();
	    Search.SearchButton();
	    Search.EnterProduct("iphone15promax");
	    Search.ClickOnSearchButton();
	        
		}

		@Then("User Select Iphone15 Pro Max Natural titanium")
		public void user_select_iphone15_pro_max_natural_titanium() {
			
			Search.ClickOnProduct();
		
		}

		@Then("User Captured the price of the iphone")
		public void user_captured_the_price_of_the_iphone() {
	      
		 
		  s=(Set<String>) WindowHandles.handleWindow();
	      Search.capturePrice();
			
			
			
			
		}

		@Then("Click on add to cart and then click on proceed to checkout")
		public void click_on_add_to_cart_and_then_click_on_proceed_to_checkout() {
		
		    Search.AddToCart();
		    Search.proceedCheckout();
		    
		}


		@Then("Click on create new account button")
		public void click_on_create_new_account_button() {
		   
		resiter=new RegisterPage();
		resiter.ClickOnCreateAccount();
		}
		@Then("user enter {string} ,{string},{string}")
		public void user_enter(String Firstname, String mobileno, String Password) {
		   
		  resiter.addDetails(Firstname, mobileno, Password);
		}
	
		@Then("click on verify mobile number")
		public void click_on_verify_mobile_number() {
		    resiter.verifyNumber();
		}

	}

