import java.util.*;
import java.io.*;

public class Main {
    static final long base = 89;
    static final long mod = 1000000003;
    static final long mod2 = 1000000007;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        int hi = n/2;
        int lo = 0;
        while(hi >= lo) {
            int mid = (hi + lo)/2;
            if (check(mid, s, n)) lo = mid + 1;
            else hi = mid-1;
        }
        out.println(lo-1);
        out.flush();
    }
    static boolean check(int mid, char[] s, int n) {
        HashMap<Long, Integer> first = new HashMap<>();
        HashMap<Long, Integer> last = new HashMap<>();
        long curHash = 0;
        for(int i = 0; i < mid; i++) {
            curHash = (curHash * base + s[i] - 'a' + 1) % mod;
        }
        first.put(curHash, 0);
        last.put(curHash, 0);
        long sub = modPow(base, mid);
        for(int i = mid; i < n; i++) {
            curHash = (curHash * base + s[i] - 'a' + 1) % mod;
            curHash = (curHash - sub * (s[i-mid] -'a' + 1) + mod) % mod;
            if (!first.containsKey(curHash)) {
                first.put(curHash, i);
            }
            last.put(curHash, i);
        }
        for(Long key: first.keySet()) {
            if (last.get(key) - first.get(key) >= mid) return true;
        }
        return false;
    }
    static long modPow(long x, long p) {
        if (p == 0) return 1L;
        long v = modPow(x, p/2);
        v = (v * v) % mod;
        if (p % 2 == 0) return v;
        return (v * x) % mod;
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
