/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         //solve
         dp = new long[N][N];
         for(int i=0; i < N; i++)
            Arrays.fill(dp[i], -1);
         System.out.println(dfs(0, N-1));
      }
      static long[][] dp;
      static int[] arr;
      public static long dfs(int left, int right)
      {
         if(dp[left][right] != -1)
            return dp[left][right];
         if(left == right)
            return dp[left][right] = 0;//arr[left];
         long sum = 0L;
         for(int i=left; i <= right; i++)
            sum += arr[i];
         long res = dfs(left, left)+dfs(left+1, right);
         for(int i=left+1; i < right; i++)
            res = Math.min(res, dfs(left, i)+dfs(i+1, right));
         return dp[left][right] = res+sum;
      }
   }