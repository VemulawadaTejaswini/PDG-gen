import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	 static Scanner in = new Scanner(System.in);
	 
   
	public static void main(String args[])throws IOException  {
   
    	
         int n=in.nextInt();
         long[] a=new long[n+1];
         long[] b=new long[n+1];
         ArrayList<Long> list=new    ArrayList<Long>();
         long sum=0;
         for(int i=0;i<n;i++)
        	 a[i]=in.nextLong();
         int ans=0;
         for(int i=0;i<n;i++)
         {
        	 b[i]=in.nextLong();
        	 if(a[i]<b[i])
        	 {
        		 sum+=b[i]-a[i];
        		 ans++;
        	 }
        	 if(a[i]>b[i])
        		 list.add((a[i]-b[i]));
         }
         Collections.sort(list);
         int pos=list.size();
       
         for(int i=pos-1;i>=0;i--)
         {
        	 sum-=list.get(i).longValue();
        	 ans++;
        	 if(sum<=0) break;
         }
         if(sum<=0)
        	 
    		System.out.println(ans);
         else
        	 System.out.println(-1);
     	
    }

	
	
 
	
}