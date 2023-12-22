import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Graph{
    int v;//no of vertices
    ArrayList<Integer> arr[];
    Graph(int v){
        this.v=v;
        this.arr=new ArrayList[v];
        for(int i=0;i<v;i++){
            this.arr[i]=new ArrayList<Integer>();
        }


    }
    void addEdge(int a,int b){
        this.arr[a].add(b);
    }
}

public class dpdfs {
    static void dfsutil(Graph g,int s,boolean[] visited,int dp[]){
//        visited[s]=true;
//        System.out.print(s+1+" ");
        for(int i=0;i<g.arr[s].size();i++){
                dp[g.arr[s].get(i)]=Math.max(dp[g.arr[s].get(i)],dp[s]+1);
//                visited[g.arr[s].get(i)]=true;
                dfsutil(g,g.arr[s].get(i),visited,dp);

        }

    }
    static int dfs(Graph g){
        boolean visited[]=new boolean[g.v];
        int dp[]=new int[g.v];
        for(int i=0;i<g.v;i++){
            if(visited[i]==false){
                dfsutil(g,i,visited,dp);
            }
        }
//        System.out.println(Arrays.toString(dp));
        int max=0;
        for(int i=0;i<g.v;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int e=s.nextInt();
        Graph g=new Graph(v);
        for(int i=0;i<e;i++){
            g.addEdge(s.nextInt()-1,s.nextInt()-1);

        }
        System.out.println(dfs(g));

    }
}
