import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = sc.nextInt(), m = sc.nextInt();
        long min = Long.MAX_VALUE;
        for (long i = 0; i < n - 1; i++) {
            long first = (i + 1) * m;
            long leftRows = n - i - 1;
            long second = (m / 2) * leftRows, third = ((m + 1) / 2) * leftRows;
            long second2 = (leftRows / 2) * m, third2 = ((leftRows + 1) / 2) * m;
            min = Math.min(min, Math.max(first, Math.max(second, third)) - Math.min(first, Math.min(second, third)));
            min = Math.min(min, Math.max(first, Math.max(second2, third2)) - Math.min(first, Math.min(second2, third2)));
        }

        for (int i = 0; i < m - 1; i++) {
            long first = (i + 1) * n;
            long leftCols = m - i - 1;
            long second = (n / 2) * leftCols, third = ((n + 1) / 2) * leftCols;
            long second2 = (leftCols / 2) * n, third2 = ((leftCols + 1) / 2) * n;
            min = Math.min(min, Math.max(first, Math.max(second, third)) - Math.min(first, Math.min(second, third)));
            min = Math.min(min, Math.max(first, Math.max(second2, third2)) - Math.min(first, Math.min(second2, third2)));
        }

        out.println(min);
        out.flush();
        out.close();
    }
























    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}