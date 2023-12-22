import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            System.out.println(solve(0, A.length - 1, new RMQ(A)));
        }
    }

    private static long solve(int l, int r, RMQ rmq){
        if (l > r)
            return 0;

        if (l == r)
            return rmq.queryValue(l, r);

        int p = rmq.queryPosition(l, r);
        int key = rmq.queryValue(l, r);

        return (long)key * (p - l + 1) * (r - p + 1) + solve(l, p - 1, rmq) + solve(p + 1, r, rmq);
    }

    private static class RMQ {
        private final int[][] rmq;
        private final int[][] pos;
        private final int LG;
        private final int N;
        private final int[] log2;

        public RMQ(int[] A){
            this.LG = LOG2(A.length);
            this.N = A.length;
            this.rmq = new int[this.LG + 1][this.N + 1];
            this.pos = new int[this.LG + 1][this.N + 1];
            this.log2 = new int[this.N + 1];
            build(A);
        }

        public int queryPosition(int x, int y){
            x++; y++;
            int k = log2[y - x + 1];
            int p = y - (1 << k) + 1;

            if (rmq[k][x] < rmq[k][p])
                return pos[k][x];
            else
                return pos[k][p];
        }

        public int queryValue(int x, int y){
            x++; y++;
            int k = log2[y - x + 1];
            int p = y - (1 << k) + 1;

            if (rmq[k][x] < rmq[k][p])
                return rmq[k][x];
            else
                return rmq[k][p];
        }

        private static int LOG2(int x){
            int c = 0;

            while (x >= 1){
                x >>= 1;
                c++;
            }

            return c;
        }

        private void build(int[] A){
            for (int i = 1; i <= N; i++) {
                rmq[0][i] = A[i - 1];
                pos[0][i] = i - 1;
            }

            log2[1] = 0;

            for (int i = 2; i <= N; i++) {
                log2[i] = log2[i >> 1] + 1;
            }

            for (int i = 1; i <= LG; i++) {
                for (int j = 1; j + (1 << i) - 1 <= N; j++) {
                    int p = 1 << (i - 1);

                    if (rmq[i - 1][j] < rmq[i - 1][j + p]){
                        rmq[i][j] = rmq[i - 1][j];
                        pos[i][j] = pos[i - 1][j];
                    }
                    else{
                        rmq[i][j] = rmq[i - 1][j + p];
                        pos[i][j] = pos[i - 1][j + p];
                    }
                }
            }
        }
    }

}
