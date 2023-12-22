import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderA.init(System.in);
        String S = ReaderA.next();
        int counter;
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < S.length(); i++) used.add(S.charAt(i));


        if (S.length() < 26) {
            String ans = "";
            counter = S.length();
            for (int i = 0; i < 26; i++) {
                if (!used.contains((char)(i + 'a'))) {
                    ans = S.substring(0, counter) + (char) (i + 'a');
                    break;
                }
            }
            System.out.println(ans);
        }
        else {
            counter = S.length() - 2;
            used.remove(S.charAt(counter + 1));
            for (int i = counter; i >= 0; i--) {
                for (int j = S.charAt(i) - 'a' + 1; j < 26; j++) {
                    if (!used.contains((char)(j + 'a'))) {
                        System.out.println(S.substring(0, i) + (char) (j + 'a'));
                        return;
                    }
                }
                used.remove(S.charAt(i + 1));
            }
            System.out.println(-1);
        }
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderA {
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

//    static int nextInt() throws IOException {
//        return Integer.parseInt(next());
//    }
//
//    static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}