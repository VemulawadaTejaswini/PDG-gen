import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static List<Node>[] g = new ArrayList[n];
    static long[] d = new long[n];

    public static void main(String[] args){
        d[0] = 0;
        for (int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }

        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Node>();
            if (i!=0) g[i].add(new Node(i-1, 0));

        }
        for (int i=0; i<m; i++){
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int c = sc.nextInt();
            g[l].add(new Node(r, c));
        }

        System.out.println(dijkstra());

    }

    public static long dijkstra(){
        Arrays.fill(d, Long.MAX_VALUE);
        d[0] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0, 0));

        while (!pq.isEmpty()){
            Node nd = pq.poll();
            if (nd.node==n-1) return nd.cost;
            if (nd.cost > d[nd.node]) continue;

            for (Node next: g[nd.node]){
                if (d[next.node] > nd.cost+next.cost){
                    d[next.node] = nd.cost+next.cost;
                    pq.add(new Node(next.node, nd.cost+next.cost));
                }
            }

        }
        return -1;
    }

    public static class Node implements Comparable<Node>{
        int node;
        int cost;
        public Node(int n, int c){
            this.node = n;
            this.cost = c;
        }
        public int compareTo(Node nd){
            if (this.cost<nd.cost) return -1;
            if (this.cost>nd.cost) return 1;
            return 0;
        }
    }

}