import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }

   /* static class descend implements Comparator<pair1> {
        public int compare(pair1 o1, pair1 o2) {
            if (o1.pop != o2.pop)
                return (int) (o1.pop - o2.pop);
            else
                return o1.in - o2.in;
        }
    }*/

    static class InputReader {
        public BufferedReader br;
        public StringTokenizer token;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        public String next() {
            while (token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
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
    }

    static class card {
        long a;
        int cnt;
        int i;

        public card(long a, int cnt, int i) {
            this.a = a;
            this.cnt = cnt;
            this.i = i;
        }
    }

    static class ascend implements Comparator<pair> {
        public int compare(pair o1, pair o2) {
            return o1.a - o2.a;
        }
    }

    static class extra {

        static boolean v[] = new boolean[100001];
        static List<Integer> l = new ArrayList<>();
        static int t;

        static void shuffle(int a[]) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < a.length; i++)
                l.add(a[i]);
            Collections.shuffle(l);
            for (int i = 0; i < a.length; i++)
                a[i] = l.get(i);
        }

        static long gcd(long a, long b) {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }

        static boolean valid(int i, int j, int r, int c) {
            if (i >= 0 && i < r && j >= 0 && j < c)
                return true;
            else
                return false;
        }

        static void seive() {
            for (int i = 2; i < 100001; i++) {
                if (!v[i]) {
                    t++;
                    l.add(i);
                    for (int j = 2 * i; j < 100001; j += i)
                        v[j] = true;
                }
            }
        }

        static int binary(long a[], long val, int n) {
            int mid = 0, l = 0, r = n - 1, ans = 0;
            while (l <= r) {
                mid = (l + r) >> 1;
                if (a[mid] == val) {
                    r = mid - 1;
                    ans = mid;
                } else if (a[mid] > val)
                    r = mid - 1;
                else {
                    l = mid + 1;
                    ans = l;
                }
            }
            return (ans + 1);
        }

        static long fastexpo(int x, int y) {
            long res = 1;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                }
                y = y >> 1;
                x = x * x;
            }
            return res;
        }

        static long lfastexpo(int x, int y, int p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res = (res * x) % p;
                }
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }
    }

    static class pair {
        int a;
        int b;

        public pair(int a, int i) {
            this.a = a;
            this.b = i;
        }
    }

    static class pair1 {
        pair p;
        int in;

        public pair1(pair a, int n) {
            this.p = a;
            this.in = n;
        }
    }

    static long m = (long) 1e9 + 7;

    static class solver {
        void solve() {
            String st = sc.next();
            int len = st.length();
            char s[] = st.toCharArray();
            long dp[][] = new long[len + 1][13];
            dp[0][0] = 1;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j <= 9; j++) {
                    int res = -1;
                    if (s[i] == '?')
                        res = j;
                    else
                        res = s[i] - '0';
                    for (int k = 0; k <= 12; k++) {
                        int re = (k * 10 + res) % 13;
                        dp[i + 1][re] += dp[i][k];
                        dp[i + 1][re] %= (long) (1e9 + 7);
                    }
                    if (s[i] != '?')
                        break;
                }
            }
            System.out.println(dp[len][5]);
        }
    }
}