package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.Prime;

public class PrimeTest {
Prime p=null;
@Test
public void nonPrimeTest() {
	p=new  Prime();
	boolean a=p.checkPrime(10);
	assertEquals(a, false);
}
@Test
public void primeTest() {
	p=new  Prime();
	boolean a=p.checkPrime(17);
	assertEquals(a,true);
}
@Test
public void zeroTest() {
	p=new  Prime();
	boolean a=p.checkPrime(0);
	assertEquals(a, false);
}
}
