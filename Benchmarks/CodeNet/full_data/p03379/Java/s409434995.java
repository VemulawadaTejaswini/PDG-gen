import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextLong();
			y[i] = x[i];
		}
		Arrays.sort(y);
		double median = ((double)y[N/2-1]+(double)y[N/2])/2;
		if (N == 2) {
			System.out.println(y[1]);
			System.out.println(y[0]);
			return;
		}
		for (int i = 0; i < x.length; i++) {
			if ((double)x[i] <= median) {
				System.out.println(y[N/2]);
			} else {
				System.out.println(y[(N-2)/2]);
			}
		}
	}
}
