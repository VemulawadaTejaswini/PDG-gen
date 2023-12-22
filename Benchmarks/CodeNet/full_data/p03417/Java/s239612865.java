import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(solve(N, M));
    }

    private static long solve(long N, long M) {
        if (M < N) return solve(M, N);
        if (N == 1 && M == 1) return 1;
        if (N == 1 && M == 2) return 0;
        if (N == 1)           return M-2;
        if (N == 2) return 0;

        long sum = N*M;

        sum -= N*2 + M*2 - 4;

        return sum;
    }
}