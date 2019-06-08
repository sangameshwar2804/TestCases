package Com.BusinessLogic;

public class Fibonaccci {
	public int checkFibonacci(int n) {

		
			 int a=0,b=1,c,range=10;    
			if(n<=0) {
				return 0;
			}
			 for(int i=2;i<range;++i) 
			 {    
			  c=a+b;    
			      
			  a=b;    
			  b=c;    
			 }  
				return b;
		}
    }

