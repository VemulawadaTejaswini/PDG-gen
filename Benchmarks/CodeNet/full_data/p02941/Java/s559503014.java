import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int[] a = new int[n], b = new int[n];
        for(int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for(int i = 0; i < n; i++) b[i] = scanner.nextInt();
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            queue.offer(new Pair(b[i], i));
        }
        int ans = 0;
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            int cur = curr.b;
            if (b[cur] < a[cur]) {
                out.println(-1);
                out.flush();
                return;
            }
            else if (b[cur] == a[cur]) continue;
            int ne = (cur + 1) % n;
            int p = (cur -1 + n) % n;
            int val = b[ne] + b[p];
            if (b[cur] <= val) {
                out.println(-1);
                out.flush();
                return;
            }
            if ((b[cur] - a[cur]) % val == 0) {
                ans += (b[cur] - a[cur]) / val;
                b[cur] = a[cur];
            }
            else {
                ans += b[cur]/(val);
                b[cur] = b[cur] % val;
                queue.offer(new Pair(b[cur], cur));
            }
        }
        out.println(ans);
        out.flush();
    }
    static class Pair implements Comparable<Pair>{
        int a, b;
        public Pair(int aa, int bb) { a = aa; b = bb;}
        public int compareTo(Pair o) {
            if (a == o.a) return o.b-b;
            return o.a - a;
        }
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
