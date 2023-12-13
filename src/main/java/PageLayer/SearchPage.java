

	
	package PageLayer;

	import java.util.Set;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import  UtilsLayer.UtilityClass.*;

	import BaseLayer.BaseClass;
	import UtilsLayer.UtilityClass;
import UtilsLayer.WindowHandles;

	public class SearchPage extends BaseClass{
		
		@FindBy(id="twotabsearchtextbox")
		private WebElement SearchBox;
		
		@FindBy(id="twotabsearchtextbox")
		private WebElement SearchBox1;
		
		@FindBy(id="nav-search-submit-button")
		private WebElement SearchButton;
		
		@FindBy(xpath=("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"))
		private WebElement ClickOnProduct;
		
		@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")
		private WebElement CapturePrice;
		
		@FindBy(name="submit.add-to-cart")
		private WebElement AddToCart;
		
		@FindBy(name="attach-sidesheet-checkout-button")
		private WebElement ProccedToCheckout;
		
		
		public SearchPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	   public void SearchButton()  
	   {
		   UtilityClass.click(SearchBox);
	   }
	   
	   public void EnterProduct(String Sbox)
	   {
		   UtilityClass.sendKeys(SearchBox1,Sbox);
		   
	   }
		
		public void ClickOnSearchButton()
		{
			UtilityClass.click(SearchButton);
		}
		
		public void ClickOnProduct()
		
		{
			UtilityClass.click(ClickOnProduct);
		}
		public void capturePrice()
		{
			UtilityClass.captureText(CapturePrice);
		}
		
		public void AddToCart()
		{
			UtilityClass.click(AddToCart);
			
		}

		public void proceedCheckout()
		{
			
			UtilityClass.click(ProccedToCheckout);
		}
		
	
		
		
	}

