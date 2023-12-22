import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == count) {
                count++;
            } else {
                result++;
            }
        }
        if (n == result) {
            result = -1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}