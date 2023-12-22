/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         long S = Long.parseLong(st.nextToken());
         S *= 2;
         //S*2 = b*h
         System.out.print("0 0 ");
         long base = 1L;
         long height = S;
         while(height > 1000000000L && height%2 == 0)
         {
            height /= 2;
            base *= 2;
         }
         System.out.print(base+" 0 ");
         System.out.println("0 "+height);
      }
      public static long gcd(long a, long b)
      {
         //find gcd
         if(a > b)
         {
            long t = a;
            a = b;
            b = t;
         }
         if(a == 0L)
            return b;
         return gcd(b%a, a);
      }
   }