import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long day = 0;
		int[][] a = new int[n][n-1];
		int[] end = new int[n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1; j++) {
				a[i][j] = in.nextInt()-1;
			}
			//end[i] = 0;
		}

		while(true) {
			int c = 0;
			boolean[] flag = new boolean[n];

			for(int i = 0; i < n; i++) {
				if(end[i] == n-1 || flag[i])
					continue;

				int opp = a[i][end[i]];
				if(end[opp] == n-1 || flag[opp])
					continue;

				if(i == a[opp][end[opp]]) {
					flag[i] = true;
					flag[opp] = true;
					end[i]++;
					end[opp]++;
					c++;
				}
			}


			if(c == 0) {
				break;
			}

			day++;
		}

		for(int i = 0; i < n; i++) {
			if(end[i] != n-1) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(day);
		return;
	}
}
