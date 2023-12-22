import java.util.Scanner;

class Main {
    private static final int MOD = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        char[][] X = new char[h][w];
        for(int i = 0; i < h; i++) {
            int j = 0;
            for(char c : sc.nextLine().trim().toCharArray()) {
                X[i][j++] = c;
            }
        }
        long[][] dp = new long[h][w];
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(X[i][j] == '#') {
                    continue;
                }
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if(i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if(j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    dp[i][j] %= MOD;
                }
            }
        }
        System.out.println(dp[h - 1][w - 1]);
    }
}
