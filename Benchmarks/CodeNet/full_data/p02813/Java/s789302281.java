import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
	static int[] p, q;
	static int cnt = 0;
	static int a, b;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		q = new int[n];
		for (int i = 0; i < n; i++) {
			q[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] target = new int[n];
		for (int i = 0; i < n; i++) {
			target[i] = i + 1;
		}
		permutation(target, new LinkedHashSet<>());
		System.out.println(Math.abs(a - b));
	}

	static void permutation(int[] target, LinkedHashSet<Integer> set) {
		if (set.size() == target.length) {
			cnt++;
			boolean flg = true;
			int x = 0;
			for (int i : set) {
				if (target[i] != p[x]) {
					flg = false;
					break;
				}
				x++;
			}
			if (flg) {
				a = cnt;
			}

			flg = true;
			x = 0;
			for (int i : set) {
				if (target[i] != q[x]) {
					flg = false;
					break;
				}
				x++;
			}
			if (flg) {
				b = cnt;
			}
			return;
		}

		for (int i = 0; i < target.length; i++) {
			if (!set.contains(i)) {
				set.add(i);
				permutation(target, set);
				set.remove(i);
			}
		}
	}
}
