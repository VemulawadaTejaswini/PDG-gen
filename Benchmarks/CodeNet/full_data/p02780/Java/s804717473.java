import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt(), k = nextInt();
        double[] ps = new double[n];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = expected(nextInt());
            if (i > 0) ps[i] += ps[i - 1];
        }

        double ans = 0.0;
        for (int i = 0; i + k - 1 < ps.length; i++) {
            ans = Math.max(ans, ps[i + k - 1] - (i - 1 >= 0 ? ps[i - 1] : 0));
        }
        System.out.println(ans);
    }

    private static double expected(double p) {
        double sum = 0.0;
        for (int i = 1; i <= p; i++) {
            sum += i;
        }
        return sum/p;
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
}