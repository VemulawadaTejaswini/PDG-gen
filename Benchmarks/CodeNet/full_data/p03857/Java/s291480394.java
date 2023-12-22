import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static OutWriter out;
    static InReader in;


    public static void main(String args[]) throws IOException {
        in = new InReader();
        out = new OutWriter();
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();

        Pair f1[] = new Pair[k];
        DSU dsu1 = new DSU(n);
        DSU dsu2 = new DSU(n);
        DSU dsuFinal = new DSU(n);
        Pair f2[] = new Pair[l];
        for (int i = 0; i < k; i++) {
            f1[i] = new Pair(in.nextInt() - 1, in.nextInt() - 1);
            dsu1.union_sets(f1[i].x, f1[i].y);
        }
        for (int i = 0; i < l; i++) {
            f2[i] = new Pair(in.nextInt()-1, in.nextInt()-1);
            dsu2.union_sets(f2[i].x, f2[i].y);
        }
        for (int i = 0; i < k; i++) {
            if (dsu2.findParent(f1[i].x) == dsu2.findParent(f1[i].y)) {
                dsuFinal.union_sets(f1[i].x, f1[i].y);
            }
        }
        for (int i = 0; i < l; i++) {
            if (dsu1.findParent(f2[i].x) == dsu1.findParent(f2[i].y)) {
                dsuFinal.union_sets(f2[i].x, f2[i].y);
            }
        }
        for (int i = 0; i < n; i++) {
            out.prints(dsuFinal.rank[dsuFinal.findParent(i)]);
        }

        out.close();
    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class DSU {
        int[] parent;
        long[] rank;

        DSU(int n) {
            parent = new int[n];
            rank = new long[n];
            for (int i = 0; i < n; i++) {
                rank[i] = 1;
                parent[i] = i;
            }
        }

        int findParent(int a) {
            if (parent[a] == a) {
                return a;
            } else {
                parent[a] = findParent(parent[a]);
                return parent[a];
            }
        }

        void union_sets(int a, int b) {
            a = findParent(a);
            b = findParent(b);
            if (a != b) {
                if (rank[a] < rank[b]) {
                    int k = a;
                    a = b;
                    b = k;
                }
                parent[b] = a;
                rank[a] = rank[a] + rank[b];
            }
        }
    }

    static class InReader {
        BufferedReader in;

        InReader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        InReader() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        StringTokenizer token = new StringTokenizer("");

        void update() throws IOException {
            if (!token.hasMoreTokens()) {
                String a = in.readLine();
                if (a != null) {
                    token = new StringTokenizer(a);
                }
            }
        }

        int nextInt() throws IOException {
            update();
            return Integer.parseInt(token.nextToken());
        }

        long nextLong() throws IOException {
            update();
            return Long.parseLong(token.nextToken());
        }

        double nextDouble() throws IOException {
            update();
            return Double.parseDouble(token.nextToken());
        }

        boolean hasNext() throws IOException {
            update();
            return token.hasMoreTokens();
        }

        String next() throws IOException {
            update();
            return token.nextToken();
        }
    }

    static class OutWriter {
        PrintWriter out;

        OutWriter() {
            out = new PrintWriter(System.out);
        }

        OutWriter(String name) throws IOException {
            out = new PrintWriter(new FileWriter(name));
        }

        StringBuilder cout = new StringBuilder();

        <T> void print(T a) {
            cout.append(a);
        }

        <T> void println(T a) {
            cout.append(a);
            cout.append('\n');
        }

        <T> void prints(T a) {
            cout.append(a);
            cout.append(' ');
        }

        void close() {
            out.print(cout.toString());
            out.close();
        }
    }
}