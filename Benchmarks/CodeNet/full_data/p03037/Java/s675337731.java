import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt(); // N (0 ~ N-1)
        int gateNum = sc.nextInt(); // M (0 ~ M-1)
        int[] left = new int[gateNum];
        int[] right= new int[gateNum];
        for (int i = 0; i < gateNum; i++) {
            // 問題文上のインデックスをプログラミング上のインデックスに合わせる。
            left[i] = sc.nextInt() - 1;
            right[i] = sc.nextInt() - 1;
        }

        int ans = 0;
        for (int i = 0; i < cardNum; i++) {

            // 対象のカードで全てのゲートをくぐれるかチェック。
            boolean flag = true;
            for (int j = 0; j < gateNum; j++) {
                if (!(left[j] <= i && i <= right[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                ans++;
            }

        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}