import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int c = scan.nextInt();
		int b[] = new int[m];
		int a[][] = new int[m][m];

		for(int i = 0; i  < m; i++) {
			b[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j]  = scan.nextInt();;
			}
		}

		int ans = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j=0; j < m; j++) {
				sum += a[i][j] * b[j];
			}
			if(sum  + c > 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}