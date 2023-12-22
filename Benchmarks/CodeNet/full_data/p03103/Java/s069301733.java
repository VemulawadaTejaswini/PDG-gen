import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	static void swap(int[][] a, int idx1, int idx2) {
		int t = a[idx1][1];
		int s = a[idx1][0];
		a[idx1][1] = a[idx2][1];
		a[idx1][0] = a[idx2][0];
		a[idx2][1] = t;
		a[idx2][0] = s; 
	}

	static void quicksort(int[][] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2][1];

		do {
			while (a[pl][1] < x) pl++;
			while (a[pr][1] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		}	while (pl <= pr);

		if (left < pr)
			quicksort(a, left, pr);
		if (pl < right)
			quicksort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long m = stdIn.nextLong();
		int[] a = new int[n];
		int[] b = new int[n];
		int[][] c = new int[n][2];
		for (int i = 0; i < n; i++){
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
			c[i][0] = i;
			c[i][1] = a[i];
			//System.out.println();
			//System.out.print(c[i][0] + ", " + c[i][1]);
 		}

		quicksort(c, 0, n-1);
		for (int i = 0; i < n; i++) {
			//System.out.println();
			//System.out.print(c[i][0] + ", " + c[i][1]);
		}
		long ans = 0;
		long u = m;
		for (int i = 0; i < n; i++) {
			u = m - b[c[i][0]];
			//System.out.println(u + ", " + m);
			if (u > 0) {
				ans = ans + c[i][1] * b[c[i][0]];
				m = u;
			}
			else {
				//System.out.println(ans);
				ans = ans + m * a[c[i][0]];
				//System.out.println(m * a[c[i][0]]);
				break; 
			}
		}
		System.out.println(ans);
	}
}