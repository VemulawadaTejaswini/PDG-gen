import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // ボールの総数
        long n = sc.nextInt();

        // 末尾に加えた青いボールの数
        long a = sc.nextInt();

        // 末尾に加えた赤いボールの数
        long b = sc.nextInt();

        // 青いボールを加えた回数
        long num = (n / (a + b)) * a;

        // それ以外の青いボールの数
        long rem = n % (a + b);

        num += Math.max(a, rem);

        // 出力
        System.out.println(num);
    }
}