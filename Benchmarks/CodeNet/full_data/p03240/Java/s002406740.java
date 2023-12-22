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

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        LinkedList<Integer> H = new LinkedList<>();
        LinkedList<Integer> Y = new LinkedList<>();
        LinkedList<Integer> X = new LinkedList<>();
        int n = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int h1 = in.nextInt();
        int i = 1;
        while (h1 == 0) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            h1 = in.nextInt();
            i++;
        }
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int H1 = h1 + Math.abs(cx - x1) + Math.abs(cy - y1);
                H.add(H1);
                Y.add(cy);
                X.add(cx);
            }
        }
        for (i = i; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int h = in.nextInt();
            for (int j = 0; j < H.size(); j++) {
                if (h != Math.max(H.get(j) - Math.abs(x - X.get(j)) - Math.abs(y - Y.get(j)), 0)) {
                    H.remove(j);
                    X.remove(j);
                    Y.remove(j);
                    j--;
                }
            }
        }
        out.print(X.get(0) + " " + Y.get(0) + " " + H.get(0));
        //out.print(X.size());
        out.close();
    }
}