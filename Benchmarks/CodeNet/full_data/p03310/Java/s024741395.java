import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    static long solve() {
        long[] SUM = new long[N];
        SUM[0] = A[0];
        for (int i = 1; i < N; i++) {
            SUM[i] = SUM[i-1] + A[i];
        }
        long TOTAL = SUM[N-1];

        long ans = Integer.MAX_VALUE;
        for (int y = 2; y <= N-2 ; y++) {
            long PQ = SUM[y-1];
            long RS = TOTAL - PQ;

            int low_x = 1;
            int high_x = y-1;
            while(low_x < high_x) {
                int mid = (low_x + high_x) / 2;

                long P = SUM[mid-1];
                long Q = PQ - P;
                if( P < Q ) {
                    low_x = mid + 1;
                } else {
                    high_x = mid;
                }
            }
            int x = low_x;
            if( low_x != 1 ) {
                int x1 = x-1;

                if( Math.abs(SUM[x-1] - (PQ - SUM[x-1])) > Math.abs(SUM[x1-1] - (PQ - SUM[x1-1])) ) {
                    x = x1;
                }
            }
            if( low_x != y-1 ) {
                int x1 = x+1;
                if( Math.abs(SUM[x-1] - (PQ - SUM[x-1])) > Math.abs(SUM[x1-1] - (PQ - SUM[x1-1])) ) {
                    x = x1;
                }
            }

            int low_z = y+1;
            int high_z = N-1;
            while(low_z < high_z) {
                int mid = (low_z + high_z) / 2;

                long R = SUM[mid-1] - PQ;
                long S = RS - R;
                if( R < S ) {
                    low_z = mid + 1;
                } else {
                    high_z = mid;
                }
            }
            int z = low_z;
            if( low_z != y+1 ) {
                int z1 = z-1;
                long R = SUM[z-1] - PQ;
                long R1 = SUM[z1 -1] - PQ;

                if( Math.abs(R - (RS- R)) > Math.abs(R1 - (RS - R1)) ) {
                    z = z1;
                }
            }
            if( low_z != N-1 ) {
                int z1 = z+1;
                long R = SUM[z-1] - PQ;
                long R1 = SUM[z1 -1] - PQ;

                if( Math.abs(R - (RS- R)) > Math.abs(R1 - (RS - R1)) ) {
                    z = z1;
                }
            }

            long P = SUM[x-1];
            long Q = PQ - P;
            long R = SUM[z-1] - PQ;
            long S = RS - R;

            ans = Math.min(max(P, Q, R, S) - min(P, Q, R, S), ans);
        }

        return ans;
    }

    static long max(long... values) {
        long max = values[0];
        for (int i = 1; i < values.length; i++) {
            max = Math.max(values[i], max);
        }
        return max;
    }

    static long min(long... values) {
        long min = values[0];
        for (int i = 1; i < values.length; i++) {
            min = Math.min(values[i], min);
        }
        return min;
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
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

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
