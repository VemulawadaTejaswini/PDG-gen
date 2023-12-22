import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();

		int[] L = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			L[i] = scan.nextInt();
		}

		int[] D = new int[N + 1];
		D[1] = 0;
		for (int i = 2; i <= N; i++) {
			D[i] = D[i - 1] + L[i - 1];
			if (D[i] > X) {
				System.out.println("---------");
				System.out.println(i-1);
				return;
			}
			System.out.println("---------");
			System.out.println(N);
			return;

		}
	}
}
