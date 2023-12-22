import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().calc();
    }
    
    int N,M,R;
    int[] r,A,B,C;
    boolean[] done;
    int[][] dist;
    
    public void calc() {
        N = in.nextInt();
        M = in.nextInt();
        R = in.nextInt();
        r = new int[R];
        A = new int[M];
        B = new int[M];
        C = new int[M];

        for (int i = 0; i < R; i++) {
            r[i] = in.nextInt() - 1;
        }

        for (int i = 0; i < M; i++) {
            A[i] = in.nextInt() - 1;
            B[i] = in.nextInt() - 1;
            C[i] = in.nextInt();
        }
        
        int MAX = 999999;
        dist = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dist[i][j] = MAX;
            }
            dist[i][i] = 0;  
        }
        
        for (int i = 0; i < M; i++) {
            dist[A[i]][B[i]] = C[i];
            dist[B[i]][A[i]] = C[i];
        }      
        
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
                
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < R; j++) {
                if (i != j) {
                    boolean[] done = new boolean[R];
                    ans = Math.min(cal(0, i, 1, i, j, done), ans);                    
                }
            }
        }
        
        out.println(ans);
        out.close();
    }
    
    private int cal(int curLength, int curTown, int curTownNum, int s, int e, boolean[] done) {
        if (curTown == e) {
            return curLength;
        }
        
        if (curTownNum == R - 1) {
            return cal(curLength + dist[r[curTown]][r[e]], e, curTownNum + 1, s, e, done);
        }
        
        done[curTown] = true;
        for (int i = 0; i < R; i++) {
            if (!done[i] && i != e) {
                boolean[] done_tmp = new boolean[R];
                for (int k = 0; k < R; k++) {
                    done_tmp[k] = done[k];
                }
                done_tmp[i] = true;
                return cal(curLength + dist[r[curTown]][r[i]], i, curTown + 1, s, e, done_tmp);
            }
        }
        return 999999999;
    }
    
    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
