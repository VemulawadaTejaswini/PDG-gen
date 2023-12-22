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
         char[] arr = infile.readLine().toCharArray();
         long[] cnt = new long[3];
         for(char c: arr)
         {
            int dex = 0;
            if(c == 'G')
               dex=1;
            else if(c == 'B')
               dex=2;
            cnt[dex]++;
         }
         long res = cnt[0]*cnt[1]*cnt[2];
         for(int d=1; d <= N; d++)
         {
            int temp = 0;
            for(int i=d; i < N-d; i++)
               if(arr[i] != arr[i-d] && arr[i] != arr[i+d] && arr[i+d] != arr[i-d])
                  temp++;
            res-=temp;
         }
         System.out.println(res);
      }
   }