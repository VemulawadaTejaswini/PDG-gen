import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
		}
		ArrayList<HashSet<Integer>> list = new ArrayList<>();
		long x = getCount(n);
		StringBuilder sb = new StringBuilder();
		sb.insert(0, "\n").insert(0, x);
		for (int i = m - 1; i >= 1; i--) {
			if (x != 0) {
				HashSet<Integer> set1 = null;
				HashSet<Integer> set2 = null;
				for (int j = 0; j < list.size(); j++) {
					HashSet<Integer> s = list.get(j);
					if (set1 == null && s.contains(arrA[i])) {
						set1 = s;
						if (set2 != null) {
							if (set1 == set2) {
								break;
							}
							list.remove(j);
							x += getCount(set1.size()) + getCount(set2.size());
							set2.addAll(set1);
							x -= getCount(set2.size());
							break;
						}
					}
					if (set2 == null && s.contains(arrB[i])) {
						set2 = s;
						if (set1 != null) {
							if (set1 == set2) {
								break;
							}
							list.remove(j);
							x += getCount(set1.size()) + getCount(set2.size());
							set1.addAll(set2);
							x -= getCount(set1.size());
							break;
						}
					}
				}
				if (set1 != null && set2 != null) {
					
				}else if (set1 != null) {
					x += getCount(set1.size());
					set1.add(arrB[i]);
					x -= getCount(set1.size());
				} else if (set2 != null) {
					x += getCount(set2.size());
					set2.add(arrA[i]);
					x -= getCount(set2.size());
				} else {
					HashSet<Integer> set = new HashSet<>();
					set.add(arrA[i]);
					set.add(arrB[i]);
					list.add(set);
					x--;
				}
			}
			sb.insert(0, "\n").insert(0, x);
		}
		System.out.print(sb);
	}
	
	static long getCount(long x) {
		return x * (x - 1) / 2L;
	}
}
