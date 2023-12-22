import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 998244353;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        long ans = 1;
        for(int i = 2; i <= n; i++) ans = (ans * (long)i) % MOD;
        int[] cnt = new int[3];
        String x = "RGB";
        int curMin = 0, curMax = 0;
        long open = 0, closed = 0, other = 0;
        for(int i = 0; i < 3*n; i++) {
            int ind = x.indexOf(s[i]);
            cnt[ind]++;
            int newMin = Math.min(Math.min(cnt[0], cnt[1]), cnt[2]);
            int newMax = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
            //clsoed something
            //can choose which we close
            if (newMin != curMin)  {
                ans = (ans * other) % MOD;
                closed++;
                other--;
            }
            //opened a new one
            else if (newMax != curMax) {
                open++;
            }
            //add an other to an opened one
            else {
                ans = (ans * open) % MOD;
                open--;
                other++;
            }
            curMin = newMin;
            curMax = newMax;
        }
        out.println(ans);
        out.flush();
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
