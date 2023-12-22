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
		int max;
		max = a[0] - 1;
		for (int j = 0; j < n; j++) {
			int s = Math.abs(a[j] - j - 1);
			if (max < s)
				max = s;
		}
		int abs;
		abs = 0;
		int t = max;
		for (int l = 0; l < n; l++) {
			abs = abs + Math.abs(a[l] - l - 1 + t);
		}
		System.out.println(abs);
	}
}
