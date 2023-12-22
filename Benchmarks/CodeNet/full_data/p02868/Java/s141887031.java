import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    
    public static void main(String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        Edge[] edges = new Edge[M+2];
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long c = sc.nextLong();
            edges[i] = new Edge(l,r,c);
        }
        edges[M] = new Edge(1,1,0);
        edges[M+1] = new Edge(N,N,0);
        Arrays.sort(edges);
        long[] dp = new long[M+2];
        for (int i = 1; i < M+2; i++) dp[i] = Long.MAX_VALUE;
        for (int i = 0; i < M+2; i++) {
            Edge v = edges[i];
            int vs = v.start;
            int j = i + 1;
            while (j < M + 2) {
                Edge e = edges[j];
                // if (e.start >= v.start) {
                //     j++;
                //     continue;
                // }
                if (e.end < vs) break;
                dp[j] = Math.min(dp[j], dp[i] + edges[j].value);
                j++;
            }
        }
        long answer = dp[M+1];
        answer = answer == Long.MAX_VALUE ? -1 : answer;
        writer.println(answer);
        writer.flush();
    }

    static class Edge implements Comparable<Edge> {
        public int start;
        public int end;
        public long value;
        public Edge(int start, int end, long value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
        public int compareTo(Edge e) {
            if (this.end != e.end) {
                return e.end - this.end;
            } else {
                return e.start - this.start;
            }
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
