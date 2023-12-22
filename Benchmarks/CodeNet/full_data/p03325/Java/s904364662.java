import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int ans = 0;

		for (int i = 0 ; i < n ; i++ ) {
			int a = sc1.nextInt();

			while (true) {
				if ( a % 2 == 0) {
					a = a/2;
					ans++;
				}
				else {
					break;
				}
			}
		}

		System.out.println(ans);

		sc1.close();
	}

}