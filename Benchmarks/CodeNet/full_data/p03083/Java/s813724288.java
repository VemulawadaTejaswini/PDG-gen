import java.util.*;
import java.lang.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int k = 0; k < (1 << r); k++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				int count = 0;
				for (int i = 0; i < r; i++) {
					boolean reversed = (((k >> i) & 1) == 1);
					if (reversed && a[i][j] == 1) count++;
					else if (!reversed && a[i][j] == 0) count++;
				}
				sum += Math.max(count, r - count);
			}
			answer = Math.max(answer, sum);
		}

		System.out.println(answer);
	}
}
