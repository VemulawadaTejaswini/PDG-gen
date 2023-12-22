import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) throws IOException {
        int num = receiveInt();
        BigInteger[] inputs = new BigInteger[num];
        for(int i = 0; i < num; i++) {
            inputs[i] = receiveBigInteger();
        }
        BigInteger ans = lcm(inputs);
        println(ans);
        flush();
    }

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
        return Stream.of(br.readLine().split(delimiter.getRegex())).mapToInt(Integer::parseInt).toArray();
    }

    static String[] receiveStringArray(Delimiter delimiter) throws IOException {
        return Stream.of(br.readLine().split(delimiter.getRegex())).toArray(String[]::new);
    }

    static void print(Object obj) {
        pw.print(obj);
    }

    static void println(Object obj) {
        pw.println(obj);
    }

    static void flush() {
        pw.flush();
    }
}