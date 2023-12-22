import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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


        public void Solve(InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] t = in.NextIntArray(n);
            int sum = 1;
            for (int i = 0; i < n; i++) sum += t[i];
            int[] speed = new int[sum];
            Arrays.fill(speed, Integer.MAX_VALUE);
            for (int i = 0; i < speed.length; i++) {
                speed[i] = Math.min(i, speed.length - i - 1);
            }
            int ct = 0;
            for (int i = 0; i < n; i++) {
                int cs = in.NextInt();
                for (int k = 0; k <= t[i]; k++) {
                    int cst = cs;
                    for (int j = ct; j >= 0; j--) {
                        speed[j] = Math.min(speed[j], cst);
                        cst++;
                    }
                    cst = cs;
                    for (int j = ct; j < speed.length; j++) {
                        speed[j] = Math.min(speed[j], cst);
                        cst++;
                    }
                    if (k != t[i])
                        ct++;
                }
            }
            float total = 0;
            for (int i = 1; i < speed.length; i++) {
                total += ((float) (speed[i] + speed[i - 1])) / 2;
            }
            out.println(total);
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