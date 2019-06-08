package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.ArrayCompare;

public class ArrayCompTest {
ArrayCompare a=null;
@Test
public void sameArray() {
	a=new ArrayCompare();
	int a1[]= {1,2,3,4};
	int a2[]= {1,2,3,4};
	boolean actual=a.isCommon(a1, a2);
	assertEquals(actual, true);
}
@Test
public void differentArrayLength() {
	a=new ArrayCompare();
	int a1[]= {1,2,3,4,5};
	int a2[]= {1,2,3,4};
	boolean actual=a.isCommon(a1, a2);
	assertEquals(actual, false);
}
@Test
public void differentElements() {
	a=new ArrayCompare();
	int a1[]= {1,3,2,4};
	int a2[]= {4,3,2,1};
	boolean actual=a.isCommon(a1, a2);
	assertEquals(actual, false);
}
}
