import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    final static long MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = fs.nextInt();

        int [][] a = new int[n][3];
        int [][] dp = new int[n][3];

        for(int i = 0; i < n; i++) {
            a[i] = fs.nextIntArray(3);
            if(i == 0) {
                dp[i] = a[i];
            }
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                int temp = 0;
                for(int k = 0; k < 3; k++) {
                    if(k != j) {
                        temp = Math.max(temp, dp[i - 1][k] + a[i][j]);
                    }
                    dp[i][j] = temp;
                }
            }
        }
        out.print(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
        out.flush();
        out.close();
    }


    public static String rString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                // br = new BufferedReader(new FileReader("chat.txt"));
                st = new StringTokenizer("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String next() {
            if (st.hasMoreTokens())
                return st.nextToken();
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String line = "";
            try {
                line = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return line;
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
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

        public char[] nextCharArray() {
            return nextLine().toCharArray();
        }
    }
}



