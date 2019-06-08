package Com.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import Com.BusinessLogic.Factorial;

public class FactorialTest {
Factorial f=null;
@Test
public void positiveFact() {
	f=new Factorial();
	int actual=f.factTest(5);
	assertEquals(actual, 120);
}
@Test
public void zeroFact() {
	f=new Factorial();
	int actual=f.factTest(0);
	assertEquals(actual, 1);
}
@Test
public void oneFact() {
	f=new Factorial();
	int actual=f.factTest(1);
	assertEquals(actual, 1);
}
@Test
public void negativeNumberFact() {
	f=new Factorial();
	int actual=f.factTest(-2);
	assertFalse(true);
}
}
