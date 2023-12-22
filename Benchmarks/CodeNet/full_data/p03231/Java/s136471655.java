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


    static int gcd(int a, int b) {
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
        int lsp = (n * m) / gcd(n, m);
        int lss = lsp / n;
        int lst = lsp / m;
        char X[] = new char[lsp];
        boolean must = true;
        for (int i = 0; i < n; i++) {
            X[i * lss] = s.charAt(i);
        }
        for (int i = 0; i < m; i++) {
            if (X[i * lst] == 0) {
                X[i * lst] = t.charAt(i);
            } else {
                if (X[i * lst] != t.charAt(i)) {
                    must = false;
                    break;
                }
            }
        }
        if (must) {
            out.print(lsp);
        } else {
            out.print("-1");
        }
        out.close();
    }
}