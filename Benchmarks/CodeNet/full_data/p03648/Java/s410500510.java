import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long k = sc.nextLong();
        long[] res = new long[50];
        for (int i = 0; i < 50; i++)
            res[i] = k / 50 + 49;
        int rem = (int)(k % 50);
        for (int i = 0; i < rem; i++) {
            res[0] += 50;
            for (int j = 1; j < 50; j++)
                res[j]--;
        }
        for (int i = 0; i < 50; i++) {
            if (i > 0) out.print(" ");
            out.print(res[i]);
        }
        out.println();
        out.close();
    }
























    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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