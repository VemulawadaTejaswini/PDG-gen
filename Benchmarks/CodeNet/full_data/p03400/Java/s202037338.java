import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int count = x;
        for (int i = 0; i < n; i++) {
            count++;
            for (int j = 1; j < d; j++) {
                int day = a[i] * j + 1;
                if (day <= d) {
                    count++;
                }
            }
        }
        int result = count;

        // 出力
        System.out.println(result);
    }
}
