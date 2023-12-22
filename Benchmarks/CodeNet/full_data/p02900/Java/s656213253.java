import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        ArrayList<Integer> arrayList = new ArrayList<>();

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            long a = in.scanLong();
            long b = in.scanLong();
            long gcd = CodeHash.gcd(a, b);
            for (long i = 2; i * i <= gcd; i++) {
                if (gcd % i == 0) {
                    int ct = 0;
                    while (gcd % i == 0) {
                        gcd /= i;
                        ct++;
                    }
                    arrayList.add(ct);
                }
            }
            if (gcd > 1) arrayList.add(1);
            out.println(arrayList.size() + 1);
        }

    }

    static class CodeHash {
        public static long gcd(long a, long b) {
            while (b != 0) {
                long t = b;
                b = (a % b);
                a = t;
            }
            return a;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public long scanLong() {
            long integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

    }
}

