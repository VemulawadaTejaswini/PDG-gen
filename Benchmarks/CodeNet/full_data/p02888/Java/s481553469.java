import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int[] L = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			L[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		int count = 0;
		for (int i = 1; i <= N - 2; i++) {
			for (int j = i + 1; j <= N - 1; j++) {
				for (int k = j + 1; k <= N; k++) {
					if (L[i] < L[j] + L[k] && L[j] < L[i] + L[k] && L[k] < L[i] + L[j]) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}
}
