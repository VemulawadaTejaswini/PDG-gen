import java.util.Scanner;

public class ABC125B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V[] = new int[N];
		int C[] = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
			C[i] = sc.nextInt();
			if (V[i] > C[i]) {
				ans += V[i] - C[i];
			}
		}
		sc.close();
		System.out.println(ans);
	}
}