import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int k = sc1.nextInt();
		int ans = 0;

		if (k % 2 == 0) {
			ans = (k / 2) * (k / 2);
		}
		else {
			ans = (k / 2 + 1) * (k / 2);
		}

		System.out.println(ans);

		sc1.close();

	}

}
