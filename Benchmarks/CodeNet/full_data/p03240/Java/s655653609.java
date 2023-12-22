
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] x = new int[N];
		int[] y = new int[N];
		long[] h = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
			y[i] = Integer.parseInt(scan.next());
			h[i] = Integer.parseInt(scan.next());
		}
		int Cx = -1;
		int Cy = -1;
		long[] H_Candidates = new long[N];
		boolean find = true;
		int preK=0;
		for (int i = 0; i <= 100; i++) {
			Cx = i;
			for (int j = 0; j <= 100; j++) {
				Cy = j;
				find = true;
				//H_Candidates = new int[N];
				for (int k = 0; k < N; k++) {
					while(h[k]==0) {
						k++;
					}
					H_Candidates[k] = h[k] + Math.abs(Cx - x[k]) + Math.abs(Cy - y[k]);
					if (k != 0) {
						if (H_Candidates[preK] != H_Candidates[k]) {
							find = false;
							break;
						}
					}
					preK=k;
				}
				if (find) {
					break;
				}
			}
			if (find) {
				break;
			}
		}
		System.out.println(Cx + " " + Cy + " " + H_Candidates[0]);
	}
}
