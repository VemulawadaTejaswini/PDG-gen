import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		// 数値
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int k = sc.nextInt();
		
		double ans = 0;
		if (a >= b && a >= c) {
			ans = Math.pow(a, k);
			ans = ans+b+c;
		} else if (b >= a && b >= c) {
			ans = Math.pow(b, k);
			ans = ans+a+c;
		} else {
			ans = Math.pow(c, k);
			ans = ans+a+b;
		}

		// 出力
		System.out.println(ans);

		sc.close();

	}
}