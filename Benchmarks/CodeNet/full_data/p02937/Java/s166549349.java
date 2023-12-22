import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();

		Map<Character, List<Integer>> s_map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			s_map.putIfAbsent(s[i], new ArrayList<>());
			s_map.get(s[i]).add(i);
		}

		for (char ti : t) {
			if (!s_map.containsKey(ti)) {
				System.out.println(-1);
				return;
			}
		}

		int s_idx = 0, t_idx = 0, next_idx;
		long ans = 0;
		List<Integer> idx_list;
		while (true) {
			if (t_idx == t.length) break;
			if (s[s_idx] == t[t_idx]) {
				t_idx++;
				s_idx = (s_idx + 1) % s.length;
				ans++;
			}
			else {
				idx_list = s_map.get(t[t_idx]);
				if (s_idx > idx_list.get(idx_list.size() - 1) || s_idx < idx_list.get(0) || idx_list.size() == 1) {
					next_idx = idx_list.get(0);
				}
				else {
					int idx_list_idx = -Collections.binarySearch(idx_list, s_idx);
					next_idx = idx_list.get(idx_list_idx - 1);
				}

				ans += next_idx > s_idx ? next_idx - s_idx : s.length - s_idx + next_idx;
				s_idx = next_idx;
			}
		}
		System.out.println(ans);
	}
}