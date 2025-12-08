package testpkg;

import org.testng.annotations.Test;

import basepkg.BCPurplle;
import pagepkg.PCPurplle;

public class TPPurplle extends BCPurplle{
	@Test
	public void testing() throws Exception {
		PCPurplle ob=new PCPurplle(driver);
		ob.titleVerification();
		ob.linkCount();
		ob.searchBar("Shampoo");
		ob.SelCategories();
		ob.Scroll();
		ob.addToCart();
		ob.shopca();
		ob.Brands();
		ob.Offers();
		ob.NewC();
		ob.Splurge();
		ob.Magazine();
		ob.Eliteoff();
		ob.Hovershop();
		ob.LipCare();
	}

}
