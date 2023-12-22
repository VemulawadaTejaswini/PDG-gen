import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author khokharnikunj8
 */
 class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EStringsOfImpurity solver = new EStringsOfImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class EStringsOfImpurity {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            String s = in.scanString();
            String t = in.scanString();
            int[][] last = new int[s.length()][26];
            for (int i = s.length() - 1; i >= 0; i--) {
                if (i == s.length() - 1) Arrays.fill(last[i], s.length());
                else for (int j = 0; j < 26; j++) last[i][j] = last[i + 1][j];
                last[i][s.charAt(i) - 'a'] = i;
            }
            int length = 0;
            int cur = 0;
            int index = 0;
            int ct = 0;
            while (index < t.length() && ct <= 5 * 10000000) {
                ct++;
                if (last[cur][t.charAt(index) - 'a'] == s.length()) {
                    length += last[cur][t.charAt(index) - 'a'] - cur;
                    cur = (last[cur][t.charAt(index) - 'a']) % s.length();
                } else {
                    length += last[cur][t.charAt(index) - 'a'] - cur + 1;
                    cur = (last[cur][t.charAt(index) - 'a'] + 1) % s.length();
                    index++;
                }
            }
            if (ct >= 5 * 10000000) out.println(-1);
            else out.println(length);
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

        public String scanString() {
            int c = scan();
            if (c == -1) return null;
            while (isWhiteSpace(c)) c = scan();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = scan();
            } while (!isWhiteSpace(c));
            return res.toString();
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}
