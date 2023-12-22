import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int m[] = new int[N];
		int sum = 0;
		int min = 1001;
		for (int i = 0; i < N; i++) {
			m[i] = sc.nextInt();
			sum += m[i];
			min = Math.min(min, m[i]);
		}
		sc.close();
		int a = X - sum;
		int ans = N;
		for (int i = 0; i <= a; i += min) {
			ans++;
		}
		System.out.println(ans-1);
	}
}
