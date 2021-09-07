package myframesx;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BaseClass {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement txtWomen;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement txtDresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement txtTshirts;

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public void clickWomen() {
		txtWomen.click();
	}

	public void clickDresses() {
		txtDresses.click();
	}

	public void clickTshirts() {
		txtTshirts.click();
	}


}

