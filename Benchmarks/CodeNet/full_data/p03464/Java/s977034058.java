import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		for (int i = k - 1; i >= 0; i--) {
			int x = arr[i];
			ArrayList<Integer> next = new ArrayList<>();
			for (int y : list) {
				if (y % x == 0) {
					for (int j = 0; j < x; j++) {
						next.add(y + j);
					}
				}
			}
			if (next.size() == 0) {
				System.out.println(-1);
				return;
			}
			list = next;
		}
		Collections.sort(list);
		System.out.println(list.get(0) + " " + list.get(list.size() - 1));
	}
}
