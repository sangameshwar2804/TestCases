package Com.BusinessLogic;

public class SwapNumbe {
public int[] swapingwToNumbers(int a,int b) {
	if(a==0 & b==0) {
		int c[]= {0,0};
		return c;
}
	a=a+b;
	b=a-b;
	a=a-b;
	int[] arr= {a,b};
	return arr;
}
}
