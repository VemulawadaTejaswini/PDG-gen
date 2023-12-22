
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[][] rec = new int[H][W];
		for (int i = 0; i < N; i++) {
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			int a = sc.nextInt();
			if (a == 1) {
				for (int j = 0; j < rec.length; j++) {
					for (int j2 = 0; j2 < xi; j2++) {
						rec[j][j2]++;
					}
				}
			} else if (a == 2) {
				for (int j = 0; j < rec.length; j++) {
					for (int j2 = xi; j2 < rec[j].length; j2++) {
						rec[j][j2]++;
					}
				}
			} else if (a == 3) {
				for (int j = 0; j < yi; j++) {
					for (int j2 = 0; j2 < rec[j].length; j2++) {
						rec[j][j2]++;
					}
				}
			} else if (a == 4) {
				for (int j = yi; j < rec.length; j++) {
					for (int j2 = 0; j2 < rec[j].length; j2++) {
						rec[j][j2]++;
					}
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < rec.length; i++) {
			for (int j = 0; j < rec[i].length; j++) {
				if (rec[i][j] == 0)
					ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}