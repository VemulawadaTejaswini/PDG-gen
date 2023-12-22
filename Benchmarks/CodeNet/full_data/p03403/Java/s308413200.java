import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderC.init(System.in);
        int n = ReaderC.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < a.length; i++) a[i] = ReaderC.nextInt();
        int[] next = new int[a.length];
        int[] cancelled = new int[a.length];
        int sum = 0;

        for (int i = 1; i < a.length; i++) {
            next[i] = Math.abs(a[i] - a[i - 1]);
            sum += next[i];
            cancelled[i] = Math.abs((i + 1 < a.length ? a[i + 1] : 0) - a[i - 1]);
        }

        next[0] = Math.abs(a[a.length - 1]);
        sum += next[0];

        for (int i = 1; i < a.length; i++) {
            int ans = sum + cancelled[i] - (i < a.length - 1 ? next[i + 1] : next[0]) - next[i];
            System.out.println(ans);
        }
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderC {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    //    Get a whole line.
    static String line() throws IOException {
        return reader.readLine();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

