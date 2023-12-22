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
         int M = Integer.parseInt(st.nextToken());
         Unit[] arr = new Unit[N];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Unit(x, y);
         }
         //days increase, reward decrease
         Arrays.sort(arr);
         int maxday = 1;
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         int i=0;
         for(; i < N; i++)
         {
            if(arr[i].a == maxday)
               pq.add(-1*arr[i].b);
            else
               break;
         }
         int res = 0;
         for(; maxday <= M; maxday++)
         {
            for(; i < N; i++)
            {
               if(arr[i].a <= maxday)
                  pq.add(-1*arr[i].b);
               else
                  break;
            }
            if(pq.size() == 0)
               continue;
            int max = -1*pq.poll();
            res += max;
         }
         System.out.println(res);
      }
   }
   class Unit implements Comparable<Unit>
   {
      public int a;
      public int b;
      
      public Unit(int x, int b)
      {
         a = x;
         this.b = b;
      }
      public int compareTo(Unit oth)
      {
         if(a != oth.a)
            return a-oth.a;
         return oth.b-b;
      }
   }