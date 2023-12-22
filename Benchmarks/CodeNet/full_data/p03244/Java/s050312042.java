
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int vMax = 100001;
        int[][] count = new int[2][vMax];   //偶数番号、奇数番号それぞれで出てきた数字の出現回数
        for (int i = 0; i < n; i++) {
            int num = a[i];
            count[(i % 2)][num]++;
        }

        int[] countMax = new int[2];
        int[] countMaxNum = new int[2];
        int[] countSecondMax = new int[2];
        int[] countSecondMaxNum = new int[2];
        for (int i = 0; i < vMax; i++) {
            for (int j = 0; j < 2; j++) {
                if (countMax[j] < count[j][i]) {
                    countSecondMax[j] = countMax[j];
                    countSecondMaxNum[j] = countMaxNum[j];

                    countMax[j] = count[j][i];
                    countMaxNum[j] = i;
                }
            }
        }

        int ans = 0;
        // 同じ文字列だったら
        if (countMaxNum[0] == countMaxNum[1]) {
            if (countMax[0] > countMax[1]) {
                ans = (n / 2) - countMax[0] + (n / 2) - countSecondMax[1];
            } else {
                ans = (n / 2) - countSecondMax[0] + (n / 2) - countMax[1];
            }
        } else {
            for (int i = 0; i < 2; i++) {
                ans += (n / 2) - countMax[i];
            }
        }

        out.println(ans);
    }
}
