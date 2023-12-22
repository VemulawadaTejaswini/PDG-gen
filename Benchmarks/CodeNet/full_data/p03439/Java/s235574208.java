import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderC.init(System.in);
        int n = ReaderC.nextInt();
        System.out.println(0);
        System.out.flush();
        String gLeft = ReaderC.next();
        if (gLeft.equals("Vacant")) return;
        System.out.println(n - 1);
        System.out.flush();
        String gRight = ReaderC.next();
        if (gRight.equals("Vacant"))return;
        query(0, n - 1, gLeft, gRight);
    }

    private static void query(int l, int r, String genderLeft, String genderRight) throws IOException {
        int m = (r + l)/2;
        boolean matchLeft = false;
        boolean matchRight = false;
        if (m % 2 == l % 2) matchLeft = true;
        if (m % 2 == r % 2) matchRight = true;
        System.out.println(m);
        System.out.flush();
        String g = ReaderC.next();
        if (g.equals("Vacant")) return;
//        System.out.println(matchLeft + " " + matchRight + " " + g + " " + genderLeft + " " + genderRight);
        if (matchLeft && !genderLeft.equals(g) || !matchLeft && genderLeft.equals(g)) query(l, m, genderLeft, g);
        else if (matchRight && !genderRight.equals(g) || !matchRight && genderRight.equals(g)) query(m, r, g, genderRight);
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

//    //    Get a whole line.
//    static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}

