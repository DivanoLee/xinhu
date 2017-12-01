import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class x1 extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");

		}@Test(priority=2)
	public void Test2() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,'系统')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,0,-1)']");
		webtest.click("xpath=//div[@onclick='clickmenu(this,0,0)']");
		webtest.click("xpath=//div[@click='clickmenu(clickwin,0)']");
		webtest.typeAndClear("Xpath=//input[contains(@name='name']","哈哈哈");
		webtest.click("xpath=//div[@onclick='clickmenu(return c.save())']");
	}
 }
