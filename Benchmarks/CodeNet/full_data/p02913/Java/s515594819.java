import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		br.close();

		List<TreeSet<Integer>> list = new ArrayList<>(26);
		for (int i = 0; i < 26; i++) {
			list.add(new TreeSet<>());
		}
		for (int i = 0; i < n; i++) {
			list.get(s[i] - 'a').add(i);
		}

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			TreeSet<Integer> set = list.get(s[i] - 'a');
			NavigableSet<Integer> set2 = set.tailSet(i, false);
			label:
			for (int j : set2) {
				int end = j - i;
				if (j + end > n) {
					end = n - j;
				}
				if (end < ans) {
					continue;
				}
				for (int k = 0; k < end; k++) {
					if (s[i + k] != s[j + k]) {
						ans = Math.max(ans, k);
						j += k - 1;
						continue label;
					}
				}
				ans = Math.max(ans, end);
			}
		}
		System.out.println(ans);
	}
}
