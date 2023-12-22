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
        int count1 = 1;
        for (int i = 1; i < n - 1; i++) {
            int left = a[i - 1];
            int right = a[i + 1];
            int center = a[i];
            if ((left < center && right < center) || (center < left && center < right)) {
                count1++;
                i++;
            }
        }
        int count2 = 1;
        for (int i = n - 2; 0 < i; i--) {
            int left = a[i - 1];
            int right = a[i + 1];
            int center = a[i];
            if ((left < center && right < center) || (center < left && center < right)) {
                count2++;
                i--;
            }
        }
        int result = Math.min(count1, count2);

        // 出力
        System.out.println(result);
    }
}
