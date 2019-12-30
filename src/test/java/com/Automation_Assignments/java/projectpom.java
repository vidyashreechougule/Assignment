package com.Automation_Assignments.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectpom 
{
	public projectpom(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	private WebElement twotabsearchtextbox;
	public WebElement search_bar()
	{
		return twotabsearchtextbox;
	}
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement Apple_iPhone_XR_Yellow_on_Amezon;
	public WebElement Apple_iPhone_XR_Yellow_on_Amezon()
	{
		return Apple_iPhone_XR_Yellow;
	}
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	private WebElement priceblock_ourprice;
	public WebElement priceOfIphone_onAmezon()
	{
		return priceblock_ourprice;
	}
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement onFlipcart_serachField;
	public WebElement searchField_on_Flipcart()
	{
		return onFlipcart_serachField;
	}
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	private WebElement Apple_iPhone_XR_Yellow;
	public WebElement Apple_iPhone_XR_Yellow_on_Flipcart()
	{
		return Apple_iPhone_XR_Yellow;
	}
	
	@FindBy(xpath="//input[@class='nav-input']")
	private WebElement search_button_Amezon;
	public WebElement serachbutton_Amezon()
	{
		return search_button_Amezon;
	}
	
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close_login;
	public WebElement close_Login()
	{
		return close_login;
	}
	
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement searchbutton_Flipcart;
	public WebElement serachbutton_Flipcart()
	{
		return searchbutton_Flipcart;
	}
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']")
	private WebElement priceOfiphone_onFlipcart;
	public WebElement priceOfIphoneOn_Flipcart()
	{
		return priceOfiphone_onFlipcart;
	}
	
	@FindBy(xpath="//span[@class='brand-global-nav-action-search-Search__label--3PRUD']")
	private WebElement search_on_tripadvisor;
	public WebElement search_tripadvisor()
	{
		return search_on_tripadvisor;
	}
	
	
	
	@FindBy(xpath="//input[@class='_3qLQ-U8m']")
	private WebElement search;
	public WebElement search()
	{
		return search;
	}
	
	
	@FindBy(xpath="//div[@class='_2oYoDbfY']")
	private WebElement Club_Mahendra_Madikeri;
	public WebElement Club_Mahendra_Madikeri_Coorg()
	{
		return Club_Mahendra_Madikeri;
	}
	
	@FindBy(xpath="//input[@id='mainSearch']")
	private WebElement mainSearch;
	public WebElement mainSearch()
	{
		return mainSearch;
	}
	
	
	@FindBy(xpath="(//span[@class='poi-name primaryText'])[1]")
	private WebElement Club_Mahendra_Madikeri_home;
	public WebElement Club_Mahendra_Madikeri_Coorg_home()
	{
		return Club_Mahendra_Madikeri_home;
	}

	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement write_a_review;
	public WebElement write_A_Review()
	{
		return write_a_review;
	}
	
	
	@FindBy(xpath="//span[@id='bubble_rating']")
	private WebElement ratings;
	public WebElement overall_Ratings()
	{
		return ratings;
	}
	
	private WebElement ReviewTitle;
	public WebElement Title_of_your_review()
	{
		return ReviewTitle;
	}
	
	private WebElement ReviewText;
	public WebElement your_Review()
	{
		return ReviewText;
	}
	private WebElement qid12_bubbles;
	public WebElement Hotel_Ratings_Service()
	{
		return qid12_bubbles;
	}
	
	private WebElement qid13_bubbles;
	public WebElement Hotel_Ratings_Value()
	{
		return qid13_bubbles;
	}
	private WebElement qid11_bubbles;
	public WebElement Hotel_Ratings_Rooms()
	{
		return qid11_bubbles;
	}
	
	private WebElement SUBMIT;
	public WebElement submit_Your_Review()
	{
		return SUBMIT;
	}
}
