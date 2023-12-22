import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.Collections;
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
        FManySlimes solver = new FManySlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class FManySlimes {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int[] ar = new int[1 << n];
            in.scanInt(ar, 1 << n);
            CodeHash.radixSort(ar);
            boolean flag = true;
            ArrayList<Integer> current = new ArrayList<>();
            current.add(ar[(1 << n) - 1]);
            int ind = (1 << n) - 2;
            int[] qu = new int[(1 << n) + 5];
            int fr = 0;
            int ba = 0;
            for (int i = 0; i < n; i++) {
                Collections.sort(current, Collections.reverseOrder());
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j : current) {
                    if (fr < ba) {
                        if (qu[fr] < j) temp.add(qu[fr++]);
                    } else {
                        int iind = ind;
                        while (iind >= 0 && ar[iind] >= j) qu[ba++] = ar[iind--];
                        if (iind == -1) {
                            out.println("No");
                            return;
                        }
                        ind = iind;
                        temp.add(ar[ind--]);
                    }
                }
                for (int j : temp) current.add(j);
            }
            if (fr == ba)
                out.println("Yes");
            else
                out.println("No");
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

        public int scanInt() {
            int integer = 0;
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

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

        public void scanInt(int[] A, int size) {
            for (int i = 0; i < size; i++) A[i] = scanInt();
        }

    }

    static class CodeHash {
        public static int[] radixSort(int[] f) {
            int[] to = new int[f.length];
            {
                int[] b = new int[65537];
                for (int i = 0; i < f.length; i++) b[1 + (f[i] & 0xffff)]++;
                for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
                for (int i = 0; i < f.length; i++) to[b[f[i] & 0xffff]++] = f[i];
                int[] d = f;
                f = to;
                to = d;
            }
            {
                int[] b = new int[65537];
                for (int i = 0; i < f.length; i++) b[1 + (f[i] >>> 16)]++;
                for (int i = 1; i <= 65536; i++) b[i] += b[i - 1];
                for (int i = 0; i < f.length; i++) to[b[f[i] >>> 16]++] = f[i];
                int[] d = f;
                f = to;
                to = d;
            }
            return f;
        }

    }
}

