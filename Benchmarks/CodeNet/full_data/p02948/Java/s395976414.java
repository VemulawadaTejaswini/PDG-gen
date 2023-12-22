import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int ab[][] = new int[n+1][2];
		long earn = 0;

		for ( int i = 1; i <= n; i++ ) {
			ab[i][0] = in.nextInt();
			ab[i][1] = in.nextInt();
		}

		for ( int day = m; 0 <= day; day-- ) {
			
			int dayEarn = -1;
			int idx = -1;
			int span = -1;
			
			for ( int i = 1; i <= n; i++ ) {
				if(ab[i][0] > day) {
					continue;
				}
				else
				if(dayEarn <= ab[i][1] && span <= ab[i][0]) {
					dayEarn = ab[i][1];
					idx = i;
					span = ab[i][0];
				}
			}
			// 2回ループしないと取り漏らしそう
			for ( int i = 1; i <= n; i++ ) {
				if(ab[i][0] > day) {
					continue;
				}
				else
				if(dayEarn <= ab[i][1] && span <= ab[i][0]) {
					dayEarn = ab[i][1];
					idx = i;
					span = ab[i][0];
				}
			}
			
			if(idx != -1 ) {
				// System.out.println(day + " " + ab[idx][0] + " " + ab[idx][1] );
				ab[idx][0] = Integer.MAX_VALUE;
              	ab[idx][1] = 0;
				earn += dayEarn;
			}			
		}

		System.out.println(earn);
		in.close();
	}
}
