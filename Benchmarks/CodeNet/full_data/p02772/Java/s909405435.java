import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        private static class FastScanner {
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

            public double nextDouble() {
                return Double.parseDouble(next());
            }

            public int[] nextIntArray(int n) {
                int[] a = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextInt();
                return a;
            }

            public long[] nextLongArray(int n) {
                long[] a = new long[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextLong();
                return a;
            }
        }

    public static void main(String[] args) {
        Main.FastScanner sc = new Main.FastScanner(System.in);

        int N = 0;
        N = sc.nextInt();
        boolean flag = true;
        int array [] = sc.nextIntArray(N);
        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] % 3 != 0 && array[i] % 5 != 0){
                    flag = false;
                }
                }
            }
        System.out.println(flag == true ? "APPROVED" : "DENIED");

    }

}

