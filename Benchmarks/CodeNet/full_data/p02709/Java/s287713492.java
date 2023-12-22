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
         Thing[] arr = new Thing[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = new Thing(i,Integer.parseInt(st.nextToken()));
         //dp(a,b) = best answer when a have been pushed front, b pushed back
         dp = new long[N+1][N+1];
         for(int i=0; i <= N; i++)
            Arrays.fill(dp[i], -1);
         Arrays.sort(arr);
         System.out.println(dfs(0,0,arr));
      }
      static long[][] dp;
      public static long dfs(int a, int b, Thing[] arr)
      {
         if(dp[a][b] != -1)
            return dp[a][b];
         int N = dp.length-1;
         if(a+b == N)
            return 0L;
         Thing curr = arr[a+b];
         long res = (long)curr.val*Math.abs(curr.index-a)+dfs(a+1,b,arr);
         res = Math.max(res, (long)curr.val*Math.abs(curr.index-(N-1-b))+dfs(a,b+1,arr));
         return dp[a][b] = res;
      }
   }
   class Thing implements Comparable<Thing>
   {
      public int index;
      public int val;
      
      public Thing(int a, int b)
      {
         index = a;
         val = b;
      }
      public int compareTo(Thing oth)
      {
         return oth.val-val;
      }
   }