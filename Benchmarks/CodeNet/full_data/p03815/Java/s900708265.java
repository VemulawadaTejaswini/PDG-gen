    import java.util.*;
    public class Main {
    static Scanner sc=new Scanner(System.in);
    	public static void main(String[] args) {
    		long x=sc.nextLong();
    		long n=(long)x/11;
    		long m=x%11;
    		long result=0;
    		if(n==0){
    			if(m<=6){
    				result=1;
    			}
    			else{
    				result=2;
    			}
    		}
    		if(n>0){
    			if(m<=6){
    				result=(long)(2*n+1);
    			}
    			else{
    				result=(long)(2*n+2);
    			}
    		}
    		System.out.println(result);
    	}
     
    }