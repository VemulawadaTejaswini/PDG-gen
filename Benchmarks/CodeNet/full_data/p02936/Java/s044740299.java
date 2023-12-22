import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static List<Integer>[] edge = new ArrayList[n];
    static boolean[] visited = new boolean[n];
    static long[] point = new long[n];

    public static void main(String[] args){

        for (int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
        int q = sc.nextInt();
        for (int i=0; i<n-1; i++){
            int s = sc.nextInt()-1;
            int t = sc.nextInt()-1;
            edge[s].add(t);
            edge[t].add(s);
        }

        for (int i=0; i<q; i++){
            int t = sc.nextInt()-1;
            int x = sc.nextInt();
            point[t] += x;
        }

        dfs(0, 0l);

        for (int i=0; i<n; i++){
            System.out.print(point[i]+" ");
        }
    }

    private static void dfs(int u, long p){
        visited[u] = true;
        point[u] += p;
        for (int v: edge[u]){
            if (!visited[v]){
                dfs(v, point[u]);
            }
        }

    }
}