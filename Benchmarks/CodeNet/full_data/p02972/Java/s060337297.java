import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int[] cnts = new int[N];
        for(int i = 0; i < N; i++) {
            cnts[i] = scanner.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int[] sums = new int[N+1];
        for(int i = N; i > 0; i-=2) {
            int above = 0;
            for(int j = i + i; j <= N; j+= i) {
                above += sums[j-1];
            }
            above %= 2;
            int cur;
            if (above == 1) {
                if (cnts[i-1] == 0) cur = 1;
                else cur = 0;
            }
            else {
                if (cnts[i-1] == 0) cur = 0;
                else cur =1;
            }
            if (cur == 1) ans.add(i);
            sums[i-1] = cur;
        }
        out.println(ans.size());
        for(int i = 0; i < ans.size(); i++) {
            if (i > 0) out.print(" ");
            out.print(ans.get(i));
        }
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
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
