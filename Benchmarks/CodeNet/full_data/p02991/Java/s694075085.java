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

        Queue<Node> queue = new LinkedList<>();
        boolean[][] vis = new boolean[n+1][3];
        queue.offer(new Node(start, 0, 0));
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            Node x = queue.poll();
            if (x.id == end) {
                if (x.hops == 0) {
                    min = Math.min(x.dist, min);
                }
            }
            if (adj.containsKey(x.id)) {
                for (int y : adj.get(x.id)) {
                    if (!vis[y][(x.hops+1)%3]) {
                        queue.offer(new Node(y, (x.hops+1)%3, x.dist+1));
                    }
                }
            }
            vis[x.id][x.hops] = true;
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min/3);
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