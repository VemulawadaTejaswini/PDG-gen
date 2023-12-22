import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		long cost = 0;
		while (list.size() > 1) {
			Collections.sort(list);
			long add = list.get(0) + list.get(1);
			list.remove(1);
			list.remove(0);
			list.add(add);
			cost += add;
		}
		System.out.println(cost);
	}
	
}
