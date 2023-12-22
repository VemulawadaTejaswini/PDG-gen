import java.io.*;
import java.util.*;

public class Main {

    public static InputReader in;
    public static PrintWriter out;
    
    public static final int MOD = (int) (1e9 + 7);
    public static void main(String[] args) {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);
        
        int N = in.nextInt();
        int A = in.nextInt(), B = in.nextInt();
        
        Long[] v = new Long[N];
        for (int i = 0; i < N; i++) {
	    v[i] = in.nextLong();
	}
        Arrays.sort(v, Collections.reverseOrder());
        
        double[] sum = new double[N + 1];
        for (int i = 1; i <= N; i++) {
	    sum[i] += sum[i - 1] + v[i - 1];
	}
        int maxMeanIdx = 0;
        double maxValue = 0;
        for(int i = A; i <= B; i++) {
            if(sum[i]/(1.0*i) > maxValue) {
        	maxValue = sum[i]/(1.0*i);
        	maxMeanIdx = i;
            }
        }
        
        HashSet<Integer> sizes = new HashSet<Integer>();
        for (int i = A; i <= B; i++) {
	    if(Math.abs(sum[i]/(1.0*i) - sum[maxMeanIdx]/(1.0*maxMeanIdx)) < 1e-6) {
		sizes.add(i);
	    }
	}
        
        choose(N, N);
        
        long result = 0;
        for(Integer ii : sizes) {
            long val = v[ii - 1];
            int r = 0, n = 0;
            for(int i = 0; i < ii; i++) {
                if(v[i] == val) {
                    n++;
                    r++;
                }
            }
            for(int i = ii; i < N; i++) {
                if(v[i] == val) {
                    n++;
                }
            }
            result += nCr[n][r];
        }
        
        out.printf("%f\n", maxValue);
        out.println(result);
        
        out.close();
    }
    
    public static long[][] nCr;
    public static void choose(int maxN, int maxR) {
	
	nCr = new long[maxN + 1][maxR + 1];
        for (int i = 0; i <= maxN; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i==0) {
                    nCr[i][j] = 1;
                } else {
                    nCr[i][j] = nCr[i-1][j-1] + nCr[i-1][j];
                }
            }
        }
    }
    
    static class Node implements Comparable<Node>{
        int next;
        long dist;
        
        public Node (int u, int v) {
            this.next = u;
            this.dist = v;
        }
        
        public void print() {
            out.println(next + " " + dist + " ");
        }
        
        public int compareTo(Node n) {
            return Integer.compare(-this.next, -n.next);
        }
    }
    
    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}