import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static long[] dp;
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int m=Integer.parseInt(s[1].trim());
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        int[] dist=new int[n];
        dp=new long[n];
        Arrays.fill(dp,-1);

        while(m-->0){
            s=br.readLine().split(" ");
            int u=Integer.parseInt(s[0].trim())-1;
            int v=Integer.parseInt(s[1].trim())-1;
            al.get(u).add(v);
        }
//        System.out.println(algo(al););
        boolean[] vis=new boolean[n];
        long res=0;
          for(int i=0;i<n;i++){
//            Arrays.fill(vis,false);
            res=Math.max(dfs(al,i),res);

          }
          System.out.println(res);

    }


    public static long dfs(ArrayList<ArrayList<Integer>> al,int u){

        if(dp[u]!=-1){
            return dp[u];
        }
        long res=0;
        for(int v:al.get(u)){
                res=Math.max(res,1+dfs(al,v));
        }
        dp[u]=res;
        return res;
    }




    public static void algo(ArrayList<ArrayList<Integer>> al,int[] dist,int u,boolean[] vis){
        dist[u]=0;
        vis[u]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        while(!q.isEmpty()){
        int u1=q.poll();
        for(int v:al.get(u1)){
            if(dist[v]==0)
            {
                vis[v]=true;
                dist[v]=Math.max(dist[v],1+dist[u1]);
                q.add(v);
            }
        }

        }

    }







}



