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
         int P = Integer.parseInt(st.nextToken());
         String input = infile.readLine();
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(input.charAt(i)+"");
         long[] count = new long[P];
         long res = 0L;
         int coef = 1;
         int curr = 0;
         for(int i=N-1; i >= 0; i--)
         {
            curr += coef*arr[i];
            curr %= P;
            res += count[curr];
            if(curr == 0)
               res++;
            count[curr]++;
            coef *= 10;
            coef %= P;
         }
         System.out.println(res);
      }
   }