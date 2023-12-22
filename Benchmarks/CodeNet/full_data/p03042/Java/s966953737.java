import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter w = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
        String s = in.nextString();
        char[] arr = s.toCharArray();
        boolean flag1 =false, flag2 = false;
        char[] temp = new char[2];
        for (int i=0; i<2; i++) temp[i] = arr[i];
        String month = String.valueOf(temp);
        if (month.equals("01") || month.equals("02") || month.equals("03") || 
        month.equals("04") || month.equals("05") || month.equals("06") || 
        month.equals("07") || month.equals("08") || month.equals("09") ||
        month.equals("10") || month.equals("11") || month.equals("12")) {
            flag1 = true;
        }
        temp = new char[2];
        for (int i=0; i<2; i++) temp[i] = arr[i+2];
        month = String.valueOf(temp);
        if (month.equals("01") || month.equals("02") || month.equals("03") || 
        month.equals("04") || month.equals("05") || month.equals("06") || 
        month.equals("07") || month.equals("08") || month.equals("09") ||
        month.equals("10") || month.equals("11") || month.equals("12")) {
            flag2 = true;
        }
        if (flag1 && flag2) {
            w.println("AMBIGUOUS");
        } else if (flag1) {
            w.println("MMYY");
        } else if (flag2) {
            w.println("YYMM");
        } else {
            w.println("NA");
        }
        w.close();
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

}