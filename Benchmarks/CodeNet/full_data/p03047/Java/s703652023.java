
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.lang.StringBuffer;
import java.lang.String;
import java.lang.StringBuilder;


public class Main {

    static BigInteger modulo = new BigInteger("1000000007");
//    Nested ststic class FastReaders

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException io) {
                io.printStackTrace();
            }
            return s;
        }
    }

    static BigInteger exponentialModulo(BigInteger a, BigInteger b) {
        BigInteger previousNumber = BigInteger.ONE;
        while (!(b.equals(BigInteger.valueOf(0)))) {
            if (b.testBit(0)) {
                previousNumber = previousNumber.multiply(a).mod(modulo);
            }
            b = b.shiftRight(1);
            a = a.modPow(BigInteger.valueOf(2), modulo);
        }
        return previousNumber;
    }

    public static int encodeInteger(int x, int n) {
        n = n << (1 << (1 << (1 << 1)));
        x = x | n;
        return x;
    }

    public static void encodeArray(int[] A, int[] B, int n) {
        for (int i = 0; i < n; i++) {
            A[i] = encodeInteger(A[i], B[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader input = new FastReader();      
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(n-k+1);      
    }

}
