import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
}

class Task {


    public void solve(InputReader in, PrintWriter out) {
        String str = in.next();
        int ans = Integer.MAX_VALUE;
        for (char ch : str.toCharArray()) {
            String s = str;
            int cnt = 0;
            while (true) {
                boolean go = false;
                for (int i = 0; i < s.length(); i++)
                    if (s.charAt(i) != ch) {
                        go = true;
                        break;
                    }
                if (!go) break;
                cnt++;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == ch || s.charAt(i + 1) == ch) {
                        sb.append(ch);
                    } else {
                        sb.append(s.charAt(i));
                    }
                }
                s = sb.toString();
            }
            ans = Math.min(ans, cnt);
        }
        out.println(ans);
    }


}


class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
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

}
