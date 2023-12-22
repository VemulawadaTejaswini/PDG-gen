import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<KeySort> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			int b = sc.nextInt();
			list.add(new KeySort(b, a));
		}
		Collections.sort(list, new KeySortComparator());
		long money = 0;
		for (int i = 0; i < n; i++) {
			if (list.get(i).key <= m) {
				money += list.get(i).key * list.get(i).sort;
				m -= list.get(i).key;
			} else {
				money += m * list.get(i).sort;
				break;
			}
		}
		System.out.println(money);
	}
}
class KeySort {
	public int key;
	public long sort;
	public KeySort(int key, long sort) {
		this.key = key;
		this.sort = sort;
	}
}

class KeySortComparator implements Comparator<KeySort> {
	@Override
	public int compare(KeySort sort1, KeySort sort2) {
		if (sort1.sort == sort2.sort) {
			return 0;
		} else if (sort1.sort > sort2.sort) {
			return 1;
		} else {
			return -1;
		}
	}
}