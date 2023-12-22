import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		ArrayList<Integer>[] lists = new ArrayList[26];
		for (int i = 0; i < 26; i++) {
			lists[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < arr.length; i++) {
			int idx = arr[i] - 'a';
			lists[idx].add(i);
		}
		for (int i = 0; i < 26; i++) {
			if (lists[i].size() < 2) {
				continue;
			}
			for (int j = 0; j < lists[i].size() - 1; j++) {
				for (int k = 1; k < lists[i].size(); k++) {
					int jj = lists[i].get(j);
					int kk = lists[i].get(k);
					if ((kk - jj + 1) / 2 < k - j + 1) {
						System.out.println((jj + 1) + " " + (kk + 1));
						return;
					}
				}
			}
		}
		System.out.println("-1 -1");
	}
}
