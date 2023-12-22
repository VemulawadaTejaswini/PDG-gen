import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        int N, K;
        List<long[]> P = new ArrayList<>();
        long ans = Long.MAX_VALUE;

        long calcS(List<long[]> points) {
            long minX = Long.MAX_VALUE;
            long minY = Long.MAX_VALUE;
            long maxX = Long.MIN_VALUE;
            long maxY = Long.MIN_VALUE;
            for (long[] p : points) {
                long x = p[0];
                long y = p[1];
                minX = Math.min(x, minX);
                maxX = Math.max(x, maxX);
                minY = Math.min(y, minY);
                maxY = Math.max(y, maxY);
            }

            int cnt = 0;
            for (long[] p : P) {
                if (minX <= p[0] && p[0] <= maxX && minY <= p[1] && p[1] <= maxY) {
                    cnt++;
                }
            }
            if (cnt < K) {
                return Long.MAX_VALUE;
            } else if (minX == maxX && minY == maxY) {
                return 1;
            } else if (minX == maxX) {
                return maxY - minY;
            } else if (minY == maxY) {
                return maxX - minX;
            } else {
                return (maxX - minX)*(maxY - minY);
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            K = in.nextInt();

            for (int i = 0; i < N; ++i) {
                P.add(new long[] {in.nextLong(), in.nextLong()});
            }

            for (int i = 0; i < N; ++i) {
                for (int j = i; j < N; ++j) {
                    for (int k = j; k < N; ++k) {
                        for (int l = k; l < N; ++l) {
                            List<long[]> points = new ArrayList<>();
                            points.add(P.get(i));
                            points.add(P.get(j));
                            points.add(P.get(k));
                            points.add(P.get(l));
                            ans = Math.min(ans, calcS(points));
                        }
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

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}