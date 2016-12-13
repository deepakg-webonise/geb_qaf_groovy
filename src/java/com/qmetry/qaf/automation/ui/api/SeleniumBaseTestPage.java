/*******************************************************************************
 * QMetry Automation Framework provides a powerful and versatile platform to author 
 * Automated Test Cases in Behavior Driven, Keyword Driven or Code Driven approach
 *                
 * Copyright 2016 Infostretch Corporation
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT
 * OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
 *
 * You should have received a copy of the GNU General Public License along with this program in the name of LICENSE.txt in the root folder of the distribution. If not, see https://opensource.org/licenses/gpl-3.0.html
 *
 * See the NOTICE.TXT file in root folder of this source files distribution 
 * for additional information regarding copyright ownership and licenses
 * of other open source software / files used by QMetry Automation Framework.
 *
 * For any inquiry or need additional information, please contact support-qaf@infostretch.com
 *******************************************************************************/


package com.qmetry.qaf.automation.ui.api;

import com.qmetry.qaf.automation.ui.AbstractTestPage;
import com.qmetry.qaf.automation.ui.SeleniumTestBase;
import com.qmetry.qaf.automation.ui.selenium.IsSelenium;

/**
 * com.qmetry.qaf.automation.api.BaseTestPage2.java
 * 
 * @author chirag
 */
public abstract class SeleniumBaseTestPage<P extends SeleniumTestPage> extends AbstractTestPage<P, IsSelenium>
		implements SeleniumTestPage {
	protected P parent;
	protected PageLocator pageLocator;

	public SeleniumBaseTestPage() {
		this(null);
	}

	public SeleniumBaseTestPage(P parent) {
		super(new SeleniumTestBase(), parent);
	}

	@Override
	public String getText() {
		return driver.getBodyText();
	}

	@Override
	public SeleniumTestBase getTestBase() {
		return (SeleniumTestBase) super.getTestBase();
	}
}
