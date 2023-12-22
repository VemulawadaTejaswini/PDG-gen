
import java.io.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;


public class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solver s = new solver();
        long t = 1;
        while (t > 0) {
            s.sol();
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

    static class ascend implements Comparator<pair> {
        public int compare(pair o1, pair o2) {
            return o2.b - o1.b;
        }
    }

    static class extra {

        static boolean v[] = new boolean[100001];
        static List<Integer> l = new ArrayList<>();
        static int t;

        static void shuffle(int a[]) {
            for (int i = 0; i < a.length; i++) {
                int t = (int) Math.random() * a.length;
                int x = a[t];
                a[t] = a[i];
                a[i] = x;
            }
        }

        static void shufflel(long a[]) {
            for (int i = 0; i < a.length; i++) {
                int t = (int) Math.random() * a.length;
                long x = a[t];
                a[t] = a[i];
                a[i] = x;
            }
        }

        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }

        static boolean valid(int i, int j, int r, int c) {
            if (i >= 0 && i < r && j >= 0 && j < c) {
                // System.out.println(i+" /// "+j);
                return true;
            } else {
                //  System.out.println(i+" //f "+j);
                return false;
            }
        }

        static void seive() {
            for (int i = 2; i < 101; i++) {
                if (!v[i]) {
                    t++;
                    l.add(i);
                    for (int j = 2 * i; j < 101; j += i)
                        v[j] = true;
                }
            }
        }

        static int binary(LinkedList<Integer> a, long val, int n) {
            int mid = 0, l = 0, r = n - 1, ans = 0;
            while (l <= r) {
                mid = (l + r) >> 1;
                if (a.get(mid) == val) {
                    r = mid - 1;
                    ans = mid;
                } else if (a.get(mid) > val)
                    r = mid - 1;
                else {
                    l = mid + 1;
                    ans = l;
                }
            }
            return (ans + 1);
        }

        static long fastexpo(long x, long y) {
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

        static long lfastexpo(long x, long y, long p) {
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

               /* void dijsktra(int s, List<pair> l[], int n) {
                    PriorityQueue<pair> pq = new PriorityQueue<>(new ascend());
                    int dist[] = new int[100005];
                    boolean v[] = new boolean[100005];
                    for (int i = 1; i <= n; i++)
                        dist[i] = 1000000000;
                    dist[s] = 0;
                    for (int i = 1; i < n; i++) {
                        if (i == s)
                            pq.add(new pair(s, 0));
                        else
                            pq.add(new pair(i, 1000000000));
                    }
                    while (!pq.isEmpty()) {
                        pair node = pq.remove();
                        v[node.a] = true;
                        for (int i = 0; i < l[node.a].size(); i++) {
                            int v1 = l[node.a].get(i).a;
                            int w = l[node.a].get(i).b;
                            if (v[v1])
                                continue;
                            if ((dist[node.a] + w) < dist[v1]) {
                                dist[v1] = dist[node.a] + w;
                                pq.add(new pair(v1, dist[v1]));
                            }
                        }
                    }
                }*/
    }

    static class pair {
        int a;
        int b;

        public pair(int a, int b) {
            this.a = a;
            this.b = b;
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

    static int inf = 5000013;

    static class solver {
        DecimalFormat df = new DecimalFormat("0.00000000");
        extra e = new extra();
        long mod = (long) (1000000007);
        int g[][];

        void sol() throws IOException {
            long n = sc.nlo();
            long min = Long.MAX_VALUE;
            for (int i = 1; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0)
                    min = Math.min(min, (i + (n / i) - 2));
            }
            System.out.println(min);
        }
    }
}
