
import java.util.Arrays;
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
        for (; ; d++) {
            boolean[] used = new boolean[n];
            boolean end = true;
            for (int i = 0; i < n; i++) {
                if (cnts[i] == n - 1 || used[i])
                    continue;
                int t = vs[i][cnts[i]];
                int td = vs[t][cnts[t]];
                if (td != i) {
                    System.out.println(-1);
                    return;
                }
                if (used[t]) continue;
                used[i] = used[t] = true;
                cnts[i]++;
                cnts[t]++;
                end = false;
            }
            if (end) {
                System.out.println(d);
                return;
            }
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
