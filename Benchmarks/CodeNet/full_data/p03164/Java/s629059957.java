

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    final static long MOD = 1000000007;

    public static void main(String args[]) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt();
        int w = fs.nextInt();

        Pair [] items = new Pair[n];

        for(int i = 0; i < n; i++) {
            items[i] = new Pair(fs.nextInt(), fs.nextInt());
        }

        Arrays.sort(items, (o1, o2) -> Integer.compare(o1.w, o2.w));

       // out.println(Arrays.toString(items));

        long dp[][] = new long[n+1][w+1];


        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < w+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if(j - items[i-1].w >= 0) {
                        dp[i][j] = Math.max(dp[i - 1][j - items[i-1].w] + items[i-1].v, dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        /*for(int i = 0; i < n+1; i++) {
            out.println(i+" "+ Arrays.toString(dp[i]));
        }*/
        out.println(dp[n][w]);
        out.flush();
        out.close();
    }

    static class Pair {
        int w;
        int v;

        Pair(int w, int v) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "("+this.w+", "+this.v+")";
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                //                br = new BufferedReader(new FileReader("file2.txt"));

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


