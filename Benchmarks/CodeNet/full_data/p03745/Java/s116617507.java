import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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
        int N, ans = 1;
        int[] A;
        List<Integer> compressed = new ArrayList<>();
        int diff;

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextIntArray(N);

            int prev = -1;
            for (int a : A) {
                if (a != prev) {
                    compressed.add(a);
                }
                prev = a;
            }

            if (compressed.size() > 2) {
                diff = 0;
                for (int i = 0; i < compressed.size() - 1; ++i) {
                    if (diff > 0 && compressed.get(i + 1) < compressed.get(i) || diff < 0 && compressed.get(i + 1) > compressed.get(i)) {
                        diff = 0;
                        ans++;
                    } else {
                        diff = compressed.get(i + 1) - compressed.get(i);
                    }
                }
            }

            out.println(ans);
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
