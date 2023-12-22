import java.io.*;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int[] adj = new int[n];
        Pair[] edges  = new Pair[n-1];
        int k = 0;
        for (int i = 0; i < n-1; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            adj[ai-1]++;
            adj[bi-1]++;
            edges[i] = new Pair(ai, bi);
            k = Math.max(k, Math.max(adj[ai-1], adj[bi-1]));
        }
        BitSet[] visited = new BitSet[n];
        for (int i = 0; i < n; i++) {
            visited[i] = new BitSet(k);
        }
        Arrays.sort(edges, (e1, e2) -> {
            return e1.x == e2.x ? e1.y - e2.y : e1.x - e2.x;
        });
        System.out.println(k);
        for (int i = 0; i < n-1; i++) {
            int ai = edges[i].x;
            int bi = edges[i].y;
            int j = 0;
            while (j < k && (visited[ai-1].get(j) || visited[bi-1].get(j))) {
                j++;
            }
            System.out.println(j+1);
            visited[ai-1].set(j);
            visited[bi-1].set(j);
        }
    }

    static class Pair {
        final int x;
        final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
