import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    static long[] v;
    static int[] w;
    static long[][] memo;
    public static long dp(int idx, int remW){
        if(remW < 0) return -(int)1e9;
        if(idx == n) return 0;
        if(memo[idx][(int) remW] != -1) return memo[idx][(int) remW];
        long take = v[idx] + dp(idx + 1, remW - w[idx]);
        long leave = dp(idx + 1, remW);
        return memo[idx][remW] = Math.max(take, leave);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = Integer.parseInt(sc.next());
        s = Integer.parseInt(sc.next());
        w = new int[n];
        v = new long[n];
        memo = new long[n][s + 1];
        for(long[] arr : memo) Arrays.fill(arr, -1);
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(sc.next());
            v[i] = Integer.parseInt(sc.next());
        }
        pw.println(dp(0, s));
        pw.close();
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

        public boolean ready() throws IOException {
            return br.ready();
        }

        public double nextDouble(String x) {

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


    }
}
