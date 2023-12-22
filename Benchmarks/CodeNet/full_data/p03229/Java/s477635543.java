import java.util.Scanner;
import java.lang.Math;

class Main {
	static void swap(int[] a, int b, int c) {
		int d = a[b];
		a[b] = a[c];
		a[c] = d;
	}
	static int[] sort(int[] a, int l, int r) {
		int pl = l;
		int pr = r;
		int x = a[(pl + pr) / 2];
		do {
			while (a[pl] < x)
				pl = pl + 1;
			while (a[pr] > x)
				pr = pr - 1;
			if (pl <= pr){
				swap(a, pl, pr);
				pl = pl + 1;
				pr = pr - 1;
			}
		} while (pl <= pr);
		if (l < pr)
			sort(a, l, pr);
		if (r > pl)
			sort(a, pl, r);
		return a;
	}

	static int dif(int[] a, int n) {
		int s, s1, s2;
		s = s1 = s2 = 0;
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2 - 1; i++) 
				s = s - 2 * a[i] + 2 * a[n - 1 - i];
			s = s - a[n / 2 - 1] + a[n / 2];
		}
		else {
			for (int j = 0; j < n / 2; j++) 
				s1 = s1 - 2 * a[j] + 2 * a[n - 1 - j];
			s1 = s1 + a[n / 2] - a[n / 2 + 1];
			for (int k = 0; k < n / 2; k++)
				s2 = s2 - 2 * a[k] + 2 * a[n - 1 - k];
			s2 = s2 + a[n / 2 - 1] - a[n / 2];
			if (s1 <= s2)
				s = s2;
			else
				s = s1;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = stdIn.nextInt(); 
		b = sort(a, 0, n - 1);
		int t = dif(b, n);
		System.out.println(t);
	}
}