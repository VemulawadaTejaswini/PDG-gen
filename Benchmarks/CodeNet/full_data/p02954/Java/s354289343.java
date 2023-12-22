import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        char[] s = scanner.next().toCharArray();
        int p1 = 0;
        int p2 = 0;
        int N = s.length;
        int[] end = new int[N];
        while(p1 < N || p2 < N) {
            while(p2 < N && s[p2] == s[p1]) p2++;
            if (s[p1]=='R') while(p1 != p2) end[p1++] = p2-1;
            else {
                for(int i = p1; i < p2; i++) end[i] = p1;
                p1 = p2;
            }
        }
        int[] ans = new int[N];
        for(int i =0; i < N; i++) {
            int dist = Math.abs(end[i] - i);
            if (dist % 2 == 0 && s[i] == 'R') ans[end[i]]++;
            if (dist % 2 == 1 && s[i] == 'R') ans[end[i]+1]++;
            if (dist % 2 == 0 && s[i] == 'L') ans[end[i]]++;
            if (dist % 2 == 1 && s[i] == 'L') ans[end[i]-1]++;
        }
        for(int i = 0; i < N; i++) {
            if (i > 0) out.print(" " );
            out.print(ans[i]);
        }
        out.println();
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
