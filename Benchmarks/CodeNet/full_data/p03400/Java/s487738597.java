import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int ans = X;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (D / A * A + 1 <= D) {
				ans += D / A + 1;
			} else {
				ans += D / A;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}