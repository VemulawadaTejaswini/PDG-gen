import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P[] = new int[N];
		int result = 0;

		for (int i = 0; i < N; i++) {
			P[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int a = 0;
			for (int j = 0; j < i; j++) {
				if (P[i] > P[j]) {
					a++;
				}
			}
			if (a == 0) {
				result++;
			}
		}

		System.out.println(result);

	}

}
