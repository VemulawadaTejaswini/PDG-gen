/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fucking interest
*******************************
Higher, higher, even higher, to the point you won’t even be able to see me
https://www.a2oj.com/Ladder16.html
*******************************
NEVER DO 300IQ CONTESTS EVER
300IQ AS WRITER = EXTRA NONO
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class  Main
   {
      static long MOD = 1000000007L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         ArrayList<Integer>[] edges = new ArrayList[N+1];
         for(int i=1; i <= N; i++)
            edges[i] = new ArrayList<Integer>();
         for(int i=0; i < N-1; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
         }
         long[][] dp = new long[N+1][2];
         dfs(1, 0, dp, edges);
         long res = dp[1][0]+dp[1][1];
         res %= MOD;
         System.out.println(res);
      }
      public static void dfs(int curr, int par, long[][] dp, ArrayList<Integer>[] edges)
      {
         dp[curr][0] = 1L;
         dp[curr][1] = 1L;
         for(int next: edges[curr])
         {
            if(next == par)
               continue;
            dfs(next, curr, dp, edges);
            dp[curr][0] *= (dp[next][0]+dp[next][1])%MOD;
            dp[curr][0] %= MOD;
            dp[curr][1] *= dp[next][0];
            dp[curr][1] %= MOD;
         }
      }
   }