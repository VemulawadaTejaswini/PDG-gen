import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        boolean[][] good = new boolean[2][N];
        good[0][0] = true; good[1][0]  = true;
        int prev = scanner.nextInt();
        for(int i = 1; i < N; i++) {
            int next = scanner.nextInt();
            if ((next >= prev && good[0][i-1]) || (next >= prev-1 && good[1][i-1])) good[0][i] = true;
            if ((next-1 >= prev && good[0][i-1]) || (next-1 >= prev-1 && good[1][i-1])) good[1][i] = true;
            prev = next;
        }
        if (good[0][N-1] || good[1][N-1]) out.println("YES");
        else out.println("NO");
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
