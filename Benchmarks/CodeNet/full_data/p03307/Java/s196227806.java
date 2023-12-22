
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C[] = new long[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt() - i - 1;
		}

		Arrays.sort(C);
		int naka = N / 2 + 1;
		long b = 0;
		b = C[naka-1];
		long sum = 0;
		for (int j = 0; j < N; j++) {
			sum += Math.abs((C[j] - b));

		}
		System.out.println(sum);
	}

}