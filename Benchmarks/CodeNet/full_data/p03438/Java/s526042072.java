import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderB.init(System.in);
        int n = ReaderB.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long pos = 0;
        long neg = 0;
        for (int i = 0; i < a.length; i++) a[i] = ReaderB.nextInt();
        for (int i = 0; i < b.length; i++) b[i] = ReaderB.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) pos += (long) (a[i] - b[i]);
            else neg += (long) (b[i] - a[i]);
        }

        System.out.println(neg >= 2*pos ? "Yes":"No");
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderB {
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

//    //    Get a whole line.
//    static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}

