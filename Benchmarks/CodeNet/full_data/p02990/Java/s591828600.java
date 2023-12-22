import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

// 計算済みの結果は再利用するようにする。
public class Main {

    private int redNum;
    private int blueNum;
    private static long MOD = (long)(Math.pow(10,9) + 7);
    private static int ARRAY_NUM = 2048;
    private long[][] memo = new long[ARRAY_NUM][ARRAY_NUM];

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        redNum = N - K;
        blueNum = K;

        for (int i = 0; i < ARRAY_NUM; i++) {
            for (int j = 0; j < ARRAY_NUM; j++) {
                memo[i][j] = -1;
            }
        }
        for (int i = 1; i <= K; i++) {
            double count = calcCount(i);
            System.out.println((int)(count));
        }
    }

    private long calcCount(int i) {
        long posCntToPlaceBlue = calcNumOfCombination(redNum + 1, i);
        long splitCntOfBlue = calcNumOfCombination(blueNum - 1, i - 1);
        long ansCount = posCntToPlaceBlue * splitCntOfBlue % MOD;
        //long ansCount = posCntToPlaceBlue * splitCntOfBlue;
        return ansCount;
    }

    // 計算結果をmodしても、先にmodしてから計算しても、結果は同じ。
    private long calcNumOfCombination(int n, int r) {
        if (n == r) {
            memo[n][r] = 1;
            return memo[n][r];
        }
        else if (n < r) {
            memo[n][r] = 0;
            return memo[n][r];
        }
        else if (memo[n][r] != -1) {
            return memo[n][r];
        }
        else if (memo[n][n - r] != -1) {
            return memo[n][n - r];
        }
        else {
            BigInteger result = BigInteger.valueOf(1);
            for (int i = 1; i <= r; i++) {
                result = result.multiply(BigInteger.valueOf(n - (i - 1))).divide(BigInteger.valueOf(i));
            }
            memo[n][r] = result.mod(BigInteger.valueOf(MOD)).longValue();
            return memo[n][r];
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}