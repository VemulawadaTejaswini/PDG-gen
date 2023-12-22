import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        solve();
        Stdin.flush();
    }

    static void solve() {
        char[] input = Stdin.receiveCharArray();
        Stdin.println(input[2] == input[3] && input[4] == input[5] ? "Yes" : "No");
    }

}

class Stdin {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);

    public enum Delimiter {
        NONE(""), SPACE(" "), DOT("\\."), COMMA(",");

        private String regex;

        private Delimiter(String regex) {
            this.regex = regex;
        }

        public static Delimiter of(String input) {
            try {
                return Delimiter.valueOf(input.toUpperCase());
            } catch (IllegalArgumentException e) {
                return Arrays.stream(values()).filter(d -> d.getRegex().equals(input)).findFirst().orElse(SPACE);
            }
        }

        public String getRegex() {
            return regex;
        }
    }

    static String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static int receiveInt() {
        return Integer.parseInt(nextLine());
    }

    static BigInteger receiveBigInteger() {
        return new BigInteger(nextLine());
    }

    static char receiveChar() {
        return nextLine().charAt(0);
    }

    static char[] receiveCharArray() {
        return nextLine().toCharArray();
    }

    static int[] receiveIntArray(Delimiter delimiter) {
        String[] inputs = nextLine().split(delimiter.getRegex());
        int[] ret = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ret[i] = Integer.parseInt(inputs[i]);
        }
        return ret;
    }

    static int[] receiveIntArray(String delimiterString) {
        return receiveIntArray(Delimiter.of(delimiterString));
    }

    static BigInteger[] receiveBigIntegerArray(Delimiter delimiter) {
        String[] inputs = nextLine().split(delimiter.getRegex());
        BigInteger[] ret = new BigInteger[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ret[i] = new BigInteger(inputs[i]);
        }
        return ret;
    }

    static BigInteger[] receiveBigIntegerArray(String delimiterString) {
        return receiveBigIntegerArray(Delimiter.of(delimiterString));
    }

    static String[] receiveStringArray(Delimiter delimiter) {
        return nextLine().split(delimiter.getRegex());
    }

    static String[] receiveStringArray(String delimiterString) {
        return receiveStringArray(Delimiter.of(delimiterString));
    }

    static void print(Object obj) {
        pw.print(obj);
    }

    static void printf(String str, Object... obj) {
        pw.printf(str, obj);
    }

    static void println(Object obj) {
        pw.println(obj);
    }

    static void println(Object... objs) {
        for (Object obj : objs) {
            println(obj);
        }
    }

    static void flush() {
        pw.flush();
    }
}
