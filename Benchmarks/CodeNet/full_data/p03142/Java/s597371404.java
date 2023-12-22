
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static List<List<Integer>> children;
    static int[] degree;


    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        n = in.nextInt();
        m = in.nextInt();
        children = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }
        degree = new int[n];
        for (int i = 0; i < m + n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            degree[b]++;
            children.get(a).add(b);
        }
        List<Integer> sorted = new ArrayList<>();
        Queue<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 0) {
                s.add(i);
                sorted.add(i);
            }
        }
        while (!s.isEmpty()) {
            int node = s.poll();
            for (Integer child : children.get(node)) {
                if (--degree[child] == 0) {
                    s.add(child);
                    sorted.add(child);
                }
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int node = sorted.get(n - i - 1);
            for (Integer child : children.get(node)) {
                if (ans[child] == 0) {
                    ans[child] = node + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            out.println(ans[i]);
        }
        out.close();

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }

}