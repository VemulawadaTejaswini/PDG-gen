import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max;
		int noMax;

		max = Math.max(Math.max(a, b), c);
		if (a == max) {
			noMax = b + c;
		} else if (b == max) {
			noMax = a + c;
		} else {
			noMax = a + b;
		}
		int ans = max*10 + noMax;

		// 出力
		System.out.println(ans);
	}
}