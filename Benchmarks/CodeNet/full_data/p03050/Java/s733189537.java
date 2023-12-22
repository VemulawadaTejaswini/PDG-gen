import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int tyousei = 0;
		if ((Math.sqrt(n)) % 1 == 0) {
			tyousei++;

		}
		// n=xm+x=x(m+1) m>x
		// 1を足すとnの約数になる数字を出す
		// nの約数を列挙して合計して約数の個数を引く
		// x...xの時、x^2+2x以上
		long ans = 0;

		for (long i = 1; i <= Math.floor(Math.sqrt(n)) - tyousei; i++) {
			if (n % i == 0) {
				// System.out.println(i);
				ans += ((n / i) - 1);
				// System.out.println((n/i)+"\t"+n/i);

			}
		}

		System.out.println(ans);
	}
}