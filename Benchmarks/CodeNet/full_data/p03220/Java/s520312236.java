import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		double T = stdIn.nextInt();
		double A = stdIn.nextInt();
		double[] H = new double[N];
		int h;
		for (int i = 0; i < N; i++) {
			h = stdIn.nextInt();
			H[i] = Math.abs(T - h * 0.006 - A);
		}
		double a = H[0];
		int b = 0;
		for (int j = 1; j < N; j++) {
			if (a > H[j]) {
				a = H[j];
				b = j;
			}
		}
		System.out.println(b + 1);
	}
}