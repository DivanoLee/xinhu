import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class x33 extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");
		}
	@Test(priority=1)
	public void Test33() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,'系统')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,6,-1)']");
		webtest.click("xpath=//div[@onclick='clickmenu(this,6,6)']");
		webtest.type("xpath=//input[@id='key_1513235948024_471']", "管理员");
		webtest.click("xpath=//div[@click='search']");
	}
}
