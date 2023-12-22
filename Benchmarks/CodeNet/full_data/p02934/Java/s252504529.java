import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] A = new double[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextDouble();

		double x = 0;

		for (int i = 0; i < N; i++) {
			x += 1 / A[i];
		}

		double ans = 1 / x;
		System.out.println(ans);
	}

}