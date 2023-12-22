import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = (n / (a + b) * a) + Math.min(a, n % (a + b));

        // 出力
        System.out.println(result);
        sc.close();
    }
}