import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        long n = nextLong();
        if (n % 2 == 1) {
            System.out.println(0);
            return;
        }

        long numOf10s = 0;

        long pow = 1;
        while (n >= (long) Math.pow(5, pow)) {
            long p10 = (long) Math.pow(5, pow);
            long numX = 0;
            for (int i = 1; i <= 4; i++) {
                long num = (long) Math.floor((n*1.0/p10 + i)/5.0);
                if (i % 2 == 1) num = (long) Math.ceil(num/2.0);
                else num /= 2;
                numX += num;
            }
            numOf10s += pow*numX;
            pow++;
        }

        System.out.println(numOf10s);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}