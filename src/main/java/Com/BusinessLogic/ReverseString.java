package Com.BusinessLogic;

public class ReverseString {
public String checkIsStringReverse(String str) {
	
	String rev="";
for(int i=str.length();i>0;i--) {
	rev=rev+str.charAt(i);
}
return rev;
}

}
