import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (h <= a[i] && w <= b[i]) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
