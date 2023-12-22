import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] x;
    static int[] y;
    static int[] parent;
    public static void main(String[] args) {
        N = sc.nextInt();
        parent = new int[N];
        x = new int[N];
        y = new int[N];
        for(int i=0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int M = N*(N-1)/2;
        int[] vx = new int[M];
        int[] vy = new int[M];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                vx[index] = x[j] - x[i];
                vy[index] = y[j] - y[i];
                index++;
            }
        }
        int ans = N;
        for(int k = 0; k < M; k++) {
            int p = vx[k];
            int q = vy[k];
            // System.out.print(p);
            // System.out.print(",");
            // System.out.println(q);
            UF uf = new UF(N);
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    int dx = x[j] - x[i];
                    int dy = y[j] - y[i];
                    int c = p != 0 ? dx/p : dy/q;
                    int d = p != 0 ? dx%p : dy%q;
                    boolean cond = dx == c * p && dy == c * q;
                    if (d == 0 && cond) {
                        uf.union(i,j);
                    }
                }
            }
            ans = Math.min(ans,uf.unionNumber());
        }
        writer.println(ans);
        writer.flush();
    }

    static class UF {
        private int[] parent;
        private int size;
        public UF(int size) {
            this.parent = new int[size];
            this.size = size;
            for(int i = 0; i < size; i++) {
                this.parent[i] = i;
            }
        }
        public int root(int x) {
            int y = this.parent[x];
            if (x==y) return(y);
            return(this.parent[x] = this.root(y));
        }
        public void union(int x, int y){
            int rootX = this.root(x);
            int rootY = this.root(y);
            this.parent[rootY] = rootX;
        }
        public int unionNumber() {
            Set<Integer> s = new HashSet<Integer>();
            for(int i = 0; i < size; i++) {
                s.add(root(i));
            }
            return s.size();
        }
    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE
}