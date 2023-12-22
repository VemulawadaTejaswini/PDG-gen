import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int[] diff = new int[n + 1];
        diff[0] = 0;
        for (int i = 1; i < n; i++) {
            diff[i] = a[i] - diff[i - 1];
        }
        diff[n] = diff[0] + k - a[n - 1];

        int sum = Arrays.stream(diff).sum();
        int max = Arrays.stream(diff).max().getAsInt();
        int result = sum - max;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
