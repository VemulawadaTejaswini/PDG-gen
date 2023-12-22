import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = 0;
		}

		sc.nextLine();

		int tmp = 0;
		for (int i = 0; i < N - 1; i++) {
			tmp = sc.nextInt();
			A[tmp-1]++;
		}

		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);

		}

		sc.close();
	}

}
