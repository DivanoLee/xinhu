import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class x45 extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");
		}
	@Test(priority=1)
	public void Test45() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,'系统')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,3,-1)']");
		webtest.click("xpath=//div[@onclick='clickmenu(this,3,0)']");
		webtest.click("xpath=//div[@click='kuanshu2']");
		webtest.click("xpath=//div[@id='confirm_btn1']");
	}
}
