import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        // 主処理
        long result = (n / (a + b) * a) + Math.min(a, n % (a + b));

        // 出力
        System.out.println(result);
        sc.close();
    }
}