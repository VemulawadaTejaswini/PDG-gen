import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//全体のボールの数
		int n = sc.nextInt();
		//青いボールの数
		int a = sc.nextInt();
		//赤いボールの数
		int b = sc.nextInt();

		//小数点切り捨てた結果
		int num = n / (a + b);

		int amari = n % (a + b);

		System.out.println(num * a + Math.min(amari, a));

		sc.close();
	}

}
