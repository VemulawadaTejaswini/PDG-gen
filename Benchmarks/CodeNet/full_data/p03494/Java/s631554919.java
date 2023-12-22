import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		int min = 999999999;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			int count = 0;
			while (A[i] % 2 == 0) {
				A[i] /= 2;
				count++;
			}
			min = Math.min(min, count);
		}

		sc.close();
		System.out.println(min);
	}
}
