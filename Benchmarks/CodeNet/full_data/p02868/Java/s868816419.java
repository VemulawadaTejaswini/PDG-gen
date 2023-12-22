import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

    private static class Entry {
        final int id;
        final int cost;
        
        Entry(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {

        int[][] costs;
        List<Set<Integer>> links = new ArrayList<>();
        int n, m;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] array;
            array = in.readLine().split(" ");
            n = Integer.parseInt(array[0]);
            m = Integer.parseInt(array[1]);
            
            costs = new int[n][];
            for (int i = 0; i < n; ++i) {
                links.add(new HashSet<>());
                costs[i] = new int[i];
            }
            
            for (int i = 0; i < m; ++i) {
                array = in.readLine().split(" ");
                int l = Integer.parseInt(array[0]) - 1;
                int r = Integer.parseInt(array[1]) - 1;
                int c = Integer.parseInt(array[2]);

                for (int j = l; j < r; ++j) {
                    for (int k = j + 1; k <= r; ++k) {
                        int c0 = costs[k][j];
                        if (c0 != 0 && c0 <= c) {
                            continue;
                        }
                        costs[k][j] = c;
                        links.get(k).add(j);
                    }
                }
            }
        }
        
        int closed = n;
        
        PriorityQueue<Entry> h = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        h.add(new Entry(n - 1, 0));
        while (!h.isEmpty()) {
            Entry e = h.poll();
            
            int n1 = e.id;
            if (closed <= n1) {
                continue;
            }
            closed = n1;
            if (n1 == 0) {
                System.out.println(e.cost);
                System.exit(0);
            }

            int c1 = e.cost;
            for (int n2 : links.get(n1)) {
                int c2 = costs[n1][n2];
                h.add(new Entry(n2, c1 + c2));
            }
        }
        System.out.println(-1);
    }
}
