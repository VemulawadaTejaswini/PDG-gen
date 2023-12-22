import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int N = in.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }
            TreeSet<state> states = new TreeSet<>();
            states.add(new state());
            int ans = Integer.MAX_VALUE;
            while (!states.isEmpty()) {
                TreeSet<state> next = new TreeSet<>();
                for (state cur : states) {
                    for (int i = 0; i < N; i++) {
                        state nextState = new state();
                        nextState.dmg = cur.dmg + A[i];
                        nextState.cost = cur.cost + B[i];
                        if (nextState.dmg >= H) {
                            ans = Math.min(ans, nextState.cost);
                        } else {
                            next.add(nextState);
                        }
                    }
                }
                states = next;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class state implements Comparable<state> {
        int dmg;
        int cost;

        public int compareTo(state o) {
            if (dmg != o.dmg) {
                return dmg - o.dmg;
            }
            if (cost != o.cost) {
                return cost - o.cost;
            }
            return 0;
        }

    }
}

