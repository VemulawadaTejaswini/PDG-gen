
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++) {
	    a[i]=sc.nextInt();
	  }
	 long sum=a[0];
	 long operations=0;
	 if(sum==0) {
	   sum++;
	   operations++;
	 }
	  for(int i=1;i<n;i++) {
	    if(sum>0) {
	      if(sum+a[i]<0) {
	        sum+=a[i];
	      }else {
	        if(sum+a[i]==0) {
	          sum+=a[i]-1;
	          operations++;
	        }else {
	          long req=-1-1*sum;
	          sum=-1;
	          operations+=(-1*req+a[i]);     
	        }
	      }
	    }else {
	      if(sum+a[i]>0) {
	        sum+=a[i];
	      }else {
	        if(sum+a[i]==0) {
	          sum+=a[i]+1;
	          operations++;
	        }else {
	          long req=1+-1*sum;
	          sum=1;
	          operations+=(req-a[i]);
	        }
	      }
	    }
	  }
	  System.out.println(operations);
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