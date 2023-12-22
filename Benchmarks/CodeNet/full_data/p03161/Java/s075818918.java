import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
      for(int i =0; i< n; i++)
        arr[i]= in.nextInt();
        
        int[] dp = new int[n];
        dp[0] =0;
         dp[1]= Math.abs(arr[1]-arr[0]);
       Arrays.fill(dp, Integer.MAX_VALUE);
      for(int i =2; i< n ; i++) {
         for(int j =1; j<=k: j++){
            if(i-j>=0){
             dp[i] = Math.min(Math.abs(arr[i]-arr[i-j])+ dp[i-j], dp[i]);
            }
         }
      }
      System.out.println(dp[n-1]);
    }
}