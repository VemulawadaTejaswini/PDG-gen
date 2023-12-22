import java.util.*;

public class Main {
	public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        // ボールの総数
        long n = sc.nextLong();

        // 末尾に加える青いボールの数
        long a = sc.nextLong();

        // 末尾に加える赤いボールの数
        long b = sc.nextLong();

        // 青いボールの個数
        long num = Math.floorDiv(n, (a + b)) * a;

        // 青いボールの端数
        long rem = n % (a + b);

        num += Math.min(a, rem);

        // 出力
        System.out.println(num);
    }
}