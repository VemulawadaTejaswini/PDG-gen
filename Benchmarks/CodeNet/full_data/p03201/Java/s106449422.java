import java.util.*;

public class Main {
	public static void main (String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int power = 2;
		for (int i = 0; i < 30; i++) {
			set.add(power);
			power *= 2;
		}
 		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int idx = n - 1;
		int count = 0;
		while (idx > 0) {
			int x = list.get(idx);
			for (int i = idx - 1; i >= 0; i--) {
				if (set.contains(x + list.get(i))) {
					list.remove(idx);
					list.remove(i);
					idx--;
					count++;
					break;
				}
			}
			idx--;
		}
		System.out.println(count);
	}
}
