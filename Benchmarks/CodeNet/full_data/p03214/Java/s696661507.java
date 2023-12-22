import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();	
		}
		double s = 0;
		for (int i = 0; i < n; i++) {
			s = s + a[i];
		}
		s = s * 1.0 / n;
		double min = Math.abs(a[0] - s);
		int j = 0;
		for (int i = 0; i < n; i++) {
			double t = Math.abs(a[i] - s);
			if (t < min) {
				min = t;
				j = i;
			}
		}
		System.out.println(j);
	}
}