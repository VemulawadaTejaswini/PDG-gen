import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'F') {
				cnt++;
			} else {
				list.add(cnt);
				cnt = 0;
			}
		}
		list.add(cnt);

		List<Set<Integer>> sets = new ArrayList<>();
		sets.add(new HashSet<>());
		sets.add(new HashSet<>());
		sets.get(0).add(0);
		sets.get(1).add(0);
		for (int i = 0; i < list.size(); i++) {
			Set<Integer> set = sets.get(i % 2);
			Integer[] arr = set.toArray(new Integer[0]);
			for (int o : arr) {
				set.add(o + list.get(i));
				set.add(o - list.get(i));
			}
		}

		if (sets.get(0).contains(x) && sets.get(1).contains(y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
