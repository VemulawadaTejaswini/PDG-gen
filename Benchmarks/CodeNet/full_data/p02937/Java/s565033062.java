import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();

		List<List<Integer>> t_idx_list = new ArrayList<>();
		for (int i = 0; i < t.length; i++) {
			t_idx_list.add(new ArrayList<>());
			for (int j = 0; j < s.length; j++) {
				if (t[i] == s[j]) {
					t_idx_list.get(i).add(j);
				}
			}
		}
		for (List<Integer> idx_list : t_idx_list) {
			if (idx_list.isEmpty()) {
				System.out.println(-1);
				return;
			}
		}

		int s_idx = 0, t_idx = 0;
		long ans = 0;
		while (true) {
			if (s[s_idx] == t[t_idx]) {
				t_idx++;
			}
			if (t_idx == t.length) {
				break;
			}

			int next_idx = s.length;

			//s_idxより大きい値の、最初のindex
			//s_idxより大きい値がない場合
			//s_idxより小さい値の、最後のindex
			//			for (int idx : t_idx_list.get(t_idx)) {
			//				if (idx > s_idx) {
			//					next_idx = Math.min(next_idx, idx);
			//				}
			//				else {
			//					next_idx = idx;
			//				}
			//			}

			List<Integer> idx_list = t_idx_list.get(t_idx);
			if (s_idx > idx_list.get(idx_list.size() - 1)) {
				next_idx = idx_list.get(0);
			}
			else if (s_idx < idx_list.get(0)) {
				next_idx = idx_list.get(0);
			}
			else {
				next_idx = Arrays.binarySearch(idx_list.toArray(), s_idx) + 1;
			}

			if (next_idx > s_idx) {
				ans += next_idx - s_idx;
			}
			else {
				ans += s.length - s_idx + next_idx;
			}
			s_idx = next_idx;
		}

		System.out.println(ans + 1);
	}
}
