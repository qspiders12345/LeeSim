package pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;	
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rememberMeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropDownList;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileTextfield;	
	
	public POMFramework(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void submit() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		femaleRadioButton.click();
		rememberMeCheckbox.click();
		selectbyvisibletext(countrycodeDropDownList, "+852");
		mobileTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 5));
		movetoelement(driver, firstnameTextfield);
	}
}