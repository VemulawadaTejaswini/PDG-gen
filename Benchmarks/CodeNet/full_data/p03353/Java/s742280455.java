import java.util.*;

public class Main {

	public static void addorder(String ans[], String t) {
		String tar = t.substring(0);
		int a = ans.length;
		for (int i = 0; i < a; ++i) {
			if (ans[i] == null) {
				ans[i] = tar.substring(0);
				break;
			}else {
				String tmp = ans[i];
				if (tmp.equals(tar))
					break;
				else if (tmp.compareTo(tar) > 0) {
					ans[i] = tar.substring(0);
					tar = tmp.substring(0);
				}
			}
		}
	}

	public static String solve(String s, int k) {
		String ans = "";
		int n = s.length();
		char tmp[] = s.toCharArray();
		Arrays.sort(tmp);
		char min = tmp[0];

		List<Character> tmp2 = new ArrayList<Character>();
		tmp2.add(min);
		for (int i = 0; i < n; ++i) {
			if (tmp[i] != min) {
				tmp2.add(tmp[i]);
				min = tmp[i];
			}
		}

		String a[] = new String[k];
		for (int i = 0; i < tmp2.size(); ++i) {
			min = tmp2.get(i);
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; ++j) {
				if (s.charAt(j) == min)
					list.add(j);
			}
			for (int j = 0; j < list.size(); ++j) {
				int m = list.get(j);
				for (int l = 1; l <= k; ++l) {
					if (l + m > n)
						break;
					String t = s.substring(m, m + l);
					addorder(a, t);
				}
			}
			if (a[k - 1] != null) {
				ans = a[k - 1].substring(0);
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		String ans = solve(s, k);
		System.out.println(ans);
	}

}
