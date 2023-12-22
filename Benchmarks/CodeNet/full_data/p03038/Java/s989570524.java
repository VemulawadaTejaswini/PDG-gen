import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = 998244353;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long maxn = 200005;

    static void solve() {
        int n = ni();
        int m = ni();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long a = nlo();
            sum += a;
            if (!map.containsKey(a)) {
                pq.add(a);
                map.put(a, map.getOrDefault(a, 0) + 1);
            } else
                map.put(a, map.get(a) + 1);
        }
        while (m-- > 0) {
            int k = ni();
            long c = ni();
            while (k > 0 && pq.peek() < c) {
                long cur = pq.poll();
                if (map.get(cur) <= k) {
                    int f = map.get(cur);
                    map.put(c, map.getOrDefault(c, 0) + f);
                    map.remove(cur);
                    sum -= cur * f;
                    sum += c * f;
                    k -= f;
                } else {
                    map.put(c, map.getOrDefault(c, 0) + k);
                    map.put(cur, map.get(cur) - k);
                    sum -= k * cur;
                    sum += c * k;
                    k = 0;
                }
                if (map.containsKey(cur))
                    pq.add(cur);
                pq.add(c);
            }
        }
//        out.println(map);
        out.println(sum);
    }
}