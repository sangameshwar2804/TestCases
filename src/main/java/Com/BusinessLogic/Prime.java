package Com.BusinessLogic;

public class Prime {
public boolean checkPrime(int a) {
	if(a<=1) {
		return false;
	}
	for(int i=2;i<=(a)/2;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}

}
