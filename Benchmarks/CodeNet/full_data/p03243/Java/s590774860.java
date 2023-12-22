import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int ans = 0;
		for (int x = 111; x < 999; x += 111) {
			if (x >= N) {
				ans = x;
				break;
			}
		}

		System.out.println(ans);
	}
}
