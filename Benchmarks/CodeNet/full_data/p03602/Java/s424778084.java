import java.util.*;

class Item implements Comparable<Item> {
    public int val, i, j;
    public Item(int a, int b, int c) {
        i = a; j = b; val = c;
    }
    public int compareTo(Item item) {
        return val - item.val;
    }
}
class Edge {
    public int v, w;
    public Edge(int a, int b) {
        v = a; w = b;
    }
}
public class Main {
    static int n;
    static Item[] item;
    static ArrayList<Edge> adj[];
    static int[] dis;
    static boolean[] inque;
    static void spfa(int s) {
        Arrays.fill(dis, Integer.MAX_VALUE);
        Queue<Integer> que = new LinkedList<>();
        dis[s] = 0;
        inque[s] = true;
        que.offer(s);
        while(!que.isEmpty()) {
            int u = que.poll();
            inque[u] = false;
            for(int i = 0; i < adj[u].size(); i++) {
                int v = adj[u].get(i).v;
                int w = adj[u].get(i).w;
                if(dis[v] > dis[u] + w) {
                    dis[v] = dis[u] + w;
                    if(!inque[v]) {
                        inque[v] = true;
                        que.offer(v);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        item = new Item[n * (n - 1) / 2];
        int cnt_item = 0;
        for(int i = 1; i <= n; i++) for(int j = 1; j <= n; j++) {
            int val = in.nextInt();
            if(i < j) item[cnt_item++] = new Item(i, j, val);
        }
        inque = new boolean[n + 1];
        adj = new ArrayList[n + 1];
        dis = new int[n + 1];
        for(int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        Arrays.sort(item);
        long ans = 0;
        for(int i = 0; i < cnt_item; i++) {
            int u = item[i].i, v = item[i].j, val = item[i].val;
            spfa(u);
            if(dis[v] < val) {
                System.out.println("-1");
                return;
            }
            else if(dis[v] > val) {
                adj[u].add(new Edge(v, val));
                adj[v].add(new Edge(u, val));
                ans += val;
            }
        }
        System.out.println(ans);
    }
}
