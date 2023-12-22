import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, T;
		N = sc.nextInt();
		T = sc.nextInt();
		int[] t = new int[N];
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}

		long sum = T;
		for (int i = 0; i < t.length - 1; i++) {
			sum += Math.min(T, t[i + 1] - t[i]);
		}

		System.out.println(sum);
	}
}