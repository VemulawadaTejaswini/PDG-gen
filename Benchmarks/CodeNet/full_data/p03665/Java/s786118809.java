import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] as = new int[n];
        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
            if (as[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        long[][] C = new long[n+1][n+1];
        C[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    C[i][0] = C[i-1][0];
                else
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        long ans = 0L;
        if (p == 0) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j += 2) {
                    if (even >= j && odd >= i - j && (i - j) % 2 == 0)
                        ans += C[even][j] * C[odd][i - j];
                }
            }
        }
        else {
            for (int i = 0; i <= n; i++) {
                for (int j = 1; j <= i; j += 2) {
                    if (odd >= j && even >= i - j)
                        ans += C[odd][j] * C[even][i - j];
                }
            }
        }
        System.out.println(ans);
    }
}
