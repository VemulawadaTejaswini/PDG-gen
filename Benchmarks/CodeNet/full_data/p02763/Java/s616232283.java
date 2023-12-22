import java.util.*;

public class Main {

	// t以上の値を持つ配列の要素を返す(setに対して)
	public static int setlowerbound(Set<Integer> s, int t) {
		Integer tmp[] = s.toArray(new Integer[0]);
		int index = lowerbound(tmp, t);
		if (index < 0)
			return Integer.MAX_VALUE;
		return tmp[index];
	}

	// tより大きい値を持つ配列の要素を返す(setに対して)
	public static int setupperbound(Set<Integer> s, int t) {
		Integer tmp[] = s.toArray(new Integer[0]);
		int index = upperbound(tmp, t);
		if (index < 0)
			return Integer.MAX_VALUE;
		return tmp[index];
	}

	// t以上の値を持つ配列の添え字を返す
	public static int lowerbound(Integer a[], int t) {
		int left = 0, right = a.length - 1;
		int m = 0;
		if (right < 0 || a[right] < t)
			return -1;

		while (left + 1 < right) {
			m = (right + left) / 2;
			if (a[m] <= t)
				left = m;
			else
				right = m;
		}
		if (a[left] < t)
			left = right;
		return left;
	}

	// tより大きい値を持つ配列の添え字を返す
	public static int upperbound(Integer a[], int t) {
		int left = 0, right = a.length - 1;
		int m = 0;
		if (a[right] <= t)
			return -1;

		while (left + 1 < right) {
			m = (right + left) / 2;
			if (a[m] <= t)
				left = m;
			else
				right = m;
		}
		if (a[left] <= t)
			left = right;
		return left;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set pos[] = new Set[26];
		for (int i = 0; i < 26; ++i) {
			pos[i] = new TreeSet<Integer>();
		}
		String s = sc.next();
		StringBuffer copy = new StringBuffer(s);
		for (int i = 0; i < n; ++i) {
			int t = (int) (copy.charAt(i) - 'a');
			pos[t].add(i + 1);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; ++i) {
			int type = sc.nextInt();
			if (type == 1) {
				int index = sc.nextInt();
				String c = sc.next();
				if (copy.charAt(index - 1) != c.charAt(0)) {
					int t = (int) (copy.charAt(index - 1) - 'a');
					pos[t].remove(index);
					copy.replace(index - 1, index, c);
					t = (int) (copy.charAt(index - 1) - 'a');
					pos[t].add(index);
				}
			} else {
				int ans = 0;
				int l = sc.nextInt();
				int r = sc.nextInt();
				for (int j = 0; j < 26; ++j) {
					int index = setlowerbound(pos[j], l);
					if (index <= r)
						ans++;
				}
				System.out.println(ans);
			}
		}
		sc.close();
	}
}
