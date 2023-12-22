import java.io.*;
import java.util.*;

public class Main {
    static class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    static class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }


    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int n = in.nextInt();
        int m = in.nextInt();
        String s = in.next();
        String t = in.next();
        long L = (n * m) / gcd(n, m);
        long Ls = L / n;
        long Lt = L / m;
        boolean must = true;
        long HOK = (Ls * Lt) / gcd(Ls, Lt);
        int sd = (int) (HOK / Ls);
        int td = (int) (HOK / Lt);
        for (int i = 0; i * HOK < L; i++) {
            if (s.charAt(sd * i) != t.charAt(td * i)) {
                must = false;
                break;
            }
        }
        if (must) {
            out.print(L);
        } else {
            out.print("-1");
        }
        out.close();
    }
}