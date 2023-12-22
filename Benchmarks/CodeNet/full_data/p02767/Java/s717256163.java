import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int X_sum = 0;
		for(int i=0; i<N; i++) {
			X[i] = sc.nextInt();
			X_sum += X[i];
		}

		int P = (int)Math.round((double)X_sum / (double)N);
		int ans = 0;
		for(int i=0; i<N; i++) {
			ans += (X[i] - P) * (X[i] - P);
		}

		System.out.println(ans);
	}

}
