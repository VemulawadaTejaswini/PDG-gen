import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(b, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            int count = a[i] - b[i];
            if (0 < count) {
                countB += count;
            } else {
                countA -= count;
            }
        }

        int diff = countA - countB;
        boolean judge = 0 < diff && diff % 2 == 1;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
