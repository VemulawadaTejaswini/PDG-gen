import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 座標数
		int N = sc.nextInt();

		//x
		int[] x = new int[N];
		//y
		int[] y = new int[N];
		//z(高さ)
		int[] h = new int[N];
		//各座標を配列に順に詰める
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		//Nは1以上100以下の整数より
		for (int i = 0; i <= 100; i++) {
			int H = 0;
			Boolean B = true;
			for (int k = 0; k < N; k++) {

				if (h[k] != 0) {
					H = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - i);
				}
			}
			for (int k = 0; k < N; k++) {
				if (h[k] != Math.max(H - Math.abs(x[k] - i) - Math.abs(y[k] - i), 0)) {
					B = false;
				}
			}
			if (B) {
				System.out.println(i + " " + i + " " + H);
			}
		}

	}
}