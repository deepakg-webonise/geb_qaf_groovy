package qaf.example.tests;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import static com.qmetry.qaf.automation.step.CommonStep.*;
public class Suite1 extends WebDriverTestCase {
	@QAFTestStep(description="Sample Test Scenario")
	public void testGoogleSearch() {
		get("/");
	    sendKeys("Git reporsitory QAF", "txt.searchbox");
	    click("btn.search");
	    verifyLinkWithPartialTextPresent("qaf");
	}
}