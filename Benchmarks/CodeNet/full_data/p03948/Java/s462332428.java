import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  int ans=0;
    	  int n=input.nextInt();
    	  int m=input.nextInt();
    	  int []a=new int[100005];
    	  HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	  long min=(long) 1e18;
    	  long dmax=(long) -1e18;
    	  for(int i=1;i<=n;i++)
    	  {
    		  a[i]=input.nextInt();
    		  min=Math.min(a[i], min);
    		  dmax=Math.max(dmax, a[i]-min);
    	  }
    	  //System.out.println(dmax);
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=1;j<i;j++)
    		  {
    			  if(a[i]-a[j]==dmax)
    				  ans++;
    		  }
    	  }
    	  System.out.println(ans);
          
	}
}
