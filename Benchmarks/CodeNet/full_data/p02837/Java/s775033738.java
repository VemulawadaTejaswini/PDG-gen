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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[][][] xy = new int[N][][];
            for (int i = 0; i < N; i++) {
                int A = in.nextInt();
                xy[i] = new int[A][2];
                for (int j = 0; j < A; j++) {
                    xy[i][j][0] = in.nextInt();
                    xy[i][j][1] = in.nextInt();
                }
            }
            int ans = 0;
            for (int mask = 0; mask < (1 << N); mask++) {
                if (check(mask, xy)) {
                    int sum = 0;
                    for (int i = 0; i < 15; i++) {
                        if ((mask & (1 << i)) > 0) {
                            sum++;
                        }
                    }
                    ans = Math.max(sum, ans);
                }
            }
            out.println(ans);
        }

        boolean check(int mask, int[][][] xy) {
            boolean[] t_true = new boolean[xy.length];
            for (int id = 0; id < xy.length; id++) {
                t_true[id] = ((mask & (1 << id)) > 0);
            }
            for (int id = 0; id < xy.length; id++) {
                if ((mask & (1 << id)) > 0) {
                    for (int[] test : xy[id]) {
                        if (t_true[test[0] - 1]) {
                            if (test[1] == 0) return false;
                        } else {
                            if (test[1] == 1) return false;
                        }
                    }
                }
            }
            return true;
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

