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
         int Q = Integer.parseInt(st.nextToken());
         LinkedList<Integer>[] edges = new LinkedList[N+1];
         for(int i=1; i <= N; i++)
            edges[i] = new LinkedList<Integer>();
         for(int i=0; i < N-1; i++)
         {
            st = new StringTokenizer(infile.readLine()); 
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
         }
         //query
         int[] addon = new int[N+1];
         for(int i=0; i < Q; i++)
         {
            st = new StringTokenizer(infile.readLine()); 
            int p = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            addon[p] += x;
         }
         //dfs
         int[] res = new int[N+1];
         dfs(edges, 1, addon, res, new boolean[N+1]);
         StringBuilder sb = new StringBuilder();
         for(int i=1; i <= N; i++)
            sb.append(res[i]+" ");
         System.out.println(sb.toString());
      }
      public static void dfs(LinkedList<Integer>[] edges, int curr, int[] addon, int[] res, boolean[] seen)
      {
         res[curr] += addon[curr];
         seen[curr] = true;
         for(int next: edges[curr])
         {
            if(seen[next])
               continue;
            res[next] += res[curr];
            dfs(edges, next, addon, res, seen);
         }
      }
   }