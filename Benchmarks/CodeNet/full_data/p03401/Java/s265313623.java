import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			int ans = 0;
			int pos = 0;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				ans += Math.abs(A[j] - pos);
				pos = A[j];
			}
			ans += Math.abs(pos);
			System.out.println(ans);
		}
	}
}