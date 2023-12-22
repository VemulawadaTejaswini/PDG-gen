/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

class Main {
    static long dp[][];
    static boolean is[][];
    public static long knapsack(int i,int v[],int w[],int value,int C){
         if(i==0&&value!=0)return Integer.MAX_VALUE;
         if(i==0)return 0;
         if(is[i][value])return dp[i][value] ;
         is[i][value]=true;
         if(value<v[i-1])dp[i][value]= knapsack(i-1, v, w, value, C);
         else dp[i][value]= Math.min(w[i-1]+knapsack(i-1, v, w,value-v[i-1],C),knapsack(i-1, v, w,value,C));
         return dp[i][value];
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s=br.readLine().split("\\s+");
		
            int n=Integer.parseInt(s[0]);
            int C=Integer.parseInt(s[1]);
            int []v=new int[n];
            int []w=new int[n];
		   
		    for(int i=0;i<n;i++){
                s=br.readLine().split("\\s+");
                w[i]=Integer.parseInt(s[0]);
                v[i]=Integer.parseInt(s[1]);
            }
            int value=0;
            for(int i=0;i<n;i++)value+=v[i];
            dp=new long[n+1][value+1];
            is=new boolean[n+1][value+1];
            for(int i=0;i<=n;i++)
           Arrays.fill(dp[i],Integer.MAX_VALUE);
            
           int max=0;
            for(int j=value;j>=0;j--)
             {
                long res=knapsack(n, v, w, j,C);
                 if(res<=C){
                   //  System.out.println(res);
                     max=j;
                     break;
                 }
             }
            //for(int i=0;i<n;i++)
             //System.out.println(Arrays.toString(dp[i]));
            System.out.print(max);
		
		    
	
		
	}
}
