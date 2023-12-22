import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        sc.close();

        ArrayList<LinkedList<Integer>> edge = new ArrayList<>();

        for(int i=0; i<N; i++){
            LinkedList<Integer> nodelist = new LinkedList<Integer>();
            if(i > 0){
                nodelist.add(i-1);
            }
            if(i < N-1){
                nodelist.add(i+1);
            }
            if(i == X-1){
                nodelist.add(Y-1);
            }
            if(i == Y-1){
                nodelist.add(X-1);
            }
            edge.add(nodelist);
        }

        int[] result = new int[N];

        for(int i=0; i<N; i++){
            int dist[] = bfs(i, edge, N);
            for(int j=i+1; j<N; j++){
                result[dist[j]] += 1;
            }
        }

        for(int i=1; i<N; i++){
            System.out.println(result[i]);
        }
    }

        static int[] bfs(int snode,  ArrayList<LinkedList<Integer>> g, int n) {
        // snode start node, g graph (list), n number of node

        // 初期条件
        int[] dist = new int[n];            //snode からの頂点xの距離
        Arrays.fill(dist, -1); // -1の頂点は未探索
        dist[snode] = 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(snode);

        while(!queue.isEmpty()){
            int v = queue.poll();

            for(int i: g.get(v)){
                if (dist[i] != -1){
                    continue;
                }

                if(g.get(v).contains(i)){
                    dist[i] = dist[v] + 1;              //前提条件　長さ1
                    queue.add(i);
                }
            }
        }
        return dist;
    }
}