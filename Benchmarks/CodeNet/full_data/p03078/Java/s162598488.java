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
        static int X, Y, Z, K;
        static Long[] A, B, C;

        void solve(InputReader in, PrintWriter out) {
            X = in.nextInt();
            Y = in.nextInt();
            Z = in.nextInt();
            K = in.nextInt();
            
            A = in.nextLongArray(X);
            B = in.nextLongArray(Y);
            C = in.nextLongArray(Z);
            
            List<Long> ab = new ArrayList<>();
            for (Long a : A) {
                for (Long b : B) {
                    ab.add(a + b);
                }
            }
            Collections.sort(ab, Collections.reverseOrder());

            List<Long> ans = new ArrayList<>();
            for (int i = 0; i < Math.min(K, ab.size()); ++i) {
                for (Long c : C) {
                    ans.add(ab.get(i) + c);
                }
            }
            Collections.sort(ans, Collections.reverseOrder());

            for (int i = 0; i < K; i++) {
                out.println(ans.get(i));
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        Long[] nextLongArray(int n) {
        	Long[] arr = new Long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
