import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
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
        String S;
        int former, latter;

        boolean canBeMonth(int n) {
            return 1 <= n && n <= 12;
        }

        boolean canBeYear(int n) {
            return 0 <= n && n <= 99;
        }

        void solve(InputReader in, PrintWriter out) {
            // write your code here
            S = in.next();
            former = Integer.parseInt(S.substring(0, 2));
            latter = Integer.parseInt(S.substring(2, 4));

            if (canBeMonth(former) && canBeMonth(latter)) {
                out.println("AMBIGUOUS");
            } else if (!canBeMonth(former) && !canBeMonth(latter)) {
                out.println("NA");
            } else if (canBeMonth(former)) {
                out.println("MMYY");
            } else if (canBeMonth(latter)) {
                out.println("YYMM");
            } else {
                out.println("NA");
            }
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

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
