import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] bar = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			bar[i] = in.nextInt();
		}
		Arrays.sort(bar);

		int barmax = bar[n - 1];

		// i以上の長さのbarの個数＝lenNum[i]
		int[] lenNum = new int[barmax + 1];
		for ( int i = 0; i < n; i++ ) {
			lenNum[bar[i]]++;
		}
		for ( int i = barmax; 0 < i; i-- ) {
			lenNum[i - 1] += lenNum[i];
		}

		int cnt = 0;
		for ( int S = 0; S < n - 2; S++ ) {
			for ( int M = S + 1; M < n - 1; M++ ) {
				if ( bar[M] == barmax ) {
					cnt += (n - 1 - M);
				} else if ( barmax < bar[S] + bar[M] ) {
					cnt += lenNum[bar[M] + 1];
				} else {
					cnt += lenNum[bar[M] + 1] - lenNum[bar[S] + bar[M]];
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
