
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[10000000];
        long max = 0;
        for (int i = 0; i < N; i++) {
            int dist = scanner.nextInt();
            if(i == 0 && dist != 0) {
                System.out.println(0);
                return;
            }
            A[dist]++;
            max = Math.max(dist, max);
        }
        long ans = 1;
//        for (int j = 0; j <= max; j++) {
        if (A[0] == 0) {
            System.out.println(0);
            return;
        }
//        }
        for (int j = 1; j <= max; j++) {
            long a = A[j - 1];
            long n = A[j];

            while(n-- > 0) {
                ans *= (long)a;
                ans %= (long)998244353;
            }

        }
        System.out.println(ans);
    }

    static long power(long a, long n) {
        //　結果の初期値
        long result = 1;
        // nが１の場合に計算
        if (1 <= n) {
            // aをn回掛ける
            for (long i = 0; i < n; ++i) {
                result = ((result % (long) 998244353) * (a % (long) 998244353)) % (long) 998244353;
            }
        }
        // 結果を戻す
        return result;
    }
}
