import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), K = sc.nextInt();
		sc.close();
		int max = Math.max(A, Math.max(B, C));
		int ans = 0;

		for (int i = 0; i < K; i++) {
			ans += max;
		}
		System.out.println(ans + A + B + C);
	}
}
