/**
 * author: derrick20
 * created: 9/26/20 3:36 PM
 */
import java.io.*;
import java.util.*;

public class Main implements Runnable {
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), ": )", 1 << 28).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[][] orig = new int[N][N];
        for (int i = 0; i < N; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < N; j++) {
                orig[i][j] = line[j] - 'a' + 1; // 1 -> 26
            }
        }
//        printArray(orig);

        long[] basePow = new long[N + 1];
        long[] invPow = new long[N + 1];
        basePow[0] = 1;
        invPow[0] = 1;
        for (int i = 1; i <= N; i++) {
            basePow[i] = (base * basePow[i - 1]) % mod;
            invPow[i] = fastExpo(basePow[i], mod - 2);
        }

        int ans = 0;
        for (int A = 0; A <= N - 1; A++) {
            // shift the board by A down
            int[][] board = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    board[i][j] = orig[(i + A) % N][j];
                }
            }

            // need column hashes
            long[] colHash = new long[N];
            for (int j = 0; j < N; j++) {
                long hash = 0;
                for (int i = 0; i <= N - 1; i++) {
                    hash = (hash * base + board[i][j]) % mod;
                }
                colHash[j] = hash;
            }

//            printArray(board);
//            System.out.println("Column hashes = " + Arrays.toString(colHash));
            long[][] suffixHash = new long[N][N + 1];
//            System.out.println("Suffix hashes = ");
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    suffixHash[i][j] = suffixHash[i][j + 1];
                    suffixHash[i][j] = (suffixHash[i][j] + board[i][j] * basePow[N - 1 - j]) % mod;
                }
//                System.out.println(Arrays.toString(suffixHash[i]));
            }
            for (int B = 0; B <= N - 1; B++) {
                // Check that each row's modified hash matches the column hash
                // of the corresponding column
//                System.out.println();
//                System.out.println("Checking " + A + " " + B);
                boolean valid = true;
                for (int i = 0; i < N; i++) {
                    long tail = suffixHash[i][N - B];
                    long front = suffixHash[i][0] - tail;
                    tail = (tail * basePow[N - B]) % mod;
                    front = (front * invPow[B]) % mod;
                    long rowHash = (tail + front) % mod;
//                    System.out.println("New Front  = " + tail + " New Tail = " + front);
//                    System.out.println("Comparing " + rowHash + " and " + colHash[i]);
                    if (rowHash != colHash[(i - B + N) % N]) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans++;
                }
            }
        }
        out.println(ans);
        out.close();
    }

    static long base = 31;
    static long mod = (long) 1e9 + 7;

    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static long fastExpo(long x, long k) {
        long ans = 1;
        while (k > 0) {
            if (k % 2 == 1) {
                ans = (ans * x) % mod;
            }
            x = (x * x) % mod;
            k >>= 1;
        }
        return ans;
    }

    static class FastScanner {
        private int BS = 1 << 16;
        private char NC = (char) 0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            } catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt = 1;
            boolean neg = false;
            if (c == NC) c = getChar();
            for (; (c < '0' || c > '9'); c = getChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = getChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                cnt *= 10;
            }
            return neg ? -res : res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c != '.' ? cur : cur + nextLong() / cnt;
        }

        public double[] nextDoubles(int N) {
            double[] res = new double[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c > 32) {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c != '\n') {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if (c > 32) return true;
            while (true) {
                c = getChar();
                if (c == NC) return false;
                else if (c > 32) return true;
            }
        }
    }
    static void ASSERT(boolean assertion, String message) {
        if (!assertion) throw new AssertionError(message);
    }
    static void ASSERT(boolean assertion) {
        if (!assertion) throw new AssertionError();
    }
}