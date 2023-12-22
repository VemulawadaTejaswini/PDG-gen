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
            char[] s = in.Next().toCharArray();
            char[] t = in.Next().toCharArray();
            boolean success = false;
            LOOP:
            for (int i = s.length - t.length; i >= 0; i--) {
                for (int j = 0; j < t.length; j++) {
                    if (s[i + j] != t[j] && s[i + j] != '?') continue LOOP;
                }
                for (int j = 0; j < t.length; j++) {
                    s[i + j] = t[j];
                }
                success = true;
                break LOOP;
            }
            for (int i = 0; i < s.length; i++) {
                s[i] = (s[i] == '?') ? 'a' : s[i];
            }
            if (success == false) {
                out.println("UNRESTORABLE");
            } else {
                out.println(s);
            }
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