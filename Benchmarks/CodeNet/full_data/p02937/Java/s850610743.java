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
         String input1 = st.nextToken();
         String input2 = infile.readLine();
         char[] arr = input1.toCharArray();
         char[] arr2 = input2.toCharArray();
         int N = arr.length;
         int M = arr2.length;
         //edge
         HashSet<Character> set = new HashSet<Character>();
         for(char c: arr)
            set.add(c);
         for(char c: arr2)
            if(!set.contains(c))
            {
               System.out.println(-1);
               return;
            }
         //define
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         int boof = 0;
         for(char c: arr)
         {
            if(!map.containsKey(c))
               map.put(c, boof++);
         }
         //bst
         TreeSet<Integer>[] bts = new TreeSet[set.size()];
         for(int i=0; i < bts.length; i++)
            bts[i] = new TreeSet<Integer>();
         for(int i=0; i < N; i++)
         {
            int dex = map.get(arr[i]);
            bts[dex].add(i);
         }
         //query
         long res = 0L;
         for(int i=0; i < M; i++)
         {
            int check = map.get(arr2[i]);
            int dex = (int)(res%N);
            if(bts[check].last() < dex)
               res += (N-dex)+bts[check].first();
            else
            {
               int next = bts[check].ceiling(dex);
               if(next != dex || i > 0 && arr2[i] != arr2[i-1])
                  res += next-dex;
               else
               {
                  //neighbors
                  int temp = dex+1;
                  if(bts[check].last() < temp)
                     res += (N-temp)+bts[check].first();
                  else
                     res += bts[check].ceiling(temp)-temp;
                  res++;
               }
            }
         }
         System.out.println(res+1);
      }
   }