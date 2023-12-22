import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        String s = scanner.next();
        s += s;
        char[] str = s.toCharArray();
        char[] cpy = Arrays.copyOf(str, str.length);
        long k = scanner.nextLong();
        Arrays.sort(cpy);
        if (cpy[0] == cpy[cpy.length-1]) {
            long ans = k * str.length/4;
            out.println(ans);
            out.flush();
            return;
        }
        long ans = 0;
        int n = str.length/2;
        long temp = 0;
        for(int i = 1; i < n*2; i++) {
            if (str[i] == str[i-1]) {
                str[i] = 0;
                if (i >= n) temp++;
                else ans++;
            }
        }
        ans += (k-1) * temp;
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
