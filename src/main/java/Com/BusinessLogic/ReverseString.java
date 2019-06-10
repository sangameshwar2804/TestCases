package Com.BusinessLogic;

public class ReverseString {
public String checkIsStringReverse(String str) {
	String str1=str.toLowerCase();
	String rev="";
	if(str.equals(null)) {
		return null;
	}
	else {
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
	}
	return rev;
}

}
