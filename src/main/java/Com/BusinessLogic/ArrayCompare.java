package Com.BusinessLogic;

public class ArrayCompare {
public boolean isCommon(int[] a1,int[] a2) {
	if(a1.length!=a2.length) {
		return false;
	}
	for(int i=0;i<a1.length;i++) {
		for(int j=0;j<=i;j++) {
			
			if(a1[i]==a2[j]) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	return true;
}
}
