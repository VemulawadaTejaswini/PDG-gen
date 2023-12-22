import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static class Dijkstra {
        int[][] edge;
        boolean[] used;
        PriorityQueue<int[]> que;
        int[] d;

        public Dijkstra(int n) {
            this.edge = new int[n][n];
            this.que = new PriorityQueue<int[]>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            this.d = new int[n];
            for (int[] e : this.edge) {
                Arrays.fill(e, Integer.MAX_VALUE / 4);
            }
            Arrays.fill(this.d, Integer.MAX_VALUE / 4);
        }

        public void set(int i, int j, int cost) {
            this.edge[i][j] = cost;
            this.edge[j][i] = cost;
        }

        public void calc(int s) {
            this.d[s] = 0;
            this.que.add(new int[] { 0, s });

            while (!this.que.isEmpty()) {
                int[] t = this.que.poll();
                if (this.d[t[1]] < t[0]) {
                    continue;
                }
                for (int i = 0; i < this.edge[t[1]].length; i++) {
                    if (this.d[i] > this.d[t[1]] + this.edge[t[1]][i]) {
                        this.d[i] = this.d[t[1]] + this.edge[t[1]][i];
                        this.que.add(new int[] { this.d[i], i });
                    }
                }
            }
        }

        public int distance(int g) {
            return this.d[g];
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Dijkstra dijkstra = new Dijkstra(N);
        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            dijkstra.set(u, v, w);
        }
        dijkstra.calc(0);
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = dijkstra.distance(i) % 2;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
