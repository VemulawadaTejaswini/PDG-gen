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
      for(int i =2; i< n ; i++) {
         dp[i] = Math.min(Math.abs(arr[i]-arr[i-1])+ dp[i-1], 
                         Math.abs(arr[i]- arr[i-2])+ dp[i-2]);
      }
      return dp[n-1];
    }
}
