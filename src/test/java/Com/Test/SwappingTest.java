package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.SwapNumbe;

public class SwappingTest {
SwapNumbe sn=null;
@Test
public void swap1() {
	sn=new SwapNumbe();
	int a[]=sn.swapingwToNumbers(10, 20);
	int[] e= {20,10};
	assertEquals(a, e);
}
@Test
public void swap2() {
	sn=new SwapNumbe();
	int a[]=sn.swapingwToNumbers(30, 500);
	int[] e= {500,30};
	assertEquals(a, e);
}
@Test
public void zeroSwap() {
	sn=new SwapNumbe();
	int a[]=sn.swapingwToNumbers(0, 0);
	int[] e= {0,0};
	assertEquals(a, e);
}
}
