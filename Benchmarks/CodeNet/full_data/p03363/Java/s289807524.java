import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int ans = 0;

		for (int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			for (int j = 0 ; j <= i ; j++) {
				b[j] += a[i];
				if (b[j]==0) {
					ans++;
				}
			}
		}

		//int num = 0;
		//for (int num2 =0 ; num2 < n ; num2++ ) {
		//	for (int i = num2 ; i < n ; i++ ) {
		//		num += a[i];
		//		if (num == 0) {
		//			ans++;
		//		}
		//	}
		//	num=0;
		//}

		System.out.println(ans);

		sc1.close();

	}

}