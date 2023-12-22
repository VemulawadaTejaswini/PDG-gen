import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        static long MOD = 1_000_000_007;

        public void Solve(InputReader in, PrintWriter out) {
            long n = in.NextLong();
            int max = 0;
            {
                long temp = n;
                while (temp != 0) {
                    max += temp % 10;
                    temp /= 10;
                }
            }
            for (int i = 1; ; i++) {
                long v = 0;
                for (int j = 0; j < i; j++) {
                    v *= 10;
                    v += 9;
                }
                if (v < n) {
                    max = Math.max(9 * i, max);
                } else {
                    break;
                }
            }
            {
                int i = 0;
                int maxi = -1;
                long temp = n;
                while (temp != 0) {
                    if (temp % 10 != 0) {
                        maxi = i;
                    }
                    temp /= 10;
                    i++;
                }
                if (maxi != -1) {
                    temp = n;
                    int tempMaxi = maxi;
                    while (tempMaxi != 0) {
                        temp /= 10;
                        tempMaxi--;
                    }
                    temp--;
                    while (maxi != 0) {
                        maxi--;
                        temp *= 10;
                        temp += 9;
                    }
                    int tempMax = 0;
                    while (temp != 0) {
                        tempMax += (temp % 10);
                        temp /= 10;
                    }
                    max = Math.max(tempMax, max);
                }
            }
            out.println(max);
        }
    }


    public static int GetMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int a : ar) {
            max = Math.max(max, a);
        }
        return max;
    }

    public static int GetMin(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int a : ar) {
            min = Math.min(min, a);
        }
        return min;
    }

    public static long GetSum(int[] ar) {
        long s = 0;
        for (int a : ar) s += a;
        return s;
    }

    public static int[] GetCount(int[] ar) {
        return GetCount(ar, GetMax(ar));
    }

    public static int[] GetCount(int[] ar, int maxValue) {
        int[] dp = new int[maxValue + 1];
        for (int a : ar) {
            dp[a]++;
        }
        return dp;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String Next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(Next());
        }

        public long NextLong() {
            return Long.parseLong(Next());
        }

        public double NextDouble() {
            return Double.parseDouble(Next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() - offset;
            }
            return a;
        }

        public int[][] NextIntMatrix(int n, int m) {
            return NextIntMatrix(n, m, 0);
        }

        public int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() - offset;
                }
            }
            return a;
        }
    }
}