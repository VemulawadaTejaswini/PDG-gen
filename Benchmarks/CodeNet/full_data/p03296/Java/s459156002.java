import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int tmp = 0;
		int ans = 0;
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			if ( i > 0 && a[i] == a[i-1]) {
				tmp++;
			}
			else {
				if (tmp == 0) {
					continue;
				}
				else {
					ans += (tmp + 1) / 2;
					tmp = 0;
				}
			}
		}

		if (tmp > 0) {
			ans += (tmp + 1) / 2;
		}

		System.out.println(ans);

		sc1.close();
	}

}