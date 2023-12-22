import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long sumAll = 0;
		long[] sums = new long[n];
		for (int i = 0; i < n; i++ ) {
			sumAll += sc.nextLong();
			sums[i] = sumAll;
		}

		long minDif = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			long dif = Math.abs(sumAll - sums[i] * 2);
			if (dif < minDif) {
				minDif = dif;
			}
		}
		System.out.println(minDif);
		sc.close();
	}
}
