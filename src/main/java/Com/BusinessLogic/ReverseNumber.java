package Com.BusinessLogic;

public class ReverseNumber {
public boolean numberReverse(int a) {
	int rev=0;
	int temp=a;
	if(a<10) {
		return false;
	}
	if(a>10) {
		int digit=a%10;
		a=a/10;
		rev=rev*10+digit;
		if(rev==temp) {
			return true;
		
		}
	}
	return true;
}
}
