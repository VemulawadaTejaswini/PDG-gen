import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.Solve(in, out);
        out.close();
    }

    static class TaskC {

        void Solve(InputReader in, PrintWriter out) {
          long  a = in.NextInt();
          long  b = in.NextInt();
          long  c = in.NextInt();
          long  ab = Math.min(a + b, c * 2);
            a = Math.min(c * 2, a);
            b = Math.min(c * 2, b);
          long  x = in.NextInt();
          long  y = in.NextInt();
          long  abab = Math.min(x, y);
          long  res = abab * ab;
            x -= abab;
            y -= abab;
            res += x*a;
            res += y*b;
out.println(res);
        }
    }

    static int GetMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int a : ar) {
            max = Math.max(max, a);
        }
        return max;
    }

    static int GetMin(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int a : ar) {
            min = Math.min(min, a);
        }
        return min;
    }

    static long GetSum(int[] ar) {
        long s = 0;
        for (int a : ar) s += a;
        return s;
    }

    static int[] GetCount(int[] ar) {
        return GetCount(ar, GetMax(ar));
    }

    static int[] GetCount(int[] ar, int maxValue) {
        int[] dp = new int[maxValue + 1];
        for (int a : ar) {
            dp[a]++;
        }
        return dp;
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String Next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int NextInt() {
            return Integer.parseInt(Next());
        }

        long NextLong() {
            return Long.parseLong(Next());
        }

        double NextDouble() {
            return Double.parseDouble(Next());
        }

        int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() - offset;
            }
            return a;
        }

        int[][] NextIntMatrix(int n, int m) {
            return NextIntMatrix(n, m, 0);
        }

        int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() - offset;
                }
            }
            return a;
        }


        public long[] NextLongArray(int n) {
            return NextLongArray(n, 0);
        }

        long[] NextLongArray(int n, int offset) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextLong() - offset;
            }
            return a;
        }

        long[][] NextLongMatrix(int n, int m) {
            return NextLongMatrix(n, m, 0);
        }

        long[][] NextLongMatrix(int n, int m, int offset) {
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextLong() - offset;
                }
            }
            return a;
        }
    }
}