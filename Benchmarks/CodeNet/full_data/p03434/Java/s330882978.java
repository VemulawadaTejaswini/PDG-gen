import java.util.Arrays;
import java.util.Scanner;

public class Main{

	private static int sumA = 0;
	private static int sumB = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int i = N - 1; i >= 0; i -= 2) {
			sumA += a[i];

		}
		for (int i = N - 2; i >= 0; i -= 2) {

			sumB += a[i];
		}

		System.out.println(sumA - sumB);
	}

}