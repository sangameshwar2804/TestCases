package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.CompareObject;

public class CompareObjectTest {
CompareObject co=null;
@Test
public void checkWithDifferentObjects() {
	co=new CompareObject();
	int a1[]= {1,2,3,4};
	int a2[]= {1,2,3,4};
	boolean actual=co.checkHashCode(a1, a2);
	assertEquals(actual, false);
}
@Test
public void checkWithSameObj() {
	co=new CompareObject();
	int a1[]= {1,2,3,4};
	int a2[]= a1;
	boolean actual=co.checkHashCode(a1, a2);
	assertEquals(actual, true);
}
}
