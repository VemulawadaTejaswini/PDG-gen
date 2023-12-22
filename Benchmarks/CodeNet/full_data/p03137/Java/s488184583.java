import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<String> color = new ArrayList<>();
//int[] n = new int[k];

class Main {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t; 
	}

	static void quicksort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		}	while (pl <= pr);

		if (left < pr)
			quicksort(a, left, pr);
		if (pl < right)
			quicksort(a, pl, right);
	}

	static void quicksort2(int[] a, int n) {
		quicksort(a, 0, n - 1);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[] x = new int[m];
		for (int i = 0;i < m; i++)
			x[i] = stdIn.nextInt();
		int ans;
		int s = 0;
		if (n >= m)
			ans = 0;
		else {
			quicksort2(x, m);
			int[] y = new int[m-1];
			for (int i = 0; i < m-1; i++)
				y[i] = x[i+1] - x[i];
			quicksort2(y, m-1);
			for (int i = 0; i < m-n; i++)
				s = s + y[i];
			ans = s;
		}
		System.out.println(ans);
	}
}