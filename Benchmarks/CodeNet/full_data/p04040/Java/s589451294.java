/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static final long MOD = 1000000007L;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         
         long[] fac = new long[200001];
         long[] invfac = new long[200001];
         fac[0] = invfac[0] = 1L;
         for(int i=1; i <= 200000; i++)
            fac[i] = (fac[i-1]*i)%MOD;
         invfac[200000] = power(fac[200000], MOD-2, MOD);
         for(int i=199999; i >= 1; i--)
            invfac[i] = (invfac[i+1]*(i+1))%MOD;
            
         long res = (fac[N+M-2]*invfac[N-1])%MOD;
         res = (res*invfac[M-1])%MOD;
         for(int c=0; c < B; c++)
         {
            long temp = (fac[A-1+M-c-1]*invfac[A-1])%MOD;
            temp = (temp*invfac[M-c-1])%MOD;
            long above = (fac[N-A-1+c]*invfac[c])%MOD;
            above = (above*invfac[N-A-1])%MOD;
            res -= (temp*above)%MOD;
            if(res < 0)
               res += MOD;
         }
         System.out.println(res);
      }
      public static long power(long x, long y, long p) 
      { 
         //0^0 = 1
         long res = 1L;      
         x = x%p;  
         while(y > 0) 
         { 
            if((y&1)==1) 
               res = (res*x)%p;
            y >>= 1;
            x = (x*x)%p;  
         } 
         return res; 
      } 
   }