/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
**************************
Time to solve: 
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         long[] dp = new long[N];
         Arrays.fill(dp, Integer.MAX_VALUE);
         dp[0] = 0;
         for(int i=0; i < N; i++)
         {
            if(dp[i] == Integer.MAX_VALUE)
               continue;
            if(i+1 < N)
               dp[i+1] = Math.min(dp[i+1], dp[i]+Math.abs(arr[i]-arr[i+1]));
            if(i+2 < N)
               dp[i+2] = Math.min(dp[i+2], dp[i]+Math.abs(arr[i]-arr[i+2]));
         }
         System.out.println(dp[N-1]);
      }
   }