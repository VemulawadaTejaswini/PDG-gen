import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer k = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(h);
        long result = 0;
        for (int i = 0; i < h.length; i++) {
            if (k < n - i) {
                result += h[i];
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
