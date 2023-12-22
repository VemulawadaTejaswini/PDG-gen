import java.io.*;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
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
        writer.println(k);
        for (int i = 0; i < n-1; i++) {
            int ai = edges[i].x;
            int bi = edges[i].y;
            int j = 0;
            while (j < k && visited[ai-1].get(j) || visited[bi-1].get(j)) {
                j++;
            }
            writer.println(j+1);
            visited[ai-1].set(j);
            visited[bi-1].set(j);
        }
        writer.flush();
        writer.close();
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
