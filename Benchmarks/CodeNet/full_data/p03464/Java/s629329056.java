import java.util.Scanner;

/**
 * Created by hkoba on 2018/01/08.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // スペース区切りの整数の入力
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        int min = 2;
        int max = 3;
        int last = a[k - 1];
        for (int i = k - 2; i >= 0; i--) {
            int v = a[i];
            if (v > max) {
                // NG
                System.out.println("-1");
                return;
            }
            int nextMin = v;
            while (nextMin < min) {
                nextMin += v;
            }
            min = nextMin;
            max = min + v - 1;
        }
        System.out.println(min + " " + max);
    }
}
