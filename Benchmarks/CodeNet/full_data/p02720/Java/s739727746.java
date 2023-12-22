import java.util.Scanner;

class Solver {
    public void Solve() {
        int k = sc.nextInt();
        if (k < 10) {
            System.out.println(k);
            return;
        }
        // i: 桁数, j: 最初の数字
        long dp[][] = new long[50][10];
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        long cnt = 9;
        for (int i = 2; i < 50; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j + 1];
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j] + dp[i - 1][j + 1];
                }
                if (j == 0) {
                    continue;
                }
                cnt += dp[i][j];
                if (cnt >= k) {
                    // 桁数i最初がj
                    // System.out.println(i);
                    // System.out.println(j);
                    // System.out.println(cnt);
                    // amsは答え
                    int ans[] = new int[i];
                    ans[0] = j;

                    long anscnt = cnt - dp[i][j];
                    int num = j;
                    for (int l = i - 1; l >= 1; l--) {
                        for (int l2 = Math.max(0, num - 1); l2 < Math.min(10, num + 2); l2++) {
                            if (anscnt + dp[l][l2] < k) {
                                anscnt += dp[l][l2];
                            } else {
                                ans[i - l] = l2;
                                num = l2;
                                // System.out.println(l2);
                                // System.out.println(anscnt);
                                break;
                            }
                        }
                    }
                    for (int l = 0; l < ans.length; l++) {
                        System.out.print(ans[l]);
                    }
                    System.out.println();
                    return;

                }
            }
        }
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
