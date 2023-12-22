import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        Pair[] pairs = new Pair[n];
        for(int i = 0; i < n; i++) {
            pairs[i] = new Pair(scanner.nextInt(), scanner.nextInt());
        }
        double best = 0;
        long curx = 0, cury = 0;
        boolean[] inc = new boolean[n];
        for(int i = 0; i < n; i++) {
            if (pairs[i].y >= 0) {cury += pairs[i].y; curx += pairs[i].x; inc[i] = true;}
        }
        final double EPS = 1e-10;
        while(true) {
            PriorityQueue<Ev> queue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < n;i++) {
                if (inc[i]) {
                    long nx  = curx - pairs[i].x, ny = cury- pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
                else {
                    long nx  = curx + pairs[i].x, ny = cury+ pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
            }
            if (queue.peek().dist > EPS) {
                Ev cur = queue.peek();
                if (inc[cur.ind]) {
                    inc[cur.ind] = false;
                    curx -= pairs[cur.ind].x; cury -= pairs[cur.ind].y;
                }
                else {
                    inc[cur.ind] = true;
                    curx += pairs[cur.ind].x; cury += pairs[cur.ind].y;
                }
            }
            else break;
        }
        best = Math.max(best, Math.sqrt(curx * curx + cury * cury));
        curx = 0; cury = 0;
        Arrays.fill(inc, false);
        for(int i = 0; i < n; i++) {
            if (pairs[i].x >= 0) {cury += pairs[i].y; curx += pairs[i].x; inc[i] = true;}
        }
        while(true) {
            PriorityQueue<Ev> queue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < n;i++) {
                if (inc[i]) {
                    long nx  = curx - pairs[i].x, ny = cury- pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
                else {
                    long nx  = curx + pairs[i].x, ny = cury+ pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
            }
            if (queue.peek().dist > EPS) {
                Ev cur = queue.peek();
                if (inc[cur.ind]) {
                    inc[cur.ind] = false;
                    curx -= pairs[cur.ind].x; cury -= pairs[cur.ind].y;
                }
                else {
                    inc[cur.ind] = true;
                    curx += pairs[cur.ind].x; cury += pairs[cur.ind].y;
                }
            }
            else break;
        }
    
        best = Math.max(best, Math.sqrt(curx * curx + cury * cury));
        curx = 0; cury = 0;
        Arrays.fill(inc, false);
        for(int i = 0; i < n; i++) {
            if (pairs[i].y <= 0) {cury += pairs[i].y; curx += pairs[i].x; inc[i] = true;}
        }
        while(true) {
            PriorityQueue<Ev> queue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < n;i++) {
                if (inc[i]) {
                    long nx  = curx - pairs[i].x, ny = cury- pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
                else {
                    long nx  = curx + pairs[i].x, ny = cury+ pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
            }
            if (queue.peek().dist > EPS) {
                Ev cur = queue.peek();
                if (inc[cur.ind]) {
                    inc[cur.ind] = false;
                    curx -= pairs[cur.ind].x; cury -= pairs[cur.ind].y;
                }
                else {
                    inc[cur.ind] = true;
                    curx += pairs[cur.ind].x; cury += pairs[cur.ind].y;
                }
            }
            else break;
        }
        best = Math.max(best, Math.sqrt(curx * curx + cury * cury));
        curx = 0; cury = 0;
        Arrays.fill(inc, false);
        for(int i = 0; i < n; i++) {
            if (pairs[i].x <= 0) {cury += pairs[i].y; curx += pairs[i].x; inc[i] = true;}
        }
        while(true) {
            PriorityQueue<Ev> queue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < n;i++) {
                if (inc[i]) {
                    long nx  = curx - pairs[i].x, ny = cury- pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
                else {
                    long nx  = curx + pairs[i].x, ny = cury+ pairs[i].y;
                    queue.offer(new Ev(i, Math.sqrt(nx * nx + ny * ny)-Math.sqrt(curx * curx + cury * cury)));
                }
            }
            if (queue.peek().dist > EPS) {
                Ev cur = queue.peek();
                if (inc[cur.ind]) {
                    inc[cur.ind] = false;
                    curx -= pairs[cur.ind].x; cury -= pairs[cur.ind].y;
                }
                else {
                    inc[cur.ind] = true;
                    curx += pairs[cur.ind].x; cury += pairs[cur.ind].y;
                }
            }
            else break;
        }
        best = Math.max(best, Math.sqrt(curx * curx + cury * cury));
        out.println(best);
        out.flush();
    }
    
    static class Ev implements Comparable<Ev>{
        int ind; double dist;
        public Ev(int ii, double dd) {
            ind = ii; dist = dd;
        }
        public int compareTo(Ev o) {
            if (Double.compare(dist, o.dist) == 0) return ind - o.ind;
            return Double.compare(dist, o.dist);
        }
    }
    
    static class Pair {
        int x, y;
        public Pair(int aa, int bb) {
            x = aa; y = bb;
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
