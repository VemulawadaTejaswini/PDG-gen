
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
            count[(i%2)][num]++;
        }

        int[] countMax = new int[2];
        int[] countMaxNum = new int[2];
        boolean[] haveSameCountMaxNum = new boolean[2]; //出現回数が最大の数字が複数存在するか(数列に現れる数が1種類のときに2種類に出来る)
        for (int i=0; i<vMax; i++) {
            for(int j=0; j<2; j++) {
                if (countMax[j] < count[j][i]) {
                    countMax[j] = count[j][i];
                    countMaxNum[j] = i;
                    haveSameCountMaxNum[j] = false;
                } else if (countMax[j] == count[j][i]) {
                    haveSameCountMaxNum[j] = true;
                }
            }
        }

        int ans = 0;
        for(int i = 0; i < 2; i++){
            ans += (n/2)-countMax[i];
        }

        // 同じ文字列だったら
        if(countMaxNum[0] == countMaxNum[1] && haveSameCountMaxNum[0] == false && haveSameCountMaxNum[1] == false){
            ans += n/2;
        }

        out.println(ans);
    }
}
