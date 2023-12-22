import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;
    public static int N;

    public static int[] col;
    public static boolean[] vis;
    public static int midpoint;


    public static boolean dfs1(int u, int dist){
        if(u == N - 1){
            midpoint = (dist + 1) / 2;
            return true;
        }
        boolean f = false;
        for(int v : adjList.get(u)){
            if(!vis[v]){
                vis[v] = true;
                if(dfs1(v, dist+1)){
                    if(dist == midpoint){
                        col[u] = 2;
                    }
                    f = true;
                }
            }
        }
        return f;
    }

    public static int dfs2(int u){
        int total = 1;
        for(int v : adjList.get(u)){
            if(!vis[v] && col[v] != 2){
                vis[v] = true;
                total += dfs2(v);
            }
        }
        return total;
    }

    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < N; i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < N - 1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        col = new int[N];
        vis = new boolean[N];
        vis[0] = true;
        dfs1(0, 0);
        vis = new boolean[N];

        vis[0] = true;
        int a = dfs2(0);

        vis = new boolean[N];
        vis[N-1] = true;
        int b = dfs2(N-1);

        // pw.print(a + " " + b + "\n");
        pw.print(a > b ? "Fennec\n" : "Snuke\n");


        pw.close(); 
        br.close();
    }
}

class Pair {
    public int a;
    public long b;

    Pair(int a, long b){
        this.a = a;
        this.b = b;
    }

}