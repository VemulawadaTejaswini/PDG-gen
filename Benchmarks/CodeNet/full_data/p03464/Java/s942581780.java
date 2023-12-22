import java.util.Scanner;

public class Main {
    private static final int A_MAX_INT = 100000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];

        int aMax = 0;
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
            if (aMax < a[i]) {
                aMax = a[i];
            }
        }

        int n = aMax;
        int nMin = A_MAX_INT;
        int nMax = -1;
        for (int i = n; i < A_MAX_INT; i++) {
            int nNow = i;
            boolean success = false;
            boolean failed = false;
            for (int j = 0; j < k; j++) {
                int g = nNow / a[j]; // できたグループ数
                nNow = g * a[j];
                // 失敗
                if (g <= 0) {
                    break;
                }
                // 成功 jがk-1のときにgが1の場合
                if (j == k - 1 && g == 1) {
                    success = true;
                }
            }
            if (success) {
                if (i < nMin) {
                    nMin = i;
                }
                if (nMax < i) {
                    nMax = i;
                }
            }
            if (failed) {
                break;
            }
        }
        if (nMin == A_MAX_INT) {
            System.out.println("-1");
        } else {
            System.out.println(nMin + " " + nMax);
        }
    }
}
