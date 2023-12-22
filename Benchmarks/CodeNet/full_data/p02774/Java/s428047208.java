import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 処理
        int num = (n * (n - 1)) / 2;
        long[] pairs = new long[num];
        int idx = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                pairs[idx] = a[i] * a[j];
                idx++;
            }
        }
        Arrays.sort(pairs);
        long out = pairs[k - 1];

        // 出力
        System.out.println(out);
    }

}