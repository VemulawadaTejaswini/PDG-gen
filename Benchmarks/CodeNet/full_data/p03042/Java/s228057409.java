
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

public class Main {

    static BigInteger modulo = new BigInteger("1000000007");
    static long mod = 1000000007;
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

    public static int applySearchOfSubstring(String text) {
        int count = 0;
        Pattern p = Pattern.compile("AB");
        Matcher m = p.matcher(text);
        while (m.find()) {
            ++count;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        FastReader input = new FastReader();
        String s = input.nextLine();
        String a = s.substring(0,2);
        String b = s.substring(2,4);
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
//        System.out.println(x + " " + y);
        if(x >= 1 && y >= 1 && x <= 12 && y <= 12){
            System.out.println("AMBIGUOUS");
        }else if(x >= 1 && x <= 12 ){
            System.out.println("MMYY");
        }else if(y >= 1 && y <= 12){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }
    }

}
