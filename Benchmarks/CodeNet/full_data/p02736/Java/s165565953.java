import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        char[] a = in.next().toCharArray();

        int[] x = new int[N];
        for (int i = 0; i < N; i++)
            x[i] = a[i] - '0';
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (x[i - 1] == x[j]) {
                    boolean b = true;
                    for (int k = 0; b && i - 1 + k < j - k; k++) {
                        b = x[i - 1 + k] == x[j - k];
                    }
                    if (b)
                        i = j + 1;
                }
            }
            for (int j = i; j < N; j++)
                x[j] = Math.abs(x[j] - x[j - 1]);
        }
        out.println(x[N - 1]);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

