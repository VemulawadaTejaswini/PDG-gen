import java.io.*;
import java.util.*;

public class Main {

    class Reader {
        BufferedReader in;

        Reader() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        StringTokenizer tok = new StringTokenizer("");

        String next() throws IOException {
            if (!tok.hasMoreTokens()) {
                tok = new StringTokenizer(in.readLine());
            }
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(in.readLine());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    class Writer {
        PrintWriter out;

        Writer() {
            out = new PrintWriter(System.out);
        }

        StringBuilder str = new StringBuilder();

        void print(Object o) {
            str.append(o);
        }

        void close() {
            out.write(str.toString());
            out.close();
        }
    }

    void slave() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        String S = in.next();
        long k = in.nextInt();
        long ans = 0;
        int i = 0;
        while (i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
            i++;
        }
        int n = S.length();
        while (n > 0 && S.charAt(n - 1) == S.charAt(0)) {
            n--;
        }
        if (i >= n) {
            ans = S.length() * k;
            ans = (ans - ans % 2) / 2;
        } else {
            long st = i + 1;
            long end = S.length() - n;
            ans += (st - st % 2) / 2;
            ans += (end - end % 2) / 2;
            long count = 0;
            for (i = i + 1; i < n; i++) {
                int j = i;
                while (j + 1 < n && S.charAt(j) == S.charAt(j + 1)) {
                    j++;
                }
                long len = j - i + 1;
                count += (len - len % 2) / 2;
                i = j;
            }
            ans += count * k;
            ans += (((st + end) - (st + end) % 2) / 2) * (k - 1);
        }
        out.print(ans);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().slave();
    }
}