import java.util.*;
import java.io.*;
public class Main{
   
   static long knapsack(long [] ww,long [] vv,int n,int w,long [][] dp){
     if(n==0){
       return 0;
     }
     if(dp[n][w]>0){
       return dp[n][w];
     }

     long in=-1;
     if(w-ww[n-1]>=0)
         in=vv[n-1]+knapsack(ww, vv, n-1,w-(int)ww[n-1],dp);

    long ex=knapsack(ww, vv, n-1,w,dp);

    return dp[n][w]=Math.max(in,ex);

   }
   public static void main(String [] args){

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int w=sc.nextInt();

     long [] ww=new long[n];
     long [] vv=new long[n];

     for(int i=0;i<n;i++){
       ww[i]=sc.nextLong();
       vv[i]=sc.nextLong();
     }

     long cost=knapsack(ww, vv, n,w,new long [n+1][w+1]);

     System.out.println(cost);

    }
   }
 