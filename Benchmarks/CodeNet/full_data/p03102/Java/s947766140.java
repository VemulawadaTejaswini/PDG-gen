import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int c = scan.nextInt();
		int ans = 0;
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = scan.nextInt();
		}

		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				num += scan.nextInt() * b[j];
			}
			if (num + c > 0)  ans++;
			num = 0;
		}
		System.out.println(ans);
	}

}