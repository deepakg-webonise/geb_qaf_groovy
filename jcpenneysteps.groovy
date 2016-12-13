package qaf.example.steps

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.*
import geb.Browser
import geb.Page
import geb.binding.BindingUpdater

import java.util.concurrent.TimeUnit

import com.qmetry.qaf.automation.step.QAFTestStep

//import org.ytheohar.bbc.geb.cucumber.page.HomePage
//import org.ytheohar.bbc.geb.cucumber.page.NewsPage
//class jcpenney_steps11311413 extends Page {



def jcPages
/*ss
 *
 *  Given I am on the home page
	When I hover 'for the home'
	And  I select "<category>"
	Then I successfully able to open category
 */
//BEfore and after are cucumber hooks
Before() {
	bindingUpdater = new BindingUpdater(binding, new Browser())
	bindingUpdater.initialize()
	browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
}

After() { bindingUpdater.remove() }


Given(~/^I am on the home page$/)
//@QAFTestStep(description = "search for {0}")
{ -> to HomePage }  // to use for navigation to call Home page

When(~/^I go to my bag$/) {
	->
	page.selectLatestNews()
	at NewsPage
	page.check_item()
}
/*
When(~/^I select "([^"]*)"$/) {  String category ->
	def newsCategoryPage = page.selectCategory(category)
	at newsCategoryPage
}

When(~/^I select the first video on the 'Watch-Listen' section$/) {
	->
	def selectFirstVideo = page.selectFirstVideo()
	at selectFirstVideo
}

When(~/^I share the video page on facebook$/) {
//	-> fbPage = page.shareOnFacebook()
}*/

Then(~/^I successfully able to view my bag$/) { -> at FBPage }

