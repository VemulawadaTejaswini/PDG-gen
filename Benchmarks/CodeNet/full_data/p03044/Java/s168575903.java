import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug == false) {
            return;
        }
        System.out.println(str);
    }

    public static class Edge {
        int u;
        int v;
        int w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    public static class Node {
        List<Edge> edge = new LinkedList<>();
    }

    public static void main(String[] args) {

        int N;
        Node[] node;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            node = new Node[N];
            for (int i = 0; i < N; i++) {
                node[i] = new Node();
            }
            for (int i = 0; i < N - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                Edge e = new Edge(u, v, w%2);
                node[u-1].edge.add(e);
                node[v-1].edge.add(e);
            }
        }
        int[] distans = new int[N];
        HashSet<Edge> visited = new HashSet<>();
        Deque<Integer> queue = new LinkedList<>();
        queue.push(1);
        distans[0] = 0;
        Integer target;
        while((target = queue.pollFirst()) != null){
            List<Edge> list = node[target -1].edge;
            for(Edge e : list){
                if(visited.contains(e)){
                    continue;
                }else{
                    int d = (distans[target-1] + e.w) %2;
                    int i;
                    if(e.u != target ){
                        i = e.u;
                    }else{
                        i = e.v;
                    }
                    queue.addLast(i);
                    distans[i  -1] = d;
                    visited.add(e);
                }
            }
        }
        for(int i : distans){
            System.out.println(i%2);
        }
    }


}
