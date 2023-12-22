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
         int M = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         int[][] grid = new int[N][M];
         for(int i=0; i < N; i++)
         {
            String input = infile.readLine();
            for(int a=0; a < M; a++)
               if(input.charAt(a) == '1')
                  grid[i][a] = 1;
         }
         int res = Integer.MAX_VALUE;
         outer:for(int mask=0; mask < (1<<(N-1)); mask++)
         {
            ArrayList<Integer>[] cake = new ArrayList[Integer.bitCount(mask)+1];
            for(int i=0; i < cake.length; i++)
               cake[i] = new ArrayList<Integer>();
            int dex = 0;
            for(int i=0; i < N; i++)
            {
               cake[dex].add(i);
               if((mask&(1<<i)) > 0)
                  dex++;
            }
            int temp = Integer.bitCount(mask);
            int[] cnt = new int[cake.length];
            for(int i=0; i < M; i++)
            {
               int max = 0;
               for(int a=0; a < cake.length; a++)
                  for(int x: cake[a])
                  {
                     cnt[a] += grid[x][i];
                     max = Math.max(max, cnt[a]);
                  }
               if(max > K)
               {
                  //cut
                  int[] next = new int[cake.length];
                  for(int a=0; a < cake.length; a++)
                     for(int x: cake[a])
                        next[a] += grid[x][i];
                  cnt = next;
                  max = 0;
                  for(int x: next)
                     max = Math.max(max, x);
                  if(max > K)
                     continue outer;
                  temp++;
               }
            }
            res = Math.min(res, temp);
         }
         System.out.println(res);
      }
   }