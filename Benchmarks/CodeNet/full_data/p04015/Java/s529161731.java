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
Shining through the city with a little funk and soul
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int A = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         Arrays.sort(arr);
         long res = 0L;
         for(int choose=1; choose <= N; choose++)
         {
            long[][] dp = new long[A*choose+1][choose+1];
            dp[0][0] = 1L;
            for(int v: arr)
               for(int i=A*choose; i >= 0; i--)
                  for(int k=choose; k > 0; k--)
                     if(i-v >= 0)
                        dp[i][k] += dp[i-v][k-1];
            res += dp[dp.length-1][choose];
         }
         System.out.println(res);
      }
   }