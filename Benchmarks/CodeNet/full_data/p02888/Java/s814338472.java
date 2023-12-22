
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    char[] buf = new char[0];

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        List<Integer> L = new ArrayList();
        for(int i=0;i<n;i++) {
            L.add(scanner.nextInt());
        }
        Collections.sort(L);

        long answer = 0;
        for(int i=0;i<n - 2;i++) {
            for(int j=i+1;j<n - 1;j++) {
                int a = L.get(i);
                int b = L.get(j);
                int lower = Math.max(a - b, b - a);
                int upper = a + b;
                int lowerResult = Math.max(~Collections.binarySearch(L, lower + 1, (x, y) -> x - y >= 0 ? 1 : -1), j + 1);
                int upperResult = Math.min(~Collections.binarySearch(L, upper - 1, (x, y) -> x.compareTo(y) > 0 ? 1 : -1), n);

                if (upperResult - lowerResult > 0) {
                    answer += (upperResult - lowerResult);
                }
            }
        }
        System.out.println(answer);
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

}