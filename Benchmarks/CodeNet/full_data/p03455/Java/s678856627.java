import java.util.Scanner;

/**
 * 【問題概要】
 *
 * 二つの正整数 aa, bb が与えられます。 aa と bb の積が偶数か奇数か判定してください。
 *
 * @author tsuch
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((a * b / 2 - (a * b + 1) / 2) == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
