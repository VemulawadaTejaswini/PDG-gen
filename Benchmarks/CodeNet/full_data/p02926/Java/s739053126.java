import java.util.*;
import java.io.*;

public class Engines {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        ArrayList<P> pts = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int xx = scanner.nextInt(), yy = scanner.nextInt();
            if (xx == 0 && yy == 0) continue;
            x.add(xx); y.add(yy);
            pts.add(new P(xx, yy));
        }
        n = pts.size();
        Collections.sort(pts, (a,b)-> Double.compare(a.getAngle(), b.getAngle()));
        for(int i = 0; i <n ; i++) {
            pts.add(pts.get(i));
            x.add(x.get(i));
            y.add(y.get(i));
        }
        double ans = 0;
        for(int i = 0; i < n; i++) {
            long curx = 0; long cury = 0;
            for(int j = i; j < Math.min(pts.size(), i + n); j++) {
                curx += x.get(j); cury += y.get(j);
                ans = Math.max(ans,  Math.hypot(curx, cury));
            }
        }
        out.println(ans);
        out.flush();
    }
    static class P{
        int x, y;
        public P (int xx, int yy) {
            x = xx; y = yy;
        }
        double getAngle() {
            return Math.atan2(y,x);
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
