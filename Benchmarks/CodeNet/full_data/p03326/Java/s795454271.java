import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long scs[][] = new long[8][n];
		for (int i=0; i<n; i++){
			long vals[] = new long[3];
			vals[0] = scanner.nextLong();
			vals[1] = scanner.nextLong();
			vals[2] = scanner.nextLong();
			for (int k=0; k<8; k++){
				long sc = 0;
				int tmpk = k;
				for (int j=0; j<3; j++){
					sc += (long)Math.pow(-1,tmpk%2)*vals[j];
					tmpk /= 2;
				}
				scs[k][i] = sc;
			}
		}

		long ans = 0;
		for (int i=0; i<8; i++){
			long sorted[] = scs[i];
			Arrays.sort(sorted);
			long score = 0;
			for (int k=1; k<=m; k++){
				score += sorted[n-k];
			}
			ans = Math.max(ans, score);
		}

		System.out.println(ans);
	}
}