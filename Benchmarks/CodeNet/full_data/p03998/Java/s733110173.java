import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) throws IOException {
        String[] cards = new String[3];
        cards[0] = receive();
        cards[1] = receive();
        cards[2] = receive();

        int player = 0, next;
        while(true) {
            if(cards[player].length() == 0) break;
            next = cards[player].charAt(0) - 'a';
            cards[player] = cards[player].substring(1);
            player = next;
        }

        println((char)(player + 'A'));
        flush();
    }

    // array関連
    static BigInteger arraySum(BigInteger[] arr) {
        BigInteger ret = BigInteger.ZERO;
        for (BigInteger bi : arr)
            ret.add(bi);
        return ret;
    }

    static BigInteger arraySum(int[] arr) {
        BigInteger ret = BigInteger.ZERO;
        for (int i : arr)
            ret.add(BigInteger.valueOf(i));
        return ret;
    }

    // mod関連
    static BigInteger mod = BigInteger.valueOf((int) Math.pow(10, 9) + 7);

    // 数学関連
    static BigInteger gcd(BigInteger x, BigInteger y) {
        if (y.subtract(x).signum() > 0) {
            return gcd(y, x);
        }
        if (y.equals(BigInteger.ZERO)) {
            return x;
        }
        return gcd(y, x.remainder(y));
    }

    static BigInteger gcd(int x, int y) {
        return gcd(BigInteger.valueOf(x), BigInteger.valueOf(y));
    }

    static BigInteger lcm(int x, int y) {
        return lcm(BigInteger.valueOf(x), BigInteger.valueOf(y));
    }

    static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(gcd(x, y));
    }

    static BigInteger lcm(BigInteger[] arr) {
        BigInteger lcm = BigInteger.ONE;
        for (BigInteger i : arr) {
            lcm = lcm(lcm, i);
        }
        return lcm;
    }

    static BigInteger lcm(int[] arr) {
        BigInteger lcm = BigInteger.ONE;
        for (int i : arr) {
            lcm = lcm(lcm, BigInteger.valueOf(i));
        }
        return lcm;
    }

    static int powerOf2(int x) {
        int ret = 0;
        while (true) {
            if (x % 2 != 0)
                break;
            x /= 2;
            ret++;
        }
        return ret;
    }

    static int digits(int x) {
        int ret = 1;
        while (true) {
            if (x / 10 == 0)
                break;
            x /= 10;
            ret++;
        }
        return ret;
    }

    // 入出力関連
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);

    enum Delimiter {
        NONE(""), SPACE(" "), DOT("\\."), COMMA(",");

        private String regex;

        private Delimiter(String regex) {
            this.regex = regex;
        }

        public String getRegex() {
            return regex;
        }
    }

    static String receive() throws IOException {
        return br.readLine();
    }

    static int receiveInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static BigInteger receiveBigInteger() throws IOException {
        return new BigInteger(br.readLine());
    }

    static char receiveChar() throws IOException {
        return br.readLine().charAt(0);
    }

    static char[] receiveCharArray() throws IOException {
        return br.readLine().toCharArray();
    }

    static int[] receiveIntArray(Delimiter delimiter) throws IOException {
        String[] inputs = br.readLine().split(delimiter.getRegex());
        int[] ret = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ret[i] = Integer.parseInt(inputs[i]);
        }
        return ret;
    }

    static BigInteger[] receiveBigIntegerArray(Delimiter delimiter) throws IOException {
        String[] inputs = br.readLine().split(delimiter.getRegex());
        BigInteger[] ret = new BigInteger[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ret[i] = new BigInteger(inputs[i]);
        }
        return ret;
    }

    static String[] receiveStringArray(Delimiter delimiter) throws IOException {
        return br.readLine().split(delimiter.getRegex());
    }

    static void print(Object obj) {
        pw.print(obj);
    }

    static void println(Object obj) {
        pw.println(obj);
    }

    static void println() {
        pw.println("");
    }

    static void flush() {
        pw.flush();
    }
}