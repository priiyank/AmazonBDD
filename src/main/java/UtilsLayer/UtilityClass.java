

	
	package UtilsLayer;

	import java.util.List;


	import org.openqa.selenium.WebElement;

	import BaseLayer.BaseClass;

	public class UtilityClass  extends BaseClass{

		public static void click(WebElement wb)
		{
			if(wb.isDisplayed()&& wb.isEnabled())
			{
				wb.click();
			}
		}
		
		public static void sendKeys(WebElement wb,String value)
		{
			if(wb.isDisplayed()&& wb.isEnabled())
			{
				wb.sendKeys(value);
			}
			
		}
		
		public static String captureText(WebElement wb)
		{
			
			return wb.getText();
			
			}
		
	
		public static void selectFromMultiple(List<WebElement>wb,String value)
		{
			for(WebElement a:wb)
			{
				if(a.getText().equalsIgnoreCase(value))
				{
					a.click();
					break;
				}
			}
		}
		
		
	}

