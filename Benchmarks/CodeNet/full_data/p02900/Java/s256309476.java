import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        HashSet<Long> hashSet;
        HashSet<Long> kkk;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            long a = in.scanLong();
            long b = in.scanLong();


            hashSet = new HashSet<>();
            kkk = new HashSet<>();
            for (long i = 1; i * i <= a; i++) {
                if (a % i == 0) {
                    if ((b % i) == 0) hashSet.add(i);
                    if ((b % (a / i)) == 0) hashSet.add((a / i));
                }
            }

            long ar[] = new long[hashSet.size()];
            int k = 0;
            for (long p : hashSet) ar[k++] = p;
            Arrays.sort(ar);


            long ans = 1;
            for (int i = 1; i < k; i++) {
                if (check(ar[i])) {
                    ans++;
                    kkk.add(ar[i]);
                }
            }
            out.println(ans);


        }

        boolean check(long x) {
            for (long i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    if (kkk.contains(i)) return false;
                    long t = x / i;
                    if (kkk.contains(t)) return false;
                }
            }
            return true;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public long scanLong() {
            long I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

    }
}

