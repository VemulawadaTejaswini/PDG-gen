import java.util.*;
import java.io.*;

public class Main {
    static long mod = 998244353;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int[] dists = new int[n];
        for(int i =0; i < n; i++)  {
            dists[i] = scanner.nextInt();
            if ((i == 0 && dists[i] != 0) || (i != 0 && dists[i] == 0)) {
                System.out.println(0);
                return;
            }
        }
        Arrays.sort(dists);
        long ans = 1;
        int p = 1;
        long prev = 1;
        for(int i = 1; i < n; i++) {
            long cnt = 0;
            while(p < n && dists[p] == i) {
                cnt++;
                p++;
            }
            if (cnt == 0) break;
            ans = (ans * modPow(prev, cnt)) % mod;
            prev = cnt;
        }
        if (p < n) out.println(0);
        else out.println(ans);
        out.flush();
    }
    static long modPow(long x, long p) {
        if (p == 0) return 1L;
        long t = modPow(x, p/2);
        t = (t * t) % mod;
        if (p % 2 == 0) return t;
        return (x * t) % mod;
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
