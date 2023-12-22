import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private int redNum;
    private int blueNum;

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        redNum = N - K;
        blueNum = K;

        for (int i = 1; i <= K; i++) {
            double count = calcCount(i);
            System.out.println((int)(count % (Math.pow(10,9) + 7)));
        }
    }
    private double calcCount(int i) {
        long posCntToPlaceBlue = calcNumOfCombination(redNum + 1, i);
        long splitCntOfBlue = calcNumOfCombination(blueNum - 1, i - 1);
        double ansCount = (double) posCntToPlaceBlue * splitCntOfBlue;
        return ansCount;
    }
    private long calcNumOfCombination(int n, int r) {
        long result = 1;
        for (int i = 1; i <= r; i++) {
            // 右辺に long のキャストが必要かと思ったが、既に result がlongなので不要。
            result = result * (n - (i - 1)) / i;
        }
        return result;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}