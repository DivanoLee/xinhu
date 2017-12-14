import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class x38 extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");
		}
	@Test(priority=1)
	public void Test38() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,'系统')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,6,-1)']");
		webtest.click("xpath=//div[@onclick='clickmenu(this,6,7)']");
		webtest.click("xpath=//input[@name='tablecheck_1513236677588_5353']");
		webtest.click("xpath=//div[@click='delss']");
		webtest.click("xpath=//div[@id='confirm_btn1']");
	}
}
