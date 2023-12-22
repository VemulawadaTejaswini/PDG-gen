import java.util.Scanner;

public class Main {
    private static int ma, mb;
    private static int[][] abc;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ma = sc.nextInt();
        mb = sc.nextInt();
        abc = new int[n][3];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }

        int result = allSearch(0, 0, 0, 0);
        System.out.println(result == Integer.MAX_VALUE ? -1 : result);
    }

    private static int[][][] dp = new int[50][500][500];
    static {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    dp[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
    }
    private static int candidate = Integer.MAX_VALUE;
    private static int allSearch(int i, int nowa, int nowb, int nowc){
        if(nowc != 0){
            if(dp[i][nowa][nowb] <= nowc){
                return dp[i][nowa][nowb];
            }else{
                dp[i][nowa][nowb] = nowc;
            }
            if(nowc >= candidate) return Integer.MAX_VALUE;
            if(isMatch(nowa, nowb)){
                candidate = Integer.min(candidate, nowc);
                return nowc;
            }
        }
        if(i >= abc.length) return Integer.MAX_VALUE;

        int a = abc[i][0], b = abc[i][1], c = abc[i][2];
        return Integer.min(
                allSearch(i + 1, nowa + a, nowb + b, nowc + c),
                allSearch(i + 1, nowa, nowb, nowc)
        );
    }

    private static boolean isMatch(int a, int b) {
        return a * mb == b * ma;
    }
}
