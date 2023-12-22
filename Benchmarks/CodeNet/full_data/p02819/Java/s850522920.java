import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int X = sc.nextInt();
		int a = X;

		while (!determine(a)) {
			a++;
		}
		System.out.println(a);
	}

	public static boolean determine(int s) {
		if (s >= 2) {
			for (int i = 2; i * i <= s; i++) {
				if (s % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}