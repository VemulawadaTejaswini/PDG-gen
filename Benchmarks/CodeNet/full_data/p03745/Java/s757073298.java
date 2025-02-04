import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                break;
            }
            int center = a[i];
            int left = a[i - 1];
            int right = a[i + 1];
            if ((center < left && center < right) || (left < center && right < center)) {
                result++;
                i++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
