import java.util.*;
import java.io.*;
public class Main {
    static int dp[];
    static ArrayList<Integer> al[];
    static boolean vis[];
    
    static void DFS(int node)
    {
        if(!vis[node])
        {
            vis[node]=true;
            if(al[node].size()==0)
            {
                dp[node]=0;
            }
            else
            {
                for(int i=0;i<al[node].size();i++)
                {
                    if(!vis[al[node].get(i)])
                    {
                        DFS(al[node].get(i));
                    }
                    dp[node]=Math.max(dp[node],dp[al[node].get(i)]+1);
                }
            }
        }
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      al = new ArrayList[n];
      vis=new boolean[n];
      Arrays.setAll(al,e->new ArrayList());
      dp = new int[n];
     for(int i=0;i<m;i++) 
     {
         int temp1 = sc.nextInt()-1;
         int temp2 = sc.nextInt()-1;
         al[temp1].add(temp2);
     }
     for(int i=0;i<n;i++)
     {
         if(!vis[i])
         {
             DFS(i);
         }
     }
     int max = 0;
     for(int i=0;i<n;i++)
     {
         //w.print(dp[i]+" ");
         if(dp[i]>max)
         {
             max = dp[i];
         }
     }
     w.println(max);
      w.close();
    }
}