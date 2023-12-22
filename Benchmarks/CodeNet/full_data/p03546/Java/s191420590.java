import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();

            int[][] cost = new int[10][10];

            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    cost[i][j] = in.nextInt();
                }
            }

            Set<Integer> s = new HashSet<>();
            for (int i = 0; i < 10; ++i) s.add(i);
            int[] dist = new int[10];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[1] = 0;

            for (int i = 0; i < 10; ++i) {
                int min = Integer.MAX_VALUE;
                int ind = -1;
                for (int j : s) {
                    if (dist[j] < min) {
                        min = dist[j];
                        ind = j;
                    }
                }

                s.remove(ind);
                for (int j : s) {
                    if (dist[j] > dist[ind] + cost[j][ind]) {
                        dist[j] = dist[ind] + cost[j][ind];
                    }
                }
            }

            int res = 0;
            int num;
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    num = in.nextInt();
                    if (num == -1) continue;
                    res += dist[num];
                }
            }

            out.println(res);
        }

    }
}

