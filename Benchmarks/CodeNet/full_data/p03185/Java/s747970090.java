import java.util.*;
import java.io.*;

public class Main {

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public double nextDouble() {
            return Float.parseFloat(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static InputReader sc;
    static PrintWriter pw;

    static int max_x = (int) (10e6 + 1);
    static long INF = (long) (10e17 + 5);

    public static void main(String[] args) throws Exception {
        sc = new InputReader(System.in);
        pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        long c = sc.nextLong();

        long[] dp = new long[n];

        LiChowTree liChowTree = new LiChowTree();

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();

            if (i != 0) {
                dp[i] = liChowTree.query(height, 1, max_x, 1) + c + (long) (height) * height;
            }

            liChowTree.add(new Line(-2 * height, (long) (height) * height + dp[i]), 1, max_x, 1);
        }

        pw.println(dp[n-1]);
        pw.close();
    }

    static class LiChowTree {
        static Line[] lines;

        LiChowTree() {

            lines = new Line[4 * max_x];

            for (int i = 1; i < 4 * max_x; i++) {
                lines[i] = new Line(0, INF);
            }
        }

        void add(Line curL, int a, int b, int i) {
            int mid = (a + b) / 2;
            boolean left = curL.getY(a) < lines[i].getY(a);
            boolean middle = curL.getY(mid) < lines[i].getY(mid);;
            if (middle) {
                Line c = curL;
                curL = lines[i];
                lines[i] = c;
            }
            if (b - a == 1) return;
            if (left != middle) add(curL, a, mid, 2 * i);
            else add(curL, mid, b, 2 * i + 1);
        }

        long query(int x, int a, int b, int i) {
            int mid = (a + b) / 2;
            long val = lines[i].getY(x);
            if (b - a == 1) return val;
            if (x < mid) return Math.min(val, query(x, a, mid, i * 2));
            else return Math.min(val, query(x, mid, b, i * 2 + 1));
        }
    }

    static class Line {
        long m, b;

        Line(long m, long b) {
            this.m = m;
            this.b = b;
        }

        long getY(int x) {
            return this.m * x + this.b;
        }
    }
}


