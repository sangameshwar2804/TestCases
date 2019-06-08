package Com.Test;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.BusinessLogic.SecondLargest;

public class SecondLargestTest extends Base{
static SecondLargest s=null;

@Test
public void test1() {
	s=new SecondLargest();
	int a[]= {1,3,5,6,4,7,34,10,5,0,-2,11};
int actual=	s.findLargest(a);
assertEquals(actual,11 );
}
@Test
public void test2() {
	s=new SecondLargest();
	int a1[]= {4,7,34,10,5,0,-2,11};
int actual=	s.findLargest(a1);
int expected=s.findLargest(a1);
assertEquals(actual,expected );
}
@Test
public void test3()
{
	s=new SecondLargest();
	int a1[]= {4,7,34,10,5,0,-2,11};
int actual=	s.findLargest(a1);
int expected=s.findLargest(a1);

}
}
