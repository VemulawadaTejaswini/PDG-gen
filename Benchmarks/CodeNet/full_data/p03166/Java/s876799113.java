import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

class r{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /**
     * call this method to initialize reader for InputStream
     */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    /**
     * get next word
     */
    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextlong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
public class Main {
    static int dfsutil(Graph g,int s,int dp[]){
//        visited[s]=true;
//        System.out.print(s+1+" ");
        for(int i=0;i<g.arr[s].size();i++){
            dp[s]=Math.max(1+dfsutil(g,g.arr[s].get(i),dp),dp[s]);
//                visited[g.arr[s].get(i)]=true;
//            dfsutil(g,g.arr[s].get(i),dp);

        }
        return dp[s];

    }
    static int dfs(Graph g){
//        boolean visited[]=new boolean[g.v];
        int dp[]=new int[g.v];
        for(int i=0;i<g.v;i++){
                dfsutil(g,i,dp);

        }
//        System.out.println(Arrays.toString(dp));
        int max=0;
        for(int i=0;i<g.v;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) throws IOException{
        r.init(System.in);

        int v=r.nextInt();
        int e=r.nextInt();
        Graph g=new Graph(v);
        for(int i=0;i<e;i++){
            g.addEdge(r.nextInt()-1,r.nextInt()-1);

        }
        System.out.println(dfs(g));

    }
}

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


