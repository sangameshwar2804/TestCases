package Com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Com.BusinessLogic.SecondLargest;

public class Base {
@BeforeClass
public void before() {
	SecondLargest sl=new SecondLargest();
	
}
@AfterClass
public void set() {
	System.out.println("Runs before classs");
}
@AfterClass
public void  tearDown() {
	System.out.println("Runs after class");
}
}
