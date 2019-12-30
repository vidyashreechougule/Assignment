package com.Automation_Assignments.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class IphoneCostOnAmezon 
{
	static String costonAmezon=null; static String costonFlipcart=null;

	static WebDriver oBrowser=null;
	static projectpom oPage=null;

	@BeforeClass
	static void launchBrowser()
	{
		String path=null;

		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			oPage=new projectpom(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=1)
	static void navigatetoAmezon()
	{
		try
		{
			oBrowser.get(" https://www.amazon.in");
			Thread.sleep(5000);
			oPage.search_bar().click();
			oPage.search_bar().sendKeys("iPhone XR (64GB) - Yellow");
			oPage.serachbutton_Amezon().click();

			//oPage.Apple_iPhone_XR_Yellow_on_Amezon();
			costonAmezon= oPage.priceOfIphone_onAmezon().getText().toString();
			System.out.println(costonAmezon);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void navigatetoFlipkart()
	{ 
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(4000);
			oPage.close_Login().click();
			oPage.searchField_on_Flipcart().click();
			oPage.searchField_on_Flipcart().sendKeys("iPhone XR (64GB) - Yellow");
			oPage.serachbutton_Flipcart().click();
			//oPage.Apple_iPhone_XR_Yellow_on_Flipcart().click();
			costonFlipcart=oPage.priceOfIphoneOn_Flipcart().getText().toString();
			System.out.println(costonFlipcart);

			List<String> list = new ArrayList<String>();
			list.add(costonAmezon);  
			list.add(costonFlipcart); 
			System.out.println("Max val: " + Collections.min(list,null));   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 

	@Test(priority=3)
	static void tripAdvisor()
	{
		try 
		{
			oBrowser.get("https://www.tripadvisor.in/");
			Thread.sleep(5000);
			oPage.search_tripadvisor().click();
			Thread.sleep(2000);
			
			oPage.mainSearch().click();
			oPage.mainSearch().sendKeys("Club Mahindra");

			
			Actions action=new Actions(oBrowser);
			WebElement Club=	oPage.Club_Mahendra_Madikeri_Coorg_home();
			action.moveToElement((WebElement) Club).click().perform();
			Thread.sleep(5000);

			Actions action1=new Actions(oBrowser);
			WebElement writereview=	oPage.write_A_Review();
			action1.moveToElement((WebElement) writereview).click();
			Thread.sleep(5000);
			
			WebElement ratings=	(WebElement)	oPage.overall_Ratings();
			Actions overallratings=new Actions((WebDriver) ratings);
			overallratings.moveToElement((WebElement) ratings).click();
			oPage.Title_of_your_review().sendKeys("Great service");
			oPage.your_Review().sendKeys("Good service");

			WebElement hotelservice =oPage.Hotel_Ratings_Service();

			action.moveToElement(hotelservice).click().perform();

			WebElement hotelValue =oPage.Hotel_Ratings_Value();

			action.moveToElement(hotelValue).click().perform();


			WebElement hotelrooms =oPage.Hotel_Ratings_Rooms();

			action.moveToElement(hotelrooms).click().perform();

			oPage.submit_Your_Review().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@AfterClass
	static void closeBrowser()
	{
		oBrowser.quit();
	}
}

