import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 解説PDF後
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long ans = solve(n, k);
        System.out.println(ans);
    }

    static long solve(int N, int K) {
        long ans = 0;
        long tmpOdd = 0;
        long tmpEve1 = 0;
        long tmpEve2 = 0;
        for (int a = 1; a <= N; a++) {
            long modK = a % K;
            if (K % 2 == 0) {
                // 偶数の場合

                if (modK == 0) {
                    // 1. a,b,cがそれぞれ、Kでちょうど割り切れる
                    // ex) K=2 [a=2, b=2, c=2]
                    tmpEve1++;
                }

                if (modK == K / 2) {
                    // 2. a,b,cがそれぞれ、Kで割った余りがちょうど K /2
                    // ex) K=2 [a=1, b=3, c=1]
                    tmpEve2++;
                }

            } else {
                // 偶数の場合
                if (modK == 0) {
                    // 1. a,b,cがそれぞれ、Kでちょうど割り切れる
                    // ex) K=3 [a=3, b=3, c=3]
                    tmpOdd++;
                }
            }
        }

        if (K % 2 == 0) {
            // 各値がKでちょうど割り切れる場合と、K/2の場合を加算する
            ans = (long) (Math.pow(tmpEve1, 3) + Math.pow(tmpEve2, 3));
        } else {
            // 全ての値がちょうど割り切れる場合のパターンをa,b,cで3乗する
            ans = tmpOdd * tmpOdd * tmpOdd;
        }

        return ans;
    }
}

