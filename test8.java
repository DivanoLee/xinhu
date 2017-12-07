import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class x1 extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");

		}
	@Test(priority=1)
	public void Test8() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,'系统')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,0,-1)']");
		webtest.click("xpath=//div[@onclick='clickmenu(this,0,3)']");
		webtest.click("xpath=//div[@click='fields(name)']");
		webtest.click("xpath=//div[@click='clickmenu(clickwin,1)']");
		webtest.type("xpath=//input[@class='name']","组名");
		webtest.type("xpath=//input[@name='sort']","2");
		webtest.click("xpath=//div[@id='save_1512635380725_790']");
	
	}
}












