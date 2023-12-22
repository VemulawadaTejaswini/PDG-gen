import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Q = in.nextInt();
        Node[] e = new Node[n + 1];
        for (int i = 1; i < n; ++i) {
            int a = in.nextInt();
            int c = in.nextInt();
            if (e[a] == null) e[a] = new Node();
            if (e[c] == null) e[c] = new Node();
            e[a].next.add(c);
            e[c].next.add(a);
        }
        long[] b = new long[n + 1];
        Arrays.fill(b, 0);
        for (int i = 0; i < Q; ++i) {
            int p = in.nextInt();
            int x = in.nextInt();
            b[p] += x;
        }
        long[] cnt = new long[n + 1];
        Arrays.fill(cnt, 0);
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while (!queue.isEmpty()) {
            int p = queue.poll();
            vis[p] = true;
            if (b[p] > 0) {
                if (e[p] == null) e[p] = new Node();
                List<Integer> list = e[p].next;
                int m = list.size();
                for (int i = 0; i < m; ++i) {
                    int v = list.get(i);
                    if (vis[v]) continue;
                    b[v] += b[p];
                    queue.offer(v);
                }
                cnt[p] += b[p];
            }
        }
        for (int i = 1; i <= n; ++i)
            System.out.print(cnt[i] + (i == n ? "\n" : " "));
    }

    static class Node {
        List<Integer> next = new ArrayList<>();
    }
}
