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
        int N, H, maxA = 0, ans = 0, totalDamage = 0;
        int[] a, b;
        List<Integer> bLargerThanMaxA = new ArrayList<>();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            H = in.nextInt();
            a = new int[N];
            b = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                maxA = Math.max(maxA, a[i]);
            }

            for (int i = 0; i < N; i++) {
                if (b[i] > maxA) bLargerThanMaxA.add(b[i]);
            }

            Collections.sort(bLargerThanMaxA, Collections.reverseOrder());

            for (int bCandidate : bLargerThanMaxA) {
                totalDamage += bCandidate;
                ans++;
                if (totalDamage >= H) break;
            }

            while (totalDamage < H) {
                totalDamage += maxA;
                ans++;
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
    }
}
