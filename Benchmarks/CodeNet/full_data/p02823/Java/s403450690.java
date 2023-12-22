import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        long n = nextLong(), a = nextLong(), b = nextLong();
        if (Math.abs(a - b) % 2 == 0) System.out.println(Math.abs(a - b)/2);
        else {
            long min = Math.min(a, b), max = Math.max(a, b);
            long leftMoves = min - 1;
            long leftPos = max - leftMoves - 1;
            long minLeft = (max - leftPos) + (leftPos - 1)/2;
            long rightMoves = n - max;
            long rightPos = min + rightMoves + 1;
            long minRight = (rightPos - min) + (n - rightPos)/2;
            System.out.println(Math.min(minLeft, minRight));
        }
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