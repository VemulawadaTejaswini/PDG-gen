import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int GOO = 0;
    private static int CHO = 1;
    private static int PAA = 2;

    /** N回*/
    private static int N;

    /** K回前*/
    private static int K;

    private static int R;
    private static int S;
    private static int P;

    private static char[] T;

    public static void main(String[] args) {
        initialize();

        // 手番をKの剰余類に分けてそれぞれの最大値を求め、最後に足してあげればよい。
        int allSum = 0;
        for (int i = 0; i < K; i++) {
            allSum += calculateKakuMax(i);
        }

        System.out.println(allSum);
    }

    private static void initialize() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        R = sc.nextInt();
        S = sc.nextInt();
        P = sc.nextInt();
        T = sc.next().toCharArray();

    }

    private static int calculateKakuMax(int amari) {
        List<Character> TK = new ArrayList<>();
        for (int i = 0; i * K + amari < T.length; i++) {
            TK.add(T[i * K + amari]);
        }
        int[][] dp = new int[3][TK.size()];

        dp[GOO][0] = TK.get(0) == 's' ? R : 0;
        dp[CHO][0] = TK.get(0) == 'p' ? S : 0;
        dp[PAA][0] = TK.get(0) == 'r' ? P : 0;

        for (int i = 1; i < TK.size(); i++) {

            dp[GOO][i] = (TK.get(i) == 's' ? R : 0) + Math.max(dp[CHO][i - 1], dp[PAA][i - 1]);
            dp[CHO][i] = (TK.get(i) == 'p' ? S : 0) + Math.max(dp[GOO][i - 1], dp[PAA][i - 1]);
            dp[PAA][i] = (TK.get(i) == 'r' ? P : 0) + Math.max(dp[CHO][i - 1], dp[GOO][i - 1]);
        }

        return Math.max(dp[GOO][TK.size() - 1], Math.max(dp[CHO][TK.size() - 1], dp[PAA][TK.size() - 1]));
    }

}
