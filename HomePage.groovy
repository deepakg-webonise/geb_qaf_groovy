package qaf.example.steps

import org.openqa.selenium.By

import geb.Page

class HomePage extends Page {
// page is main class of geb
	
	static url = "http://www.jcpenney.com/"

	static at = { jchome.displayed }

	static content = {
		jchome { $(By.xpath("//a[@title='JCPenney Home']")) }  // div.main_logo.flt_lft //
		jcorder {$("#orderQuantity")}
	}
	

	/**
	 * Selects 'Latest news'
	 *
	 * @return the news page object
	 */
	def selectLatestNews() {
		// And  I select "<category>"
		//latestNews.jquery.mouseover();
		jchome.click();
		jcorder.click();
		
		
		
		browser.page(NewsPage)
	}
}
