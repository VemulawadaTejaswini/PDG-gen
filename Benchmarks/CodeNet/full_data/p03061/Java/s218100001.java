import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int maxGcd = 1;
        // 除くものを決めるループ。
        for (int i = 0; i < N; i++) {

            boolean isFirst = true;
            int gcd = 0;
            // 一つを除いて、GCDを計算する。
            for (int j = 0; j < N; j++) {
                if (j == i) {
                    continue;
                }
                if (isFirst) {
                    gcd = calcGcd(A[j], A[j]);
                    isFirst = false;
                }
                else {
                    gcd = calcGcd(A[j], gcd);
                    if (gcd == 1) {
                        continue;
                    }
                }
            }

            // これまでの最大のGCDと今回のGCDを比較。
            maxGcd = Math.max(maxGcd, gcd);
        }
        System.out.print(maxGcd);
    }

    // 最大公約数を求める。
    int calcGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}