/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static long solve(int weight[],long price[],int wt,int n){
        
        
        long t[][]=new long[n+1][wt+1];
        
        
        
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=wt;j++){
                
                if(weight[i-1]<=j){
                    t[i][j]=Math.max(price[i-1]+t[i-1][j-weight[i-1]],t[i-1][j]);
                }
                
                else{
                    t[i][j]=t[i-1][j];
                }
                
            }
        }
        
        
       return t[n][wt];
       
        }
        
  
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
   int wt=s.nextInt();
   
   int weight[]=new int[n];
   long price[]=new long[n];
   
   for(int i=0;i<n;i++){
       weight[i]=s.nextInt();
         price[i]=s.nextLong();
   }
  /* for(int i=0;i<n;i++){
       price[i]=s.nextLong();
   }*/
   
  System.out.println( solve(weight,price,wt,n));
   
	}
}
