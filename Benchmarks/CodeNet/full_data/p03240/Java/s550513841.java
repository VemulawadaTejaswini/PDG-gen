import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int ans = 0, xmin = Integer.MAX_VALUE, xmax = 0, ymin = Integer.MAX_VALUE, ymax = 0;
		int xc = 0, yc = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if (x[i] < xmin) {
				xmin = x[i];
			}
			if (xmax < x[i]) {
				xmax = x[i];
			}
			if (y[i] < ymin) {
				ymin = y[i];
			}
			if (ymax < y[i]) {
				ymax = y[i];
			}
		}
		
		xc = xmin + (xmax - xmin)/2;
		yc = ymin + (ymax - ymin)/2;
		
		ans = Math.abs(x[0] - xc) + Math.abs(y[0] - yc) + h[0];

		System.out.println(xc+" "+yc+" "+ans);

		sc.close();
	}
}

