package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCPurplle {
	WebDriver driver;
	
	public void titleVerification() {
		String expTitle="Purplle.com";
		String actTitle=driver.getTitle();
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is mismatched");
		}
	}
	
	public void linkCount() {
		List<WebElement> lc= driver.findElements(By.tagName("a"));
		int linkcnt=lc.size();
		System.out.println("Link Count = "+linkcnt);
	}
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[2]/div/div/div/div[1]/div/input")
	WebElement outersearch;
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/div[2]/desktop-search-content/div[1]/div/div[1]/p/input")
	WebElement innersearch;
	
public void searchBar(String txt) {
	outersearch.click();
	innersearch.sendKeys(txt+Keys.ENTER);
}

	@FindBy(xpath="//*[@id=\"filterHeader\"]/div/div/ul/li[1]/a/span[1]")
	WebElement categories;
	@FindBy(xpath="//*[@id=\"filter_0\"]/ul/li[2]/label/div/span")
	WebElement hairCare;
	@FindBy(xpath="//*[@id=\"filter_0\"]/div[2]/a/span")
	WebElement applyFilter;
	
	public void SelCategories() throws Exception {
		categories.click();
		Thread.sleep(2000);
		hairCare.click();
		applyFilter.click();
	}
	
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	@FindBy(xpath="/html/body/app-root/div/div/div/server-driven-listing/div[2]/div[1]/div[4]/div/app-listing-item[1]/div/div/div/div/div[3]/a[1]")
	WebElement cart;
	public void addToCart() {
		cart.click();
	}
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]")
	List<WebElement> header;
	public void Headerelements() {
		List<WebElement> li=header;
		for(WebElement tmp:header) {
			String headerlist=tmp.getText();
			System.out.println(headerlist);
		}
		
	}
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div[1]/a")
	WebElement shopcate;
	public void Hovershop() {
		Actions act=new Actions(driver);
		act.moveToElement(shopcate).perform();
	}
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/p[1]/a")
	WebElement lip;
	public void LipCare() {
		lip.click();
	}
	
	
	public PCPurplle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
