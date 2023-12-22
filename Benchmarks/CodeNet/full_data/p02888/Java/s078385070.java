

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final long[] bars = new long[1001];
        final long[] accumulation = new long[1001];
        for (int i = 0; i < n; i++) {
            bars[scanner.nextInt()]++;
        }

        for (int i = 1; i < 1001; i++) {
            accumulation[i] += accumulation[i - 1];
        }

        long answer = 0;
        for (int i = 1; i < 1001; i++) {
            if (bars[i] == 0) {
                continue;
            }

            if (bars[i] > 3) {
                answer += i * (i - 1)*(i-2) / 2
            }

            for (int j = i + 1; j < 1001; j++) {
                if (bars[j] == 0) {
                    continue;
                }

                if (bars[j]> 2){
                    answer+= i * j*(j-1)/2;
                }

                for (int k = j + 1; k < i + j && k < 1001; k++) {
                    if (bars[k] == 0 || k == i || k == j) {
                        continue;
                    }

                    answer += bars[i] * bars[j] * bars[k];
                }
            }
        }
        System.out.println(answer);
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
