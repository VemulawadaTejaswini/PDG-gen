import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int n = x + y + z;
        int[][] coins = new int[n][3];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 3 ; j++) {
                coins[i][j] = in.nextInt();
            }
        }

        long total = 0;
        for (int i = 0; i < n ; i++) {
            total += coins[i][0];
        }
        int[][] silverBronze = new int[n][3];
        int[][] bronze = new int[n][2];
        for (int i = 0; i < n ; i++) {
            silverBronze[i][0] = i;
            silverBronze[i][1] = coins[i][1] - coins[i][0];
            silverBronze[i][2] = coins[i][2] - coins[i][0];
        }
        PriorityQueue<int[]> silverQ = new PriorityQueue<>(Comparator.comparingInt(u -> -u[1]));
        PriorityQueue<int[]> bronzeQ = new PriorityQueue<>(Comparator.comparingInt(u -> -u[2]));
        for (int i = 0; i < n ; i++) {
            silverQ.add(silverBronze[i]);
            bronzeQ.add(silverBronze[i]);
        }
        int[] used = new int[n];

        long silverTotal = 0;
        for (int i = 0; i < y ; i++) {
            int[] people = silverQ.poll();
            silverTotal += people[1];
            used[people[0]] = 1;
        }


        Stack<int[]> willTake = new Stack<>();
        Stack<int[]> willBack = new Stack<>();

        long bronzeTotal = 0;
        for (int i = 0; i < z ; i++) {
            while (used[bronzeQ.peek()[0]] == 1) {
                int[] a = bronzeQ.poll();
                willTake.push(a);
            }
            int[] peo = bronzeQ.poll();
            used[peo[0]] = 1;
            bronzeTotal += peo[2];
            willBack.push(peo);
        }


        long best = total + silverTotal + bronzeTotal;
        while (willTake.size() >= 1) {
            int[] p = willTake.pop();
            silverTotal -= p[1];
            bronzeTotal += p[2];
            int[] b = willBack.pop();
            bronzeTotal -= b[2];
            used[b[0]] = 0;
            silverQ.add(b);
            while (used[silverQ.peek()[0]] == 1) {
                silverQ.poll();
            }
            int[] s = silverQ.poll();
            silverTotal += s[1];
            used[s[0]] = 1;
            best = Math.max(best, total + silverTotal + bronzeTotal);
        }
        out.println(best);
        out.flush();
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
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

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}