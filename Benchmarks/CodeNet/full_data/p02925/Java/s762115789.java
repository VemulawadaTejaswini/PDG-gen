
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int n;
    int[][] vs;
    void run() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        vs = new int[n][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                vs[i][j] = sc.nextInt() - 1;
            }
        }

        int[] cnts = new int[n];

        int d = 0;
        PriorityQueue<V> q = new PriorityQueue<>();
        for (; ; d++) {
            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (cnts[i] == n - 1)
                    continue;
                int t = vs[i][cnts[i]];
//                debug(i, t, cnts[i], cnts[t]);
                int td = vs[t][cnts[t]];
                if (td != i) {
                    continue;
                }
                q.add(new V(cnts[i], i, t));
            }

            if (q.isEmpty()) {
                System.out.println(d);
                return;
            }

            while (!q.isEmpty()) {
                V c = q.remove();
                if (used[c.a] || used[c.b]) {
                    continue;
                }
                used[c.a] = used[c.b] = true;
                cnts[c.a]++;
                cnts[c.b]++;
            }
//            debug(cnts);
        }
    }

    class V implements Comparable<V> {

        int d, a, b;
        V(int d, int a, int b) {
            this.d = d;
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(V o) {
            return d - o.d;
        }
    }

    public int lowerBound(int[] array, int value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] >= value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }
    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
