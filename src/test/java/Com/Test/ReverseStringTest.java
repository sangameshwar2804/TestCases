package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.ReverseString;

public class ReverseStringTest {
ReverseString rs=null;
@Test
public void test1() {
	rs=new ReverseString();
	String actual=rs.checkIsStringReverse("hello");
	assertEquals(actual, "olleh");
}
	@Test
public void nullTest() {
	rs=new ReverseString();
	String actual=rs.checkIsStringReverse("");
	
	assertEquals(actual,"");
}
@Test
public void upperCaseTest() {
	rs=new ReverseString();
	String actual=rs.checkIsStringReverse("ABC");
	assertEquals(actual, "cba");
}
@Test
public void mixedCaseTest() {
	rs=new ReverseString();
	String actual=rs.checkIsStringReverse("AbCDe");
	assertEquals(actual, "edcba");
}
}
