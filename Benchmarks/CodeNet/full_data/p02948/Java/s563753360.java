import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n= scanner.nextInt(), m = scanner.nextInt();
        ArrayList<Integer>[] list = new ArrayList[m+1];
        for(int i = 0; i <= m; i++) list[i] = new ArrayList<>();
        for(int i = 0; i < n; i++ ){
            int t = scanner.nextInt();
            if (t > m) continue;
            list[t].add(scanner.nextInt());
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long ans = 0;
        for(int i = 1; i <= m; i++) {
            for(int val: list[i]) {
                queue.offer(val);
            }
            ans += !queue.isEmpty() ? queue.poll() : 0;
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
