import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),
                M = in.nextInt(),
                Q = in.nextInt();

        // memo
        int[][] train = new int[N + 1][N + 1];

        // input
        while (M-- > 0) ++train[in.nextInt()][in.nextInt()];

        // prefix sum
        int[][] psum = new int[N + 1][N + 1];

        // horizontal sum
        for (int l = 1; l <= N; ++l)
            for (int r = 1; r <= N; ++r)
                psum[l][r] = psum[l][r - 1] + train[l][r];

        // 2D sum
        for (int l = 1; l <= N; ++l)
            for (int r = 1; r <= N; ++r)
                psum[l][r] += psum[l - 1][r];

        // answering queries
        while (Q-- > 0) {
            int l = in.nextInt() - 1,
                    r = in.nextInt();
            System.out.println(
                    psum[r][r] + psum[l][l] - psum[l][r] - psum[r][l]
            );
        }

    }
}