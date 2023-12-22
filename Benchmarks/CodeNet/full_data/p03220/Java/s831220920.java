import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, T, A;
		N = sc.nextInt();
		T = sc.nextInt();
		A = sc.nextInt();
		int H[] = new int[N];
		double max = 99999;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			double t = T - H[i] * 0.006;
			if (max > Math.abs(A - t)) {
				;
				max = Math.abs(A - t);
				ans = i + 1;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
