import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		int plus = 0;
		int minus = 0;
		String ans = "Yes";

		for (int i = 0; i < N; i++) {
			if (a[i] < b[i]) {
				plus += b[i] - a[i];
			} else {
				minus += a[i] - b[i];
			}
		}

		if (minus * 2 > plus) {
			ans = "No";
		}

		// 出力
		System.out.println(ans);
	}
}
