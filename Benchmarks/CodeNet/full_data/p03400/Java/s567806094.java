import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt();
		int A[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += (D / A[i]) + 1;
		}
		sc.close();
		System.out.println(sum + X);
	}
}
