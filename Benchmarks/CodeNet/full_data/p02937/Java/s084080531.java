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

//		List<List<Integer>> t_idx_list = new ArrayList<>();
//		for (int i = 0; i < t.length; i++) {
//			t_idx_list.add(new ArrayList<>());
//			for (int j = 0; j < s.length; j++) {
//				if (t[i] == s[j]) t_idx_list.get(i).add(j);
//			}
//		}
//		for (List<Integer> idx_list : t_idx_list) {
//			if (idx_list.isEmpty()) {
//				System.out.println(-1);
//				return;
//			}
//		}

		Map<Character, List<Integer>> s_map = new HashMap<>();
		for(int i = 0; i < s.length; i++) {
			List<Integer> idx_list = s_map.get(s[i]);
			if(idx_list == null) {
				idx_list = new ArrayList<>();
				s_map.put(s[i], idx_list);
			}
			idx_list.add(i);
		}

		for(char ti: t) {
			if(!s_map.containsKey(ti)) {
				System.out.println(-1);
				return;
			}
		}

		int s_idx = 0, t_idx = 0;
		long ans = 0;
		while (true) {
			if (s[s_idx] == t[t_idx]) t_idx++;
			if (t_idx == t.length) break;

			int next_idx;
//			List<Integer> idx_list = t_idx_list.get(t_idx);
			List<Integer> idx_list = s_map.get(t[t_idx]);
			if (s_idx > idx_list.get(idx_list.size() - 1) || s_idx < idx_list.get(0)) {
				next_idx = idx_list.get(0);
			}
			else next_idx = -Collections.binarySearch(idx_list, s_idx);

			ans += next_idx > s_idx ? next_idx - s_idx : s.length - s_idx + next_idx;
			s_idx = next_idx;
		}

		System.out.println(ans + 1);
	}
}