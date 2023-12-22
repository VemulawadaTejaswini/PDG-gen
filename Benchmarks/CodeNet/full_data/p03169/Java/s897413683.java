/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
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
         int[] arr = new int[4];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[Integer.parseInt(st.nextToken())]++;
         double[][][] dp = new double[N+1][N+1][N+1];
         for(int i=0; i <= N; i++)
            for(int j=0; j <= N; j++)
               Arrays.fill(dp[i][j], -1.0);
         recur(dp, arr[1], arr[2], arr[3], N);
         System.out.println(dp[arr[1]][arr[2]][arr[3]]);
      }
      public static double recur(double[][][] dp, int a, int b, int c, int N)
      {
         if(dp[a][b][c] >= 0.0)
            return dp[a][b][c];
         double calc = 0.0;
         if(a > 0)
            calc += (1.0*a)/(a+b+c)*(recur(dp, a-1, b, c, N)+1.0*N/(a+b+c));
         if(b > 0)
            calc += (1.0*b)/(a+b+c)*(recur(dp, a, b-1, c, N)+1.0*N/(a+b+c));
         if(c > 0)
            calc += (1.0*c)/(a+b+c)*(recur(dp, a, b, c-1, N)+1.0*N/(a+b+c));
         dp[a][b][c] = calc;
         return dp[a][b][c];
      }
   }