
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        int count = 0;  //水やり完了済
        boolean watered = false;

        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
            if (h[i] == 0) {
                count++;
            }
        }

        while (count < h.length) {
            for (int i = 0; i < N; i++) {
                // 0でなければ減らす
                if (h[i] > 0) {
                    h[i]--;
                    if (h[i] == 0) {
                        count++;
                    }
                    watered = true;
                    continue;
                }

                // 0になってたら別の水やり操作が必要
                if (watered) {
                    ans++;
                    watered = false;
                }
            }

            if (watered) {
                ans++;
                watered = false;
            }
        }

        out.println(ans);
    }
}
