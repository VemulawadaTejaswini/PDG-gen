import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int ans = 0;

    private static void rec(int[] a) {

        Arrays.sort(a);

        boolean maxENumExist = false;
        int index = -1;


        //aの中から偶数を探す 1番最初にヒットした偶数が最大値の偶数
        for (int i = a.length - 1; 0 <= i; i--) {

            if (a[i] % 2 == 0) {     //あれば、そこで探索中止
                ans++;               //１つでも偶数があれば、×3をすべての数にしなくてすむ　操作を続けられる
                maxENumExist = true;//あったことを記録して
                a[i] = a[i] / 2;    //2でわって
                index = i;//aの中で最大値の偶数対応するインデックスをとっておく
                break; //探索中止
            }
        }


        if (!maxENumExist) return; //偶数が1つもみつからなかったら、そこで終了


        for (int i = a.length - 1; 0 <= i; i--) {//最大値の偶数以外に3をかける
            if (i != index) a[i] = 3 * a[i];
        }


        rec(a);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(scan.next());
        }

        rec(a);

        System.out.println(ans);
    }
}