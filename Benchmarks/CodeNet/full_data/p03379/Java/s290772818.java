import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int d[] = new int[N-1];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int c = 0;
		for (int i = 0; i < N; i++) {
			c = 0;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					b[j] = a[j];
				}
			}
			Arrays.sort(b);
			for(int k = 0; k < N - 1; k++) {
				d[k] = b[k+1];
			}
			System.out.println(d[(N - 1)/ 2]);
			for(int k = 0; k < N; k++) {
				b[k] = 0;
			}
		}
	}

}