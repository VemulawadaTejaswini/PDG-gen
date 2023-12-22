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
        int result = 1;
        boolean isStart = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (isStart) {
                if (1 < Math.abs(a[i] - a[i + 1])) {
                    result++;
                } else {
                    isStart = false;
                }
            } else {
                if ((a[i - 1] < a[i] && a[i + 1] < a[i]) || (a[i] < a[i - 1] && a[i] < a[i + 1])) {
                    result++;
                    isStart = true;
                }
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}