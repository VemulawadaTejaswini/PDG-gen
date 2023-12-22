import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示    
		int N = sc.nextInt();
		int X[] = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;

		for (int j = 1; j <= 100; j++) {
			
			int c = 0;
			
			for (int i : X) {
				c += (i - j) * (i - j);
			}
			ans = Math.min(ans, c);
		}
		System.out.println(ans);
	}
}