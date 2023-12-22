
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int m = in.nextInt();
        final boolean[][] edge = new boolean[3 * n][3 * n];
        final int[] cost = new int[3 * n];
        // -1 means not visited.
        Arrays.fill(cost, -1);

        for (int i = 0; i < m; i++) {
            final int from = in.nextInt();
            final int to = in.nextInt();
            edge[(from - 1) * 3][(to - 1) * 3 + 1] = true;
            edge[(from - 1) * 3 + 1][(to - 1) * 3 + 2] = true;
            edge[(from - 1) * 3 + 2][(to - 1) * 3] = true;
        }
        final int s0 = (in.nextInt() - 1) * 3;
        final int t0 = (in.nextInt() - 1) * 3;
        final PriorityQueue<Integer> nodes = new PriorityQueue<>();
        nodes.add(s0);
        cost[s0] = 0;

        while (!nodes.isEmpty()) {
            final Integer from = nodes.poll();
            if (from == t0) {
                System.out.println(cost[from] / 3);
                return;
            }
            for (int i = 0; i < 3 * n; i++) {
                //has edge
                if (edge[from][i] && cost[i] == -1) {
                    cost[i] = cost[from] + 1;
                    nodes.add(i);
                }
            }
        }
        System.out.println(-1);
    }
}