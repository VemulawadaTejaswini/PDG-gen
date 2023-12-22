import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    static FastReader r = new FastReader();
    static PrintWriter p = new PrintWriter(new BufferedOutputStream(System.out), true);
    public static void main(String[] args) {
        int h = r.nextInt(), w = r.nextInt();
        final int n = 10;
        int[][] price = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                price[i][j] = r.nextInt();
        
        //Floyd Warshall
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    price[i][j] = Math.min(price[i][j], price[i][k] + price[k][j]); 

        long count = 0;
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++) {
                int a;
                if ((a = r.nextInt()) == -1)
                    continue;
                count += price[a][1];
            }
        outln(count);
    }
    static Object out(Object o) {
        return out(o, true);
    }
    static Object out(Object o, boolean autoFlush) {
        p.print(o);
        if (autoFlush)
            p.flush();
        return o;
    }
    static Object outln(Object o) {
        p.println(o);
        return o;
    }
    static void outln() {
        p.println();
    }
    static class FastReader {
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
        char nextChar() {
            try {
                return (char)br.read();
            } catch (IOException e) {
                return '\0';
            }
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
        float nextFloat() {
            return Float.parseFloat(next()); 
        }
        String nextLine() {
            try {
                return br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        void close() {
            try {
                br.close();
            } catch (Exception e) {}
        }
    }
}