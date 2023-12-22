import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMaximumSumOfMinimum solver = new DMaximumSumOfMinimum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumSumOfMinimum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] a = new int[n - 1];
            int[] b = new int[n - 1];

            List<Integer>[] edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                edges[a[i]].add(i);
                edges[b[i]].add(i);
            }

            long[] c = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
            Arrays.sort(c);

            long[] assignment = new long[n];
            Arrays.fill(assignment, -1);

            Queue<Integer> q = new ArrayDeque<>();
            BitSet visited = new BitSet(n);

            for (int i = 0; i < n; i++) {
                if (edges[i].size() == 1) {
                    q.add(i);
                    visited.set(i);
                }
            }

            int cIndex = 0;
            while (!q.isEmpty()) {
                int cur = q.poll();
                assignment[cur] = c[cIndex++];
                for (int e : edges[cur]) {
                    int next = a[e] + b[e] - cur; // other point on edge
                    if (visited.get(next)) {
                        continue;
                    }

                    q.add(next);
                    visited.set(next);
                }
            }

            long answer = 0;
            for (int i = 0; i < n - 1; i++) {
                answer += Math.min(assignment[a[i]], assignment[b[i]]);
            }

            out.println(answer);
            StringBuilder sb = new StringBuilder();
            for (long x : assignment) {
                sb.append(x + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            out.println(sb);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

