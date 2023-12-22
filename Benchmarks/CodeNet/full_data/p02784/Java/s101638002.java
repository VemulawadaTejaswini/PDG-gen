import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		sc.close();
		if (sum >= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
