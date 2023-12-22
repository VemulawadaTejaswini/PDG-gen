import java.io.*;
import java.util.*;

public class Main {

    public static InputReader in;
    public static PrintWriter out;
    
    public static final int MOD = (int) (1e9 + 7);
    public static void main(String[] args) {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);
        
        int N = in.nextInt(), M = in.nextInt();
        
        int[][] student = new int[N][2];
        for (int i = 0; i < N; i++) {
	    student[i] = new int[] {in.nextInt(), in.nextInt()};
	}
        
        int[][] checkpoint = new int[M][2];
        for (int i = 0; i < M; i++) {
	    checkpoint[i] = new int[] {in.nextInt(), in.nextInt()};
	}
        
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            int dist = Integer.MAX_VALUE;
	    for (int j = 0; j < M; j++) {
		if(d(student[i], checkpoint[j]) < dist) {
		    result[i] = j + 1;
		    dist = d(student[i], checkpoint[j]);
		}
	    }
	}
        
        for (int i : result) {
	    out.println(i);
	}
        
        
        out.close();
    }
    
    public static int d(int[] a, int[] b) {
	return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
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