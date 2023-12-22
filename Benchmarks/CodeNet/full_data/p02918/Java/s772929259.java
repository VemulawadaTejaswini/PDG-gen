import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        //feels like you need a stack
        int p1 = 0, p2 = 0;
        while(k > 0 && p2 < n) {
            while(p2 < n && s[p2] == s[p1]) p2++;
            while(p2< n && s[p2] != s[p1]) {
                if (s[p2] == 'R') s[p2] = 'L';
                else s[p2] = 'R';
                p2++;
            }
            p1 = p2;
            k--;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (s[i] == 'L' && i > 0 && s[i-1] == 'L') ans++;
            else if (s[i] == 'R' && i < n-1 && s[i+1] == 'R') ans++;
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
