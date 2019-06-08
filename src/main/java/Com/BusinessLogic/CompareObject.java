package Com.BusinessLogic;

public class CompareObject {
public boolean checkHashCode(int[] a1,int []a2) {
	if(a1.hashCode()==a2.hashCode()) {
		return true;
	}
	return false;
}
}
