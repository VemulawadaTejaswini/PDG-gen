import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
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
        int N, C;
        List<List<int[]>> ranges = new ArrayList<>();
        List<Map<Integer, Integer>> ends = new ArrayList<>();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            C = in.nextInt();

            for (int i = 0; i < C; ++i) {
                ranges.add(new ArrayList<>());
                ends.add(new HashMap<>());
            }

            for (int i = 0; i < N; ++i) {
                int s = in.nextInt();
                int t = in.nextInt();
                int c = in.nextInt() - 1;
                ranges.get(c).add(new int[] {s, t});
            }

            for (int i = 0; i < C; ++i) {
                Collections.sort(ranges.get(i), (a, b) -> a[0] - b[0]);
                for (int[] r : ranges.get(i)) {
                    int s = r[0], t = r[1];
                    if (ends.get(i).containsKey(s)) {
                        int l = ends.get(i).get(s);
                        ends.get(i).remove(s);
                        ends.get(i).put(t, l);
                    } else {
                        ends.get(i).put(t, s);
                    }
                }
            }

            Map<Integer, Integer> S = new HashMap<>();
            Map<Integer, Integer> T = new HashMap<>();

            for (int i = 0; i < C; ++i) {
                for (Map.Entry<Integer, Integer> e : ends.get(i).entrySet()) {
                    int s = e.getValue();
                    int t = e.getKey();
                    if (!S.containsKey(s)) S.put(s, 0);
                    if (!T.containsKey(t)) T.put(t, 0);
                    S.put(s, S.get(s) + 1);
                    T.put(t, T.get(t) + 1);
                }
            }

            int cur = 0;
            int ans = 0;

            for (int i = 0; i <= 100000; ++i) {
                if (S.containsKey(i)) {
                    cur += S.get(i);
                    ans = Math.max(ans, cur);
                }
                if (T.containsKey(i)) {
                    cur -= T.get(i);
                }
            }

            out.println(ans);
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

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}