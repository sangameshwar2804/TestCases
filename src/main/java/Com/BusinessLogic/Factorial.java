package Com.BusinessLogic;

public class Factorial {
	public int factTest(int n)
	   {
	       int output=1;
	       if(n==1|n==0){
	         return 1;
	       }
	       else if(n>=1) {
	    	  for(int i=1;i<=n;i++) {
	    		  output=output*i;
	    	  }
	    	  System.out.println(output);
	      }
	       else if(n<=-1) {
	    	  System.out.println("enter a postivie number");
	       }
	   return output;
	   }
}
