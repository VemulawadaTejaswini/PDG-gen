import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*
     ___   _____   _____   _____   _____   _____   _____   _____
    /   | /  ___| /  ___| | ____| |  _  \ |_   _| | ____| |  _  \
   / /| | | |     | |     | |__   | |_| |   | |   | |__   | | | |
  / / | | | |     | |     |  __|  |  ___/   | |   |  __|  | | | |
 / /  | | | |___  | |___  | |___  | |       | |   | |___  | |_| |
/_/   |_| \_____| \_____| |_____| |_|       |_|   |_____| |_____/
 */

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
//        FastReader in = new FastReader(inputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.flush();
        out.close();
    }

    static class TaskC {

        public void solve(int kase, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            P[] ids = new P[m];
            for (int i = 0; i < m; ++i) {
                int l = in.nextInt();
                int r = in.nextInt();
                ids[i] = new P(l, r);
            }
            Arrays.sort(ids, (o1, o2) -> {
                if (o1.first < o2.first || o1.first == o2.first && o1.second < o2.second) return -1;
                if (o1.first > o2.first || o1.first == o2.first && o1.second > o2.second) return 1;
                return 0;
            });
            int l = 0, r = n + 1;
            for (int i = 0; i < m; ++i) {
                if (l > ids[i].second || ids[i].first > r) {
                    r = l - 1;
                    break;
                }
                l = Math.max(l, ids[i].first);
                r = Math.min(r, ids[i].second);
            }
            out.println(r - l + 1);
        }

        class P {
            int first, second;

            public P(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
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

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
