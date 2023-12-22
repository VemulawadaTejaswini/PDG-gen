
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
			y[i] = Integer.parseInt(scan.next());
			h[i] = Integer.parseInt(scan.next());
		}
		int Cx = -1;
		int Cy = -1;
		int[] H_Candidates = new int[N];
		boolean find = true;
		for (int i = 0; i <= 100; i++) {
			Cx = i;
			for (int j = 0; j <= 100; j++) {
				Cy = j;
				find = true;
				H_Candidates = new int[N];
				for (int k = 0; k < N; k++) {
					H_Candidates[k] = h[k] + Math.abs(Cx - x[k]) + Math.abs(Cy - y[k]);
					if (k != 0) {
						if (H_Candidates[k - 1] != H_Candidates[k]) {
							find = false;
							break;
						}
					}
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
