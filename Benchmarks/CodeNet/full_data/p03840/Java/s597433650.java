import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            final int i = in.nextInt();
            final int o = in.nextInt();
            final int t = in.nextInt();
            final int j = in.nextInt();
            final int l = in.nextInt();
            final int s = in.nextInt();
            final int z = in.nextInt();

            long res = o;
            long ans = 0, ans1 = 0;

            int ii = i, jj = j, ll = l;

            ans += (ii%2 == 0) ? ii : ii - 1;
            if (ii%2 == 0) ii = 0; else ii = 1;

            ans += (jj%2 == 0) ? jj : jj - 1;
            if (jj%2 == 0) jj = 0; else jj = 1;

            ans += (ll%2 == 0) ? ll : ll - 1;
            if (ll%2 == 0) ll = 0; else ll = 1;

            if (ii > 0 && jj > 0 && ll > 0) ans += 3;

            ii = i; jj = j; ll = l;


            int mn = Math.min(ii, Math.min(jj, ll));
            ans1 += 3 * (long) mn;
            ii -= mn;
            jj -= mn;
            ll -= mn;
            ans1 += (ii % 2 == 0) ? ii : ii - 1;
            ans1 += (jj % 2 == 0) ? jj : jj - 1;
            ans1 += (ll % 2 == 0) ? ll : ll - 1;
            res += Math.max(ans, ans1);

            out.println(res);

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

