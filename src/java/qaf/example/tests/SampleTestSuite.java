package qaf.example.tests;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.StringMatcher;
public class SampleTestSuite extends WebDriverTestCase {
    @Test
    public void test1() {
        getDriver().get("/");
        // QAFWebElement fname = getDriver().findElement("fname locator");
        QAFWebElement fname = new QAFExtendedWebElement("fname locator");
        fname.verifyText(StringMatcher.exactIgnoringCase("expected text"));
    }
}