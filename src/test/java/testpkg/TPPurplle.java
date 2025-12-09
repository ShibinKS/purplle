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
		ob.Headerelements();
		ob.Hovershop();
		ob.LipCare();
	}

}
