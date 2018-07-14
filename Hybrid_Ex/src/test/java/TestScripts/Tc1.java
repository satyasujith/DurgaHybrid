package TestScripts;

import org.testng.annotations.Test;

import BusinessFunctions.Employee;

public class Tc1 extends RootTest
{
@Test
public void lg1()throws Exception
{
	Employee emp=new Employee(cm,pr,dt,prop_path);
	emp.login();
}
}
