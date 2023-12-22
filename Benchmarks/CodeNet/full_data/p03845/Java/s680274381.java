import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer> times = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			times.add(scanner.nextInt());
		}

		int m = scanner.nextInt();
		List<Integer> pList = new ArrayList<>();
		List<Integer> xList = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			pList.add(scanner.nextInt());
			xList.add(scanner.nextInt());
		}

		int index = 0;
		for (int p : pList) {
			List<Integer> t = new ArrayList<>(times);
			t.set(p - 1, xList.get(index));
			int ans = 0;
			for (int time : t) {
				ans += time;
			}
			System.out.println(ans);
			index++;
		}
	}
}
