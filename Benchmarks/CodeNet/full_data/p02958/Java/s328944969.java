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
         int N = Integer.parseInt(st.nextToken());
         st = new StringTokenizer(infile.readLine());
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         //brute force
         if(sort(arr))
         {
            System.out.println("YES");
            return;
         }
         for(int a=0; a < N; a++)
            for(int b=a+1; b < N; b++)
            {
               int[] temp = new int[N];
               for(int i=0; i < N; i++)
                  temp[i] = arr[i];
               temp[a] = arr[b];
               temp[b] = arr[a];
               if(sort(temp))
               {
                  System.out.println("YES");
                  return;
               }
            }
         System.out.println("NO");
      }
      public static boolean sort(int[] arr)
      {
         for(int i=0; i < arr.length; i++)
            if(arr[i] != i+1)
               return false;
         return true;
      }
   }