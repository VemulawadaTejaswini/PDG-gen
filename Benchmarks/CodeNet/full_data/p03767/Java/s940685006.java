import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[3*N];

		for (int i = 0; i < N*3; i++) {
			a[i] = sc.nextInt();
		}

		long sum = 0;

		Arrays.sort(a);

		for (int i = N; i < 3 * N; i++) {

			if (N%2 == 0) {
				if(i%2==0) {
					sum += a[i];
				}
			} else {
				if(i%2==1) {
					sum += a[i];
				}
			}
		}
		System.out.println(sum);
	}
}
