import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            String str = s.nextString();
            int[] arr = new int[str.length() + 1];
            int i = 0;
            while (i < str.length()) {
                int j = i;
                int count = 0;
                while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                    count++;
                    j++;
                }

                if (str.charAt(i) == '<') {
                    int curr = Math.max(0, arr[i]);
                    while (i < j) {
                        arr[i] = curr;
                        i++;
                        curr++;
                    }
                    arr[i] = curr;

//                arr[i + 1] = curr;
                } else if (str.charAt(i) == '>') {
                    if (arr[i] > count) {
                        int curr = count - 1;
                        while (i < j) {
                            arr[i + 1] = curr;
                            i++;
                            curr--;
                        }
                    } else {
                        int curr = count;
                        while (i < j) {
                            arr[i] = curr;
                            i++;
                            curr--;
                        }
                    }
//                arr[i + 1] = curr;
                }
                i = j;
            }
//        if(str.charAt(0) == '<'){
//            arr[0] = arr[1] - 1;
//        } else {
//            arr[0] = arr[1] + 1;
//        }

//        out.println(arrays.printArr(arr));
            long sum = 0L;
            for (int j = 0; j < arr.length; j++) {
                sum += (long) arr[j];
            }
            out.println(sum);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
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
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

