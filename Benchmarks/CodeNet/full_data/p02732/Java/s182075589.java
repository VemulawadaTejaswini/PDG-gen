import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();

		long[] a = new long[(int) N];
		long[] values = new long[(int) (N+1)];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			values[(int) a[i]]++;
		}
		sc.close();

		long sum = 0;
		for (long c : values) {
			if(c > 1) {
			sum += (c-1)*c/2;
			}
		}

		for (long c :a) {
			System.out.println(sum - (values[(int) c]-1));
		}

	}

}
