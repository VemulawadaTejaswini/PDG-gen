import java.util.*;
import java.io.*;

public class Main {
    // static int bits;
    static int[] numbers;
    static String input;
    public static void main(String[] args) {
        input = sc.nextStr();
        numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Character.getNumericValue(input.charAt(i));
        }
        for (int bits = 0; bits < (1 << 3); bits++) {
            int sum = resolve(bits, numbers);
            // writer.println(sum);
            if (sum == 7) {
                writer.println(genAnswer(bits, numbers));
                break;
            }
        }
        writer.flush();
    }
    private static String genAnswer(int bits, int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(numbers[0]));
        for (int i = 0; i < 3; i++) {
            if((bits & (1 << i)) != 0) {
                sb.append("+");
            } else {
                sb.append("-");
            }
            sb.append(String.valueOf(numbers[i+1]));
        }
        sb.append("=7");
        return sb.toString();
    }

    private static int resolve(int bits,int[] numbers) {
        if (numbers.length != 4) return -1;
        int sum = numbers[0];
        // StringBuilder sb = new StringBuilder();
        // sb.append(String.valueOf(numbers[0]));
        for (int i = 0; i < 3; i++) {
            if ((bits & (1 << i)) != 0) {
                sum += numbers[i+1];
                // sb.append("+");
            } else {
                sum -= numbers[i+1];
                // sb.append("-");
            }
        }
        return sum;
    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE
}
