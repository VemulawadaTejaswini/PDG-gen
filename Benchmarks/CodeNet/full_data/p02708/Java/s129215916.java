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
      static long MOD = 1000000007L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         //solve
         long[] fac = new long[200005];
         fac[0] = 1L;
         for(int i=1; i <= 200002; i++)
            fac[i] = (fac[i-1]*i)%MOD;
         long min = 0L;
         long max = 0L;
         for(int i=0; i < K; i++)
         {
            min += i;
            max += N-i;
         }
         long res = 0L;
         for(long k=K; k <= N+1; k++)
         {
            long mult = (max-min+1)%MOD;
            res += (mult)%MOD;
            res %= MOD;
            min += k;
            max += N-k;
         }
         System.out.println(res);
      }
      public static long nCr(long[] fac, int a, int b)
      {
         long temp = fac[b];
         temp = (temp*power(fac[a], MOD-2, MOD))%MOD;
         temp = (temp*power(fac[b-a], MOD-2, MOD))%MOD;
         return temp;
      }
      public static long power(long x, long y, long p) 
      { 
          long res = 1L;      
          x = x % p;  
          while (y > 0) 
          { 
              if((y & 1)==1) 
                  res = (res * x) % p; 
              y = y >> 1;  
              x = (x * x) % p;  
          } 
          return res; 
      } 
   }