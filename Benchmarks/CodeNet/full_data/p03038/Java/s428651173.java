
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    FastScanner in;

    public static void main(String[] args) {
        new Main().run();
    }

    void run(){
        FastScanner fastScanner = new FastScanner(System.in);
        long n = fastScanner.nextLong();
        long m = fastScanner.nextLong();

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((p1, p2) -> Long.compare(p2.number, p1.number));

        for(int i = 0; i < n; i++) {
            priorityQueue.add(new Pair(fastScanner.nextLong(), 1L));
        }

        for (int i = 0; i < m; i++) {
            long b = fastScanner.nextLong();
            long c = fastScanner.nextLong();
            priorityQueue.add(new Pair(c, b));
        }

        long sum = 0;
        Pair pair;
        for (int i = 0; i < n; i++) {
            pair = priorityQueue.poll();
            sum += pair.number;
            if(pair.amount > 1) {
                priorityQueue.add(new Pair(pair.number, pair.amount - 1));
            }
        }
        System.out.println(sum);

    }

    public class Pair {
        public long number;
        public long amount;

        public Pair(long number, long amount) {
            this.number = number;
            this.amount = amount;
        }
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
