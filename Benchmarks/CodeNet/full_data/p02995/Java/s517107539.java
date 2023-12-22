import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());

        // 主処理
        long total = b - (a - 1);
        long countC = b / c - (a - 1) / c; // bまでの約数の数 - aまでの約数の数
        long countD = b / d - (a - 1) / d; // bまでの約数の数 - aまでの約数の数
        long cm = b / lcm((int) c, (int) d) - (a - 1) / lcm((int) c, (int) d); // aからbまでのcとdの公倍数の数
        long result = total - countC - countD + cm;

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static long lcm(int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return c / b;
    }
}