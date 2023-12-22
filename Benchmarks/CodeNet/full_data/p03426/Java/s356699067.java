import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int H, W, D;
        int[][] A;

        Map<Integer, int[]> index = new HashMap<>();
        List<List<Integer>> accum = new ArrayList<>();

        int Q;

        void solve(InputReader in, PrintWriter out) {
            H = in.nextInt();
            W = in.nextInt();
            D = in.nextInt();

            A = new int[H][W];
            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < W; ++j) {
                    A[i][j] = in.nextInt() - 1;
                    index.put(A[i][j], new int[] { i, j });
                }
            }

            for (int i = 0; i < D; ++i) {
                List<Integer> cm = new ArrayList<>();
                cm.add(0);
                accum.add(cm);
            }

            for (int i = D; i < H * W; ++i) {
                List<Integer> cm = accum.get(i % D);
                int prev = cm.get(cm.size() - 1);
                int[] p1 = index.get(i - D); int[] p2 = index.get(i);
                int mp = Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
                accum.get(i % D).add(prev + mp);
            }

            Q = in.nextInt();
            for (int i = 0; i < Q; ++i) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                int ans = accum.get(l % D).get(r / D) - accum.get(l % D).get(l / D);
                out.println(ans);
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}