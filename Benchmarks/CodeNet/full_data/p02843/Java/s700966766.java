import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int x = nextInt();
        int[] minRequired = new int[x + 1];
        for (int i = 1; i < Math.min(6, minRequired.length); i++) minRequired[i] = 1;
        for (int i = 6; i <= x; i++) {
            minRequired[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= 5; j++) minRequired[i] = Math.min(minRequired[i], 1 + minRequired[i - j]);
        }

        boolean can = false;
        for (int numOf100s = 0; numOf100s * 100 <= x; numOf100s++) {
            int rem = x - numOf100s * 100;
            if (minRequired[rem] <= numOf100s) {
                can = true;
                break;
            }
        }

        System.out.println(can ? '1' : '0');
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

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}