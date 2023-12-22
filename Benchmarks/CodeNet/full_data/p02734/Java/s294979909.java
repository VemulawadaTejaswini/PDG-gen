import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }

    static class InputReader {

        public BufferedReader br;
        public StringTokenizer token;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        public String sn() {
            while (token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
        }

        public int ni() {
            return Integer.parseInt(sn());
        }

        public String snl() throws IOException {
            return br.readLine();
        }

        public long nlo() {
            return Long.parseLong(sn());
        }

        public double nd() {
            return Double.parseDouble(sn());
        }

        public int[] na(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.ni();
            return a;
        }

        public long[] nal(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nlo();
            return a;
        }
    }

    static int inf = 5000013;

    static class solver {
        DecimalFormat df = new DecimalFormat("0.00000000");
        long maxi = Integer.MAX_VALUE;
        long mod = (long) (998244353);

        long pro(long a, long b) {
            return (a % mod * b % mod) % mod;
        }

        long add(long a, long b) {
            return (a + b) % mod;
        }

        int n, s, a[];

        long getNum(int l, int r) {
            int d = r - l + 1;
//            out.println(l + " " + r + " " + d);
            long mat[][] = new long[d + 1][s + 1];
            for (int i = 0; i < d + 1; i++) {
                mat[i][0] = 1;
            }
            int map[] = new int[d + 1];
            int p = 1;
            for (int i = l; i <= r; i++)
                map[p++] = i;
            for (int i = 1; i <= d; i++) {
                for (int j = 1; j <= s; j++) {
                    if (j >= a[map[i]])
                        mat[i][j] = add(mat[i][j], add(mat[i - 1][j], mat[i - 1][j - a[map[i]]]));
                    else
                        mat[i][j] = mat[i - 1][j];
                }
            }
            return mat[d][s];
//            for (int i = 0; i <= d; i++) {
//                for (int j = 0; j <= s; j++)
//                    out.print(mat[i][j] + " ");
//                out.println();
//            }
        }

        void solve() {
            n = sc.ni();
            s = sc.ni();
            a = sc.na(n);
            long total = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    total = add(total, getNum(i, j)) % mod;
                }
            }
            out.println(total);
        }
    }
}
