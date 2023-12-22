import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    private static final long MOD = 1000000007;

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        long n = in.nextLong();
        long s = in.nextLong();

        long b;
        for (b = 2; b * b <= n; b++) {
            List<Long> n1 = convert(n, b);
            long s1 = 0;
            for (Long aLong : n1) {
                s1 += aLong;
                if (s1 > s) {
                    break;
                }
            }

            if (s1 == s) {
                out.println(b);
                out.close();
                return;
            }
        }

        if (s > n) {
            out.println(-1);
        } else {

            long bb = n - s;
            long d = 1;
            long ans = Long.MAX_VALUE;
            while (d * d <= bb) {
                if (bb % d == 0) {
                    long b1 = bb / d + 1;
                    if (b1 >= b && n / b1 + n % b1 == s) {
                        ans = Math.min(ans, b1);
                    }
                    b1 = d + 1;
                    if (b1 >= b && n / b1 + n % b1 == s) {
                        ans = Math.min(ans, b1);
                    }
                }
                d += 1;
            }
            if (ans != Long.MAX_VALUE) {
                out.println(ans);
            } else {
                if (n == s) {
                    out.println(n);
                } else {
                    out.println(-1);
                }
            }
        }
        out.close();
    }

    private static List<Long> convert(long x, long a) {
        List<Long> res = new ArrayList<>();
        while (x > 0) {
            res.add(x % a);
            x /= a;
        }
        return res;
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}