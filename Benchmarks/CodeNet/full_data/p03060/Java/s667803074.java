import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];

		int ans = 0;

		for ( int i = 0 ; i < n ; i++ ) {
			v[i] = sc1.nextInt();
		}

		for ( int i = 0 ; i < n ; i++ ) {
			c[i] = sc1.nextInt();
			if ((v[i] - c[i]) > 0) {
				ans += v[i] - c[i];
			}
		}

		System.out.println(ans);

		sc1.close();

	}

}