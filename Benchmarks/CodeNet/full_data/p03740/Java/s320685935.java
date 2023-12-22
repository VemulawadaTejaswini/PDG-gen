
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
int x=sc.nextInt();
int y=sc.nextInt();
if(Math.abs(x-y)<=1) {
  System.out.println("Brown");
}else {
  out.println("Alice");
}
out.flush();
	    }
	
	
	static boolean vis[]=new boolean[10001];
	      static int gcd(int a, int b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 
	    
	      // Function to find gcd of array of 
	      // numbers 
	      static int f(int arr[], int n) 
	      { 
	          int result = n; 
	          int max=-1;
	          int ans=0;
	          for (int element: arr){ 
	                if(vis[element]==false)
	                     
	              result = gcd(n, element); 
	              if(result>max) {      
	                    max=result;
	                    ans=element;
	           
	              }
	           
	            
	          } 
	     
	               
	          return ans; 
	      } 
	     
	      
}