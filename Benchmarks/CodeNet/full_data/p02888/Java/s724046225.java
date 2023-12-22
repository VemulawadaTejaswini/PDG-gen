import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] len = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			len[i] = in.nextInt();
		}
		Arrays.sort(len);

		int lenmax = len[n - 1];

		// i以上のlenの個数＝lenNum[i]
		int[] lenNum = new int[lenmax + 1];
		for ( int i = 0; i < n; i++ ) {
			lenNum[len[i]]++;
		}
		for ( int i = lenmax; 0 < i; i-- ) {
			lenNum[i - 1] += lenNum[i];
		}

		int cnt = 0;
		for ( int S = 0; S < n - 2; S++ ) {
			for ( int M = S + 1; M < n - 1; M++ ) {
				if ( lenmax < len[S] + len[M] ) {
					cnt += lenNum[len[M] + 1];
				} else {
					cnt += lenNum[len[M] + 1] - lenNum[len[S] + len[M]];
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
