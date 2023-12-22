import java.util.*;

public class Main {

	static int n, a[], b[], p[], p2[];
	static List<Integer> list[];

	public static int halfupper(int a[], int t) {
		int r = 0, l = a.length - 1;
		int m;

		while (r < l) {
			m = (r + l) / 2;
			if (l - r <= 1) {
				if (a[m] > t)
					return m;
				else if (a[m] <= t && a[m + 1] > t)
					return m + 1;
				else
					return m + 2;
			} else {
				if (a[m] <= t)
					r = m;
				else
					l = m;
			}
		}

		if (a[0] > t)
			return 0;
		else
			return -1;
	}

	public static int halflower(int a[], int t) {
		int r = a.length - 1, l = 0;
		int m;

		while (l < r) {
			m = (r + l) / 2;
			if (r - l <= 1) {
				if (a[m + 1] < t)
					return m + 1;
				else if (a[m + 1] >= t && a[m] < t)
					return m;
				else
					return m - 1;
			} else {
				if (a[m] >= t)
					r = m;
				else
					l = m;
			}
		}

		if (a[0] < t)
			return 0;
		else
			return -1;
	}

	public static void solve(int ptv) {
		int min;
		int k;
		if (ptv >= 0) {
			min = a[0];
			for (int i = 1; i < n; ++i) {
				k = 0;
				if (min > a[i]) {
					int tmp = p[i];
					int s = min + 1 - a[i];
					int pos = halfupper(b, s);
					if (pos == -1) {
						pos = 0;
						k = -1;
					}
					if (pos >= n) {
						pos = n - 1;
						k = -1;
					}
					s = b[pos];
					a[i] += s;
					b[tmp] += s;
					list[1].add(i + 1);
					list[0].add(p2[pos] + 1);
					Arrays.sort(b);
					for (int j = 0; j < n; ++j) {
						int tmp2 = Arrays.binarySearch(b, a[j]);
						p[j] = tmp2;
						p2[tmp2] = i;
					}
				}
				i += k;
				min = a[i];
			}
		} else {
			min = a[n - 1];
			for (int i = n - 2; i >= 0; --i) {
				k = 0;
				if (min < a[i]) {
					int tmp = p[i];
					int s = min - 1 - a[i];
					int pos = halflower(b, s);
					if (pos == -1) {
						pos = 0;
						k = 1;
					}
					if (pos >= n) {
						pos = n - 1;
						k = 1;
					}
					s = b[pos];
					a[i] += s;
					b[tmp] += s;
					list[1].add(i + 1);
					list[0].add(p2[pos] + 1);
					Arrays.sort(b);
					for (int j = 0; j < n; ++j) {
						int tmp2 = Arrays.binarySearch(b, a[j]);
						p[j] = tmp2;
						p2[tmp2] = i;
					}
				}
				i += k;
				min = a[i];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		p = new int[n];
		p2 = new int[n];
		list = new List[2];
		for (int i = 0; i < 2; ++i)
			list[i] = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		sc.close();
		Arrays.sort(b);
		for (int i = 0; i < n; ++i) {
			int tmp = Arrays.binarySearch(b, a[i]);
			p[i] = tmp;
			p2[tmp] = i;
		}
		if (b[0] < 0 && b[n - 1] > 0) {
			int max = b[0];
			int pos = p2[0];
			if (Math.abs(max) <= b[n - 1]) {
				max = b[n - 1];
				pos = p2[n - 1];
			}
			for (int i = 0; i < n; ++i) {
				if (b[i] != max)
					b[i] += max;
				if (a[i] != max) {
					a[i] += max;
					list[1].add(i + 1);
					list[0].add(pos + 1);
				}
			}
		}
		int ptv = b[0];
		solve(ptv);
		n = list[0].size();
		System.out.println(n);
		for (int i = 0; i < n; ++i) {
			System.out.println(list[0].get(i) + " " + list[1].get(i));
		}
	}

}
