import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt() - 1;
		}
		sc.close();

		int[] d = new int[4];
		d[1] = w;
		d[3] = h;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				d[a[i]] = Math.max(d[a[i]], x[i]);
			} else if (a[i] == 1) {
				d[a[i]] = Math.min(d[a[i]], x[i]);
			} else if (a[i] == 2) {
				d[a[i]] = Math.max(d[a[i]], y[i]);
			} else if (a[i] == 3) {
				d[a[i]] = Math.min(d[a[i]], y[i]);
			}
		}
		System.out.println(Math.max(d[1] - d[0], 0) * Math.max(d[3] - d[2], 0));
	}
}
