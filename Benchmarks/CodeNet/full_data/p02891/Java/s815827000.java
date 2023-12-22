import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
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

        void solve(InputReader in, PrintWriter out) {
            String S = in.next();
            long K = in.nextLong();

            int len = S.length();
            boolean lrSame = S.charAt(0) == S.charAt(len - 1);

            ArrayList<Integer> sucs = new ArrayList<Integer>();

            int cnt = 1;
            char prev = 'A';
            for (int i = 0; i < len; ++i) {
                char c = S.charAt(i);
                if (c == prev) {
                    cnt++;
                } else {
                    if (i > 0)
                        sucs.add(cnt);
                    cnt = 1;
                }
                if (i == len - 1) {
                    sucs.add(cnt);
                }
                prev = c;
            }

            if (sucs.size() < 2) {
                out.println(K * len / 2);
            } else if (lrSame) {
                int r = sucs.get(sucs.size() - 1);
                sucs.set(sucs.size() - 1, sucs.get(sucs.size() - 1) + sucs.get(0));

                long ans = 0;
                for (int i = 1; i < sucs.size(); ++i) {
                    ans += (long) sucs.get(i) / 2;
                }
                ans *= K;

                ans += sucs.get(0) / 2;
                ans -= (sucs.get(sucs.size() - 1) / 2 - r / 2);

                out.println(ans);
            } else {
                long ans = 0;
                for (int i = 0; i < sucs.size(); ++i) {
                    ans += (long) sucs.get(i) / 2;
                }
                ans *= K;
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
