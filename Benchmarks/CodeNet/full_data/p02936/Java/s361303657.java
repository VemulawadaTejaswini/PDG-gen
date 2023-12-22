import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayList<Integer>[] ale = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                ale[i] = new ArrayList<>();
            }
            int[] cost = new int[n];
            boolean[] used = new boolean[n];
            Arrays.fill(used, false);
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                ale[a].add(b);
                ale[b].add(a);
            }

            for (int i = 0; i < q; i++) {
                int p = in.nextInt() - 1;
                int x = in.nextInt();
                cost[p] += x;
            }

            ArrayDeque<Integer> stack = new ArrayDeque<>();
            stack.push(0);
            while (!stack.isEmpty()) {
                int now = stack.pop();
                used[now] = true;
                for (int nxt : ale[now]) {
                    if (!used[nxt]) {
                        cost[nxt] += cost[now];
                        stack.push(nxt);
                    }
                }
            }

            for (int c : cost) out.print(c + " ");
            out.println();

        }

    }
}

