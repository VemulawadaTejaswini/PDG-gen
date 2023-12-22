import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

import javax.swing.text.GapContent;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().calc();
    }
    
    public void calc() {
        int N = in.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            T[i] = in.nextInt();
            A[i] = in.nextInt();
        }

        int taka = T[0];
        int aoki = A[0];
                
        for (int i = 1; i < N; i++) {
            if (T[i] == A[i]) {
               taka = Math.max(taka, aoki);
               aoki = taka;
            }
            else if (T[i] >= taka && A[i] >= aoki) {
                taka = T[i];
                aoki = A[i];
            }
            else {
                if (T[i] < A[i]) {                    
                    int x = (int) (T[i] * Math.ceil((double)(aoki) / A[i]));                                        
                    if (taka <= x) {
                        taka = x;
                    }
                    else {
                        if (taka % T[i] != 0) {
                            taka = ((taka / T[i]) + 1) * T[i];                                                                            
                        }
                    }
                    while (true) {                        
                        int a = taka / T[i] * A[i];
                        if (a >= aoki) {
                            aoki = a;
                            break;
                        }
                        taka += T[i];
                    }
                }
                else {
                    int y = (int) (A[i] * Math.ceil((double)(taka) / T[i]));                                        
                    if (aoki <= y) {
                        aoki = y;
                    }
                    else {
                        if (aoki % A[i] != 0) {
                            aoki = ((aoki / A[i]) + 1) * A[i];                                                
                        }
                    }
                    while (true) {
                        int t = aoki / A[i] * T[i];
                        if (t >= taka) {
                            taka = t;
                            break;
                        }
                        aoki += A[i];
                    }                    
                }
            }
            // System.out.println("N:" + i + " taka :" + taka + " aoki:" + aoki );
        }
        
        out.println(taka + aoki);
        out.close();
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
