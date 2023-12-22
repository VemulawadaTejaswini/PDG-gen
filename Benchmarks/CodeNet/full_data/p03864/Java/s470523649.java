import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  int ans=0;
    	  int n=input.nextInt();
    	  int m=input.nextInt();
    	  int []a=new int[100005];
  
    	  for(int i=1;i<=n;i++)
    	  {
    		  a[i]=input.nextInt();
    		  if(i>1)
    		  {
    			  if(a[i]+a[i-1]>m)
    			  {
    				  ans+=(a[i]+a[i-1]-m);
    				   if(a[i]>=(a[i]+a[i-1]-m))
    				   {
    					   a[i]-=(a[i]+a[i-1]-m);
    				   }
    				   else a[i]=0;
    			  }
    		  }
    	  }
    	 
    	  System.out.println(ans);
          
	}
}
