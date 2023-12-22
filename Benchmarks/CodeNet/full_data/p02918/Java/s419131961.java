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
         int K = Integer.parseInt(st.nextToken());
         String input = infile.readLine();
         char[] arr = input.toCharArray();
         int res = 0;
         for(int i=1; i < N-1; i++)
         {
            if(arr[i] == 'L' && arr[i-1] == 'L') 
               res++;
            else if(arr[i] == 'R' && arr[i+1] == 'R') 
               res++;
         }
         if(N >= 2)
         {
            if(arr[0] == 'R' && arr[1] == 'R')
               res++;
            if(arr[N-1] == 'L' && arr[N-2] == 'L')
               res++;
         }
         ArrayList<Character> ls = new ArrayList<Character>();
         char curr = arr[0];
         for(int i=1; i < N; i++)
            if(curr != arr[i])
            {
               ls.add(curr);
               curr = arr[i];
            } 
         ls.add(curr);
         for(int i=1; i < ls.size()-1; i+=2)
         {
            if(K == 0)
               break;
            res += 2;
            K--;
         }
         if(K > 0 && ls.get(0) != ls.get(ls.size()-1))
            res++;
         System.out.println(res);
      }
   }