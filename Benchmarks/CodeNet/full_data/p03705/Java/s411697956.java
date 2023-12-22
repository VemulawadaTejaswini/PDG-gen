import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        // 主処理
        long min = a * (n - 1) + b;
        long max = a + b * (n - 1);
        long result;

        if (b < a) {
            result = 0;
        } else if (n == 1) {
            result = a == b ? 1 : 0;
        } else {
            result = max - min + 1; // 重複分の数1を補正
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}