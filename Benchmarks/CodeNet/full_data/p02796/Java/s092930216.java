import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long l[] = new long[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			l[i] = sc.nextLong();
		}

		long cnt = 1;

		Arrays.sort(x);

		long lt = x[0] - l[0];
		long rt = x[0] + l[0];

		for (int i = 1; i < l.length; i++) {
			lt = x[i] - l[i];
			if (rt <= lt) {
				rt = x[i] * l[i];
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
