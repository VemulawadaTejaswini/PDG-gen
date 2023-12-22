import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner(System.in);

        StringBuilder s = new StringBuilder(fs.nextLine());
        int q = Integer.parseInt(fs.nextLine());
        String[] params;
        boolean isReverse = false;
        for (int i = 0; i < q; i++) {
            params = fs.nextLine().split(" ");
            String t = params[0];
            if (t.equals("1")) {
                isReverse = !isReverse;
            } else {
                String f = params[1];
                if (isReverse) {
                    if (f.equals("1")) {
                        s.append(params[2]);
                    } else {
                        s.insert(0, params[2]);
                    }
                } else {
                    if (f.equals("1")) {
                        s.insert(0, params[2]);
                    } else {
                        s.append(params[2]);
                    }
                }
            }
        }

        if (isReverse) {
            s.reverse();
        }

        System.out.println(s.toString());

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}