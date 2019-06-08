package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.ReverseNumber;

public class ReverseNumberTest {
ReverseNumber rn=null;
@Test
public void belowTenTest() {
	rn=new ReverseNumber();
	boolean actual=rn.numberReverse(9);
	assertEquals(actual, false);
}
@Test
public void sameNumberTest() {
	rn=new ReverseNumber();
	boolean actual=rn.numberReverse(121);
	assertEquals(actual, true);
}
@Test
public void zeroTest() {
	rn=new ReverseNumber();
	boolean actual=rn.numberReverse(0);
	assertEquals(actual, false);
}
@Test
public void fourdigitTest() {
	rn=new ReverseNumber();
	boolean actual=rn.numberReverse(4224);
	assertEquals(actual, true);
}
@Test
public void sameDigitTest() {
	rn=new ReverseNumber();
	boolean actual=rn.numberReverse(9999);
	assertEquals(actual, true);
}
}
