import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            System.out.println(solve(0, A.length - 1, new RangeMinimumQuery(A, (integer, integer2) -> integer.compareTo(integer2) < 0)));
        }
    }

    private static long solve(int l, int r, RangeMinimumQuery rmq){
        if (l > r)
            return 0;

        if (l == r)
            return rmq.queryKey(l, r);

        int p = rmq.queryPosition(l, r);
        int key = rmq.queryKey(l, r);

        return (long)key * (p - l + 1) * (r - p + 1) + solve(l, p - 1, rmq) + solve(p + 1, r, rmq);
    }

    public static class RangeMinimumQuery {
        private final int[][] rmqPos;
        private final int[] keys, log2;
        private final int N, LG;
        private final BiPredicate<Integer, Integer> f;

        public RangeMinimumQuery(int[] A, BiPredicate<Integer, Integer> op){
            this.N = A.length;
            this.LG = LOG2(A.length);

            this.rmqPos = new int[this.LG + 1][this.N + 1];
            this.keys = Arrays.copyOf(A, A.length);
            this.log2 = new int[this.N + 1];

            this.f = op;

            build();
        }

        public int queryPosition(int x, int y){
            int k = log2[y - x + 1];
            int p = y - (1 << k) + 1;

            if (f.test(keys[rmqPos[k][x]], keys[rmqPos[k][p]]))
                return rmqPos[k][x];
            else
                return rmqPos[k][p];
        }

        public int queryKey(int x, int y){
            int k = log2[y - x + 1];
            int p = y - (1 << k) + 1;

            if (f.test(keys[rmqPos[k][x]], keys[rmqPos[k][p]]))
                return keys[rmqPos[k][x]];
            else
                return keys[rmqPos[k][p]];
        }

        private static int LOG2(int x){
            int c = 0;

            while (x >= 1){
                x >>= 1;
                c++;
            }

            return c;
        }

        private void build(){
            for (int i = 0; i < N; i++) {
                rmqPos[0][i] = i;
            }

            log2[1] = 0;

            for (int i = 2; i <= N; i++) {
                log2[i] = log2[i >> 1] + 1;
            }

            for (int i = 1; i <= LG; i++) {
                for (int j = 0; j + (1 << i) - 1 < N; j++) {
                    int p = 1 << (i - 1);

                    if (f.test(keys[rmqPos[i - 1][j]], keys[rmqPos[i - 1][j + p]]))
                        rmqPos[i][j] = rmqPos[i - 1][j];
                    else
                        rmqPos[i][j] = rmqPos[i - 1][j + p];
                }
            }
        }
    }
}
