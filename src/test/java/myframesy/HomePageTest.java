package myframesy;

import org.junit.Assert;
import org.junit.Test;
import myframesx.BaseClass;
import myframesx.HomePageObject;

public class HomePageTest {
	HomePageObject hp;
	BaseClass bc;

	public HomePageTest() {
		hp = new HomePageObject();
		bc = new BaseClass();
	}

	@Test
	public void homepagetabs() {
		hp.clickWomen();
		Assert.assertTrue(bc.getTitlte().contains("Women"));
		hp.clickDresses();
		Assert.assertTrue(bc.getTitlte().contains("Dresses"));
		hp.clickTshirts();
		Assert.assertTrue(bc.getTitlte().contains("Tshirts"));
	}
}
