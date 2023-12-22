import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        boolean isNotSame = true;
        for (int i = 0; i < n; i++) {
            int target = a[i];
            for (int j = i + 1; j < n; j++) {
                if (target == a[j]) {
                    isNotSame = false;
                }
            }
        }

        String result = isNotSame ? "YES" : "NO";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
