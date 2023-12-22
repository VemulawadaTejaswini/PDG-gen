import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[T];

		for (int i = 0; i < T; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		for (int i = 0; i < T - 1; i++){
			a[T - 1] = a[T - 1] - a[T - 2];
			a[T - 2] = 0;
			Arrays.sort(a);
		}

		System.out.println(a[T-1] -1);
		sc.close();
	}

}
