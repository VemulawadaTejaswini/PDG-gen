import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int ans = 0;

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int l = 1; l <= K; l++) {
                    ans += gcd(i, j, l);
                }
            }
        }

        System.out.println(ans);
    }

    private static int gcd(int a, int b, int c) {
        int ab = gcd(a, b);
        return gcd(ab, c);
    }

    private static int[][] memo = new int[201][201];

    private static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }

        if (memo[a][b] != 0) {
            return memo[a][b];
        }

        if (b == 0) {
            memo[a][b] = a;
            return memo[a][b];
        }

        memo[a][b] = gcd(b, a % b);
        return memo[a][b];
    }

}
