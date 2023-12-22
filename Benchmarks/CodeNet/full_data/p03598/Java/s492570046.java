import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] x = new Integer[n];
        Arrays.setAll(x, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = Math.abs(0 - x[i]);
            int b = Math.abs(k - x[i]);
            int min = Math.min(a, b);
            result += min * 2;
        }

        // 出力
        System.out.println(result);
    }
}
