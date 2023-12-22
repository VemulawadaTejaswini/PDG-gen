import java.util.*;
import java.io.*;
public class Main{
   public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     long [] arr=new long[n];
     
     for(int i=0;i<n;i++)arr[i]=sc.nextLong();

     long [] dp=new long[n];

     dp[0]=0;
    
     for(int i=1;i<n;i++){

       long min=Integer.MAX_VALUE;

       for(int j=i-1;j>=i-k && j>=0;j--){

         min=Math.min(min,dp[j]+Math.abs(arr[i]-arr[j]));

       }
       dp[i]=min;
     }

     System.out.println(dp[n-1]);

    }
   }
 