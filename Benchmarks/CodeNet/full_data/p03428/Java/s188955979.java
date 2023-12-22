import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Point[] z = new Point[n];
		double x = 0, y = 0;
		for (int i = 0; i < n; i++) {
			z[i] = new Point(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
			x += z[i].x;
			y += z[i].y;
		}
		double gx = x / n;
		double gy = y / n;
		double[] d = new double[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			d[i] = Math.sqrt((gx - z[i].x) * (gx - z[i].x) + (gy - z[i].y) * (gy - z[i].y));
			sum += d[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.println(d[i] / sum);
		}

	}
	public static  class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}