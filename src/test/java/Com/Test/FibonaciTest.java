package Com.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Com.BusinessLogic.Fibonaccci;

public class FibonaciTest {
	 Fibonaccci f=null;
	 @Test
	 public void ZeroInput() {
		 f=new Fibonaccci();
		 int actual=f.checkFibonacci(0);
		 assertEquals(actual, 0);
	 }
	 @Test
	 public void validInput() {
		 f=new Fibonaccci();
		 int actual=f.checkFibonacci(5);
		 assertEquals(actual, 34);
	 }
}
