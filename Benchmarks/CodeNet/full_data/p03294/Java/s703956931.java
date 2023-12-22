import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int[] a = new int[n];
		long temp = 0;

		a[0] = sc1.nextInt();
		temp = a[0];

		for ( int i = 1 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			temp *= a[i];
		}

		temp -= 1;
		int ans = 0;
		for ( int i = 0 ; i < n ; i++ ) {
			ans += temp % a[i];
		}

		System.out.println(ans);

		sc1.close();
	}

}