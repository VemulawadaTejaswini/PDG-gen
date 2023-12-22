import java.util.Scanner;

public class Main {
    private static final int MOD = 2019;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(solve(L, R));
    }

    private static int solve(int L, int R) {
        int min = 2018;

        if (R-L >= 2019) return 0;

        L %= MOD;
        R %= MOD;
        if (L>R) return 0;

        for (int i=L; i<R; i++) {
            for (int j=L+1; j<=R; j++) {
                min = Math.min(min, i*j%MOD);
            }
        }

        return min;
    }
}
