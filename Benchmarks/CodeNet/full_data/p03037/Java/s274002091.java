import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		int M = sc.nextInt();

		int L[] = new int[M];
		int R[] = new int[M];

		for (int j = 0; j < M; j++) {
			L[j] = sc.nextInt();
			R[j] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < M; j++) {
				if (L[j] <= i && i <= R[j]) {
				} else {
					count++;
					break;
				}
			}
		}
		System.out.print(N - count);
	}
}
