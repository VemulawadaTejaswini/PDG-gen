import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int min = String.valueOf(N).length();
		for (long i = 2; i < N; i++) {
			if (N % i == 0) {
				long div = N / i;
				int digit = Math.max(String.valueOf(i).length(), String.valueOf(div).length());
				if (min > digit) {
					min = digit;
				}
			}
		}
		System.out.printf("%d", min);
	}
}