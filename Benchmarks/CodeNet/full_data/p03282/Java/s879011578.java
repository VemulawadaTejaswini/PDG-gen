import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
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
            String S = in.nextString();
            long K = in.nextLong();

            char c = '0';
            int i;
            for (i = 0; i < K; i++) {
                if (S.charAt(i) != '1') {
                    out.println(S.charAt(i));
                    return;
                }
            }

            out.println(1);
        }
    }

    // other template
    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static long min(long a, long b) {
        return Math.min(a, b);
    }

    static void fill(int[][] a, int value) {
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], value);
        }
    }

    static void fill(long[][] a, int value) {
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], value);
        }
    }

    static void fill(char[][] a, char c) {
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], c);
        }
    }

    static int max(int a, int b) {
        return Math.max(a, b);
    }

    static long max(long a, long b) {
        return Math.max(a, b);
    }

    // faster input template
    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public double nextDouble() {
            return Double.parseDouble(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }
    }

}
