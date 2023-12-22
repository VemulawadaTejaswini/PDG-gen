/**
 * Created by Aminul on 9/16/2017.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main{
    public static boolean c[][];
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        long mat[][] = new long[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                mat[i][j] = in.nextInt();
            }
        }

        long[][] s= floydWarshall2(n, mat);

//        for(long x[] : s) debug(x);
//        for(boolean x[] : c) debug(x);

       // long mst = mstPrim(n, s);

        long sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                if(!c[i][j])sum += (long)s[i][j];
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(mat[i][j] != s[i][j]){
                    sum = -1;
                    break;
                }
            }
            if(sum == -1) break;
        }


        pw.println(sum);


        pw.close();
    }

    static final int INF = Integer.MAX_VALUE / 2;

/*    
     public static long mstPrim(int n, int[][] d) {

        int[] prev = new int[n+1];
        long[] dist = new long[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        boolean[] visited = new boolean[n+1];
        long res = 0;
        for (int i = 1; i <= n; i++) {
            int u = -1;
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && (u == -1 || dist[u] > dist[j]))
                    u = j;
            }
            res += dist[u];
            visited[u] = true;
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && dist[j] > d[u][j]) {
                    dist[j] = d[u][j];
                    prev[j] = u;
                }
            }
        }
        return res;
    }

    public static int[][] floydWarshall(int n, int[][] d) {
        int[][] pred = new int[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                pred[i][j] = d[i][j];
                //debug(i, j, );
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (d[i][j] > d[i][k] + d[k][j]) {
                        d[i][j] = d[i][k] + d[k][j];
                        pred[i][j] = pred[k][j];
                    }
                }
            }
        }
//        for (int i = 0; i < n; i++)
//            if (d[i][i] < 0)
//                return null;
        return pred;
    }
    */

    static long[][] floydWarshall2(int V, long graph[][]) {
        long dist[][] = new long[V+1][V+1];
        c = new boolean[V+1][V+1];
        int i, j, k;



        for (i = 0; i <= V; i++) {
            for (j = 0; j <= V; j++) {
                dist[i][j] = graph[i][j];
            }
        }


        for (k = 1; k <= V; k++) {
            // Pick all vertices as source one by one
            for (i = 1; i <= V; i++) {
                // Pick all vertices as destination for the
                // above picked source
                for (j = 1; j <= V; j++) {

                    // If vertex k is on the shortest path from
                    // i to j, then update the value of dist[i][j]
                    if (dist[i][k] + dist[k][j] <= dist[i][j]) {
                        if(i != j && j != k && k != i) c[i][j] = true;
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print the shortest distance matrix
        return dist;
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0, ptrbuf = 0;
        static final int ints[] = new int[128];

        public FastReader(InputStream is){
            for(int i='0';i<='9';i++) ints[i]=i-'0';
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
                if(lenbuf <= 0)return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while((b = readByte()) != -1 && isSpaceChar(b));
            return b;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public char nextChar() {
            return (char)skip();
        }

        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt(){
            int num = 0, b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
    }
}