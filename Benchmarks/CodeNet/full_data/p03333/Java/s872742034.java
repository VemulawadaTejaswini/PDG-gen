import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Set;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = in.nextInt();
                r[i] = in.nextInt();
            }

            long ans = 0;

            ans = Math.max(ans, calc(n, l, r));

            for (int i = 0; i < n; i++) {
                int tmp = -l[i];
                l[i] = -r[i];
                r[i] = tmp;
            }

            ans = Math.max(ans, calc(n, l, r));

            out.println(ans);
        }

        long calc(int n, int[] l, int[] r) {
            PriorityQueue<Pair1> q1 = new PriorityQueue<>();
            PriorityQueue<Pair2> q2 = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                q1.add(new Pair1(i, l[i]));
                q2.add(new Pair2(i, r[i]));
            }

            long ans = 0;
            int now = 0;
            Set<Integer> used = new TreeSet<>();
            out:
            for (int i = 0; i < n; i++) {
                Pair1 pair1 = null;
                while (true) {
                    if (q1.isEmpty()) break out;
                    pair1 = q1.poll();
                    if (!used.contains(pair1.x) && now <= pair1.y) break;
                    used.add(pair1.x);
                }
                used.add(pair1.x);
                ans += Math.abs(now - pair1.y);
                now = pair1.y;

                Pair2 pair2 = null;
                while (true) {
                    if (q2.isEmpty()) break out;
                    pair2 = q2.poll();
                    if (!used.contains(pair2.x) && now >= pair2.y) break;
                    used.add(pair2.x);
                }
                used.add(pair2.x);
                ans += Math.abs(now - pair2.y);
                now = pair2.y;
            }

            ans += Math.abs(now);

            return ans;
        }

        public class Pair1 implements Comparable<Pair1> {
            int x;
            int y;

            Pair1(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(Pair1 p) {
                return -(y - p.y);
            }

        }

        public class Pair2 implements Comparable<Pair2> {
            int x;
            int y;

            Pair2(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(Pair2 p) {
                return y - p.y;
            }

        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

