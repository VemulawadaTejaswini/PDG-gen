import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader;
    static PrintWriter writer;
    static StringTokenizer tokenizer;

    static String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    static void banana() throws IOException {
        String s = nextToken();
        int res = 0;
        String last = "";
        String curr = "";
        for (char c : s.toCharArray()) {
            curr += c;
            if (!curr.equals(last)) {
                last = curr;
                curr = "";
                res++;
            }
        }
        writer.println(res);
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out);
        tokenizer = null;
        banana();
        reader.close();
        writer.close();
    }
}