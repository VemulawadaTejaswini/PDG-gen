import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//全体のボールの数
		long n = sc.nextLong();
		//青いボールの数
		long a = sc.nextLong();
		//赤いボールの数
		long b = sc.nextLong();

		//小数点切り捨てた結果
		long num = n / (a + b);

		num = num * a;

		long amari = n % (a + b);

		//numが入力した値の比較判定
		if (amari <= a) {
			num += amari;

		} else if (amari > a) {
			num += a;
		}
		System.out.println(num);

		//System.out.println(num * a + Math.min(amari, a));

		sc.close();
	}

}
