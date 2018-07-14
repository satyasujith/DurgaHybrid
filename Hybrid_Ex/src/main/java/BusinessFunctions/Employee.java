package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Lib.common_Methods;
import Locators.DataRead;

public class Employee 
{
	common_Methods comm;
	Properties pro;
	DataRead rd;
	public Employee(common_Methods x,Properties y, DataRead z,String locpath) throws FileNotFoundException, IOException
	{
		comm=x;
		pro=y;
		rd=z;
		// This constructor is calleld in Tc1 by creating object there it is passed through prop_path
		pro.load(new FileInputStream(locpath));
	}
	public void login() throws Exception
	{
		rd.data();
		String browser=rd.getCellData(0, 0);
		String urlii=rd.getCellData(1, 0);
		String username=rd.getCellData(2, 0);
		String password=rd.getCellData(3, 0);
		
		String tit=pro.getProperty("Title");
		
		String un_id=pro.getProperty("unid");
		String un_loct=pro.getProperty("unloc");
		
		String pwd_id=pro.getProperty("pwdid");
		String pwd_loc=pro.getProperty("pwdloc");
		
		String log_id=pro.getProperty("loginid");
		String log_loc=pro.getProperty("loginloc");
		
		String clear_id=pro.getProperty("clearid");
		String clear_loc=pro.getProperty("clearloc");
		
		comm.startBrowser(browser);
		comm.maximiseBrowser();
		
		comm.url(urlii);
		comm.verifyTitle(tit);
		comm.verifyElementPresent(un_id, un_loct);
		comm.verifyElementPresent(pwd_id, pwd_loc);
		comm.verifyElementPresent(log_id, log_loc);
		comm.verifyElementPresent(clear_id, clear_loc);
		
		comm.ClearTextField(un_id, un_loct);
		comm.sendKeys(un_id, un_loct, username);
		
		comm.ClearTextField(pwd_id, pwd_loc);
		comm.sendKeys(pwd_id, pwd_loc, password);
		
		comm.click(log_id, log_loc);
	}
}
