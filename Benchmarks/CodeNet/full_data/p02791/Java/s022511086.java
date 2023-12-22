import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 1;
        int min = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] <= min) {
                result++;
            }
            min = Math.min(min, p[i]);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}