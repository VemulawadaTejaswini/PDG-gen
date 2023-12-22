import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int H = in.nextInt();
        int W = in.nextInt();
        char[][] s = new char[H][];
        for (int h = 0; h < H; h++)
            s[h] = in.next().toCharArray();

        int[][] a = new int[H][W];
        if (s[0][0] == '#')
            a[0][0] = 1;
        for (int h = 1; h < H; h++) {
            a[h][0] = a[h-1][0];
            if (s[h-1][0] == '.' && s[h][0] == '#')
                a[h][0]++;
        }
        for (int w = 1; w < W; w++) {
            a[0][w] = a[0][w-1];
            if (s[0][w-1] == '.' && s[0][w] == '#')
                a[0][w]++;
        }
        for (int h = 1; h < H; h++) for (int w = 1; w < W; w++) {
            int a0 = a[h-1][w];
            if (s[h-1][w] == '.' && s[h][w] == '#')
                a0++;
            int a1 = a[h][w-1];
            if (s[h][w-1] == '.' && s[h][w] == '#')
                a1++;
            a[h][w] = Math.min(a0, a1);
        }
        out.println(a[H-1][W-1]);

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

