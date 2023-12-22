import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (A[i] >= H) {
                    ans = Math.min(ans, B[i]);
                }
                int cost = B[i] * (H / A[i]);
                int dmg = A[i] * (H / A[i]);
                if (dmg >= H) {
                    ans = Math.min(ans, cost);
                } else {
                    for (int j = 0; j < N; j++) {
                        int lastHit = (H - dmg) / A[j] + ((H - dmg) % A[j] > 0 ? 1 : 0);
                        int lastDmg = lastHit * A[j];
                        int lastCost = lastHit * B[j];
                        ans = Math.min(ans, cost + lastCost);
                    }
                }
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
}

