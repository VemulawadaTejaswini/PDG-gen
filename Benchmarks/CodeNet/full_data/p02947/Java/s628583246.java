/*
Stay innocent, be naive. 
But still dream big. 
Dream big to the point that it is beyond your ability and endeavour to achieve it. 
So dream big and don’t lose your innocence.
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
         HashMap<String, Integer> map = new HashMap<String, Integer>();
         for(int i=0; i < N; i++)
         {
            char[] c = infile.readLine().toCharArray();
            sort(c);
            StringBuilder sb = new StringBuilder();
            for(char x: c)
               sb.append(x);
            String key = sb.toString();
            if(!map.containsKey(key))
               map.put(key, 0);
            map.put(key, map.get(key)+1);
         }
         long res = 0L;
         for(String k: map.keySet())
         {
            long num = map.get(k);
            res += num*(num-1)/2;
         }
         System.out.println(res);
      }
      public static void sort(char[] arr)
      {
         //stable heap sort
         PriorityQueue<Character> pq = new PriorityQueue<Character>();
         for(char a: arr)
            pq.add(a);
         for(int i=0; i < arr.length; i++)
            arr[i] = pq.poll();
      }
   }