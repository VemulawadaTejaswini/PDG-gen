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

    private static long fastPow(long x, long y, long mod) {
        if (x == 1) {
            return 1;
        }
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2, mod) % mod;
        p = p * p % mod;
        if (y % 2 == 1) {
            p = p * x % mod;
        }
        return p;
    }

    static long[] getPartialSums(long[] a) {
        if (a.length == 0) {
            return new long[]{0};
        }
        long[] res = new long[a.length + 1];

        for (int i = 1; i <= a.length; i++) {
            res[i] = res[i - 1] + a[i - 1];
        }

        return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int n = in.nextInt();
        final int k = in.nextInt();
        final long[] a = readLongArray(n, in);

        final long[] sums = getPartialSums(a);
        final long[] positiveSums = new long[n + 1];
        for (int i = 1; i <= a.length; i++) {
            if (a[i - 1] > 0) {
                positiveSums[i] = positiveSums[i - 1] + a[i - 1];
            } else {
                positiveSums[i] = positiveSums[i - 1];
            }
        }
        long best = 0;
        for (int i = 0; i + k <= n; i++) {
            long sumWhiteInterval = positiveSums[i] + positiveSums[n] - positiveSums[i + k];
            best = Math.max(best, sumWhiteInterval);
            long sumBlackInterval = positiveSums[i] + positiveSums[n] - positiveSums[i + k] + sums[i + k] - sums[i];
            best = Math.max(best, sumBlackInterval);
        }

        out.println(best);
//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }


    private static String outputArray(Iterable<Integer> ans, Map<String, Integer> out) {
        StringBuilder str = new StringBuilder();
        for (int an : ans) {
            str.append(an).append(' ');
        }
        String s = str.toString();
        out.put(s, out.getOrDefault(s, 0) + 1);
        return s;
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
