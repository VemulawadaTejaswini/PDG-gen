import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] len = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			len[i] = in.nextInt();
		}
		Arrays.sort(len, Comparator.reverseOrder());

		int cnt = 0;
		for ( int e1 = 0; e1 < n; e1++ ) {
			for ( int e2 = e1 + 1; e2 < n; e2++ ) {
				
				int d = len[e1] - len[e2];
				
				for ( int e3 = e2 + 1; e3 < n; e3++, cnt++ ) {
					if ( len[e3] <= d ) break;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}