import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        void solve(InputReader in, PrintWriter out) {
            int N = in.nextInt();
            String S = in.next();

            int op = 0;
            int cl = 0;
            for (char c : S.toCharArray()) {
                if (c == '(') {
                    op++;
                } else if (op > 0){
                    op--;
                } else {
                    cl++;
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < cl; ++i) {
                ans.append('(');
            }
            ans.append(S);
            for (int i = 0; i < op; ++i) {
                ans.append(')');
            }

            out.println(ans.toString());
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}