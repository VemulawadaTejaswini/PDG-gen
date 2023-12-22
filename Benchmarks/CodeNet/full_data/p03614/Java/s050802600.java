import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhilash Mandaliya
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader( inputStream );
        PrintWriter out = new PrintWriter( outputStream );
        TaskD solver = new TaskD();
        solver.solve( 1, in, out );
        out.close();
    }

    static class TaskD {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for ( int i = 0; i < n; i++ ) {
                nums[i] = in.nextInt() - 1;
            }
            int cnt = 0;
            for ( int i = 0; i < n; i++ ) {
                if ( nums[i] == i ) {
                    cnt++;
                    i++;
                }
            }
            out.println( cnt );
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader (InputStream st) {
            this.stream = st;
        }

        public int read () {
            if ( snumChars == - 1 )
                throw new InputMismatchException();
            if ( curChar >= snumChars ) {
                curChar = 0;
                try {
                    snumChars = stream.read( buf );
                } catch ( IOException e ) {
                    throw new InputMismatchException();
                }
                if ( snumChars <= 0 )
                    return - 1;
            }
            return buf[curChar++];
        }

        public int nextInt () {
            int c = read();
            while ( isSpaceChar( c ) ) {
                c = read();
            }
            int sgn = 1;
            if ( c == '-' ) {
                sgn = - 1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while ( ! isSpaceChar( c ) );
            return res * sgn;
        }

        public boolean isSpaceChar (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == - 1;
        }

    }
}