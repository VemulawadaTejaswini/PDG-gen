import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        Magic[] magic = new Magic[n];

        for (int i = 0; i < n; i++) {
            magic[i] = new Magic(sc.nextInt(), sc.nextInt());
        }

        long[] dp = new long[h + 1];

        //  i = 使う魔法のindex, j = 与えるダメージの合計
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= Math.min(magic[i].attack, h); j++) {
                if (dp[j] == 0) {
                    dp[j] = magic[i].consume;
                } else {
                    dp[j] = Math.min(dp[j], magic[i].consume);
                }
            }
            for (int j = 0; j <= h; j++) {
                // このindexはダメージのはみ出しを丸める
                int index = Math.min(j + magic[i].attack, h);
                if (dp[j] == 0) {
                    dp[index] = magic[i].consume;
                } else if (dp[index] == 0) {
                    dp[index] = dp[j] + magic[i].consume;
                } else {
                    // i種類目の魔法を使った場合と使わなかった場合の答えを比較する
                    dp[index] = Math.min(dp[index], dp[j] + magic[i].consume);
                }

                if (index == h) {
                    break;
                }
            }
        }

        System.out.println(dp[h]);
    }

    private static class Magic {
        private int attack;
        private int consume;

        private Magic(int attack, int consume) {
            this.attack = attack;
            this.consume = consume;
        }
    }
}
