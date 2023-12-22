import java.util.*;
import java.io.*;
//atcoder
public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;
        int n = scanner.nextInt();
        TreeMap<Long, Integer> mapping = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            long v = scanner.nextInt();
            if (!mapping.containsKey(v)) mapping.put(v, 0);
            mapping.put(v, mapping.get(v) +1);
        }
        while(!mapping.isEmpty()) {
            long cur = mapping.lastKey();
            mapping.put(cur, mapping.get(cur) - 1);
            if (mapping.get(cur) == 0) mapping.remove(cur);
            long next = (Long.highestOneBit(cur)) << 1;
            long val = next - cur;
            if (mapping.containsKey(val)) {
                ans++;
                mapping.put(val, mapping.get(val) -1);
                if (mapping.get(val) == 0) mapping.remove(val);
            }
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
