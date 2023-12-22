import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        NotsoDiverse solver = new NotsoDiverse();
        solver.solve(1, in, out);
        out.close();
    }

    static class NotsoDiverse {
        int[] cnt = new int[200001];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            for (int i = 0; i < N; i++) {
                cnt[in.nextInt()]++;
            }
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < cnt.length; i++) {
                if (cnt[i] > 0) {
                    arr.add(cnt[i]);
                }
            }
            Collections.sort(arr);
            int ans = 0;
            for (int i = 0; i < arr.size() - K; i++) {
                ans += arr.get(i);
            }
            out.println(ans);
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

