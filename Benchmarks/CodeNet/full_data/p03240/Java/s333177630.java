import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int anscx = 0;
		int anscy = 0;
		int ansh = 0;
		boolean bre = false;
		out: for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				int sample = 0;
				for (int i = 0; i < n; i++) {
					if (h[i] != 0) {
						sample = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
						break;
					}
				}
				for (int i = 0; i < n; i++) {
					int tmp = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
					if (h[i] == 0) {
						if (sample > tmp) {
							bre = true;
							break;
						}
					} else if (tmp != sample){
						bre = true;
						break;
					}
				}
				if (!bre) {
					anscx = cx;
					anscy = cy;
					ansh = sample;
					break out;
				} else {
					bre = false;
				}
			}
		}
		System.out.println(anscx + " " + anscy + " " + ansh);
	}
}