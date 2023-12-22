import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (adj.containsKey(u)) {
                ArrayList<Integer> list = adj.get(u);
                list.add(v);
                adj.put(u, list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(v);
                adj.put(u, list);
            }
        }
        st = new StringTokenizer(in.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        HashMap<Integer, ArrayList<Integer>> newAdj = new HashMap<>();
        for (int x = 1; x <= n; x++) {
            if (adj.containsKey(x)) {
                for (int y : adj.get(x)) {
                    if (adj.containsKey(y)) {
                        for (int z : adj.get(y)) {
                            if (adj.containsKey(z)) {
                                newAdj.put(x, adj.get(z));
                            }
                        }
                    }
                }
            }
        }
        adj = newAdj;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        int[] dist = new int[n+1];
        queue.offer(start);
        while (!queue.isEmpty()) {
            int x = queue.poll();

            if (adj.containsKey(x)) {
                for (int y : adj.get(x)) {
                    if (!vis[y]) {
                        dist[y] = dist[x] + 1;
                        queue.offer(y);
                    }
                }
            }
            vis[x] = true;
        }
        if (dist[end] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(dist[end]);
        }
    }

    static class Node {
        int id, hops, dist;
        public Node(int id, int hops, int dist) {
            this.id = id;
            this.hops = hops;
            this.dist = dist;
        }
    }
}
/*


 */