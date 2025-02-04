import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n + 1];
		int[] v = new int[n + 1];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for(int i = n - 1; i >= 0; i--) {
			v[i] = Math.min(v[i], v[i + 1] + t[i]);
		}
		System.out.println(Arrays.toString(v));
		double x = 0, vc = 0;
		for(int i = 0; i < n; i++) {
			double vn = v[i+1];
			if(v[i] < vn) {
				vn = v[i];
			}
			if(vc + t[i] < vn) {
				double vmax = vc + t[i];
				x += vmax * t[i];
				x -= (vmax - vc) * (vmax - vc) / 2;
				vc = vc + t[i];
			} else {
				double vmax = Math.min(v[i], (vc + vn + t[i]) / 2);
				x += vmax * t[i];
				x -= ((vmax - vc) * (vmax - vc) + (vmax - vn) * (vmax - vn)) / 2;
				vc = vn;
			}
		}
		System.out.println(x);
	}
}
