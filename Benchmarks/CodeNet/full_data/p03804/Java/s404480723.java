import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String A[] = new String[M];
		String B[] = new String[N];
		for (int i = 0; i < M; i++) {
			A[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.next();
		}
		for (int i = 0; i < M - N + 1; i++) {
			for (int j = 0; j < N; j++) {
				boolean b = false;
				for (int k = 0; k < M - N + 1; k++) {
					for (int l = 0; l < N; l++) {
						if (A[i + j].charAt(k + l) != B[j].charAt(l)) {
							b = false;
							break;
						}

					}
				}
				if (b == true) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
		return;
	}
}