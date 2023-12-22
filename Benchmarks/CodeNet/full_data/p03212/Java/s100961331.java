import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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

    static int N;
    static String[] d357 = {"3", "5", "7"};
    static List<Integer> candidates = new ArrayList<>();

    static void getOneMoreAppend(int rem, String original) {
        if (rem == 0) {
            boolean ok = true;
            for (String d : d357) ok &= original.contains(d);
            int candidate = Integer.parseInt(original);
            if (ok && candidate <= N) candidates.add(candidate);
        } else {
            for (String d : d357) getOneMoreAppend(rem - 1, original + d);
        }
    }

    static class Task {
        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            int digit = (int) Math.floor(Math.log10(N)) + 1;

            for (int i = 3; i <= digit; i++) {
                getOneMoreAppend(i, "");
            }

            out.println(candidates.size());
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