import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		boolean war;
		for (int Z = X + 1; Z <= Y ; Z++) {
			war = false;

			for (int n = 0; n < N; n++) {
				if (x[n] >= Z) {
					war = true;
					break;
				}
			}
			if (war) continue;

			for (int m = 0; m < M; m++) {
				if (y[m] < Z) {
					war = true;
					break;
				}
			}
			if (war) continue;

			System.out.println("No War");
			return;
		}

		System.out.println("War");
	}
}