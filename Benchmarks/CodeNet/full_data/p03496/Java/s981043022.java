import java.util.*;

public class Main {

	static int n, a[], b[];
	static List<Integer> list[];

	public static void solve(int ptv) {
		if (ptv >= 0) {
			int min = a[0];
			for (int i = 1; i < n; ++i) {
				if (min > a[i]) {
					list[0].add(i);
					list[1].add(i + 1);
					a[i] += min;
				}
				min = a[i];
			}
		} else {
			int max = a[n - 1];
			for (int i = n - 2; i >= 0; --i) {
				if(max < a[i]) {
					list[0].add(i + 2);
					list[1].add(i + 1);
					a[i] += max;
				}
				max = a[i];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		list = new List[2];
		for (int i = 0; i < 2; ++i)
			list[i] = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		sc.close();
		Arrays.sort(b);
		int pos1 = 0, pos2 = 0;
		for(int i = 0; i < n; ++i) {
			if(a[i] == b[0])pos1 = i;
			if(a[i] == b[n - 1])pos2 = i;
		}
		int pos;
		if (b[0] < 0 && b[n - 1] > 0) {
			int max = b[0];
			pos = pos1;
			if (Math.abs(max) <= b[n - 1]) {
				max = b[n - 1];
				pos = pos2;
			}
			for (int i = 0; i < n; ++i) {
				b[i] += max;
				a[i] += max;
				list[1].add(i + 1);
				list[0].add(pos + 1);
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
