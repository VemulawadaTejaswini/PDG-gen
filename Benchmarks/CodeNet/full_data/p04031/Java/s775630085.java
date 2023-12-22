import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		int sumA = 0;

		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
			sumA += list.get(i);
		}

		int ans = 0;
		if (sumA % 2 == 0) {
			int harf = sumA / list.size();
			for (int i : list) {
				ans += (i - harf) * (i - harf);
			}
		} else {
			int x = sumA / list.size();
			int y = sumA / list.size() + 1;
			int z = sumA / list.size() - 1;
			int ansX = 0;
			int ansY = 0;
			for (int i : list) {
				ansX += (i - x) * (i - x);
			}
			for (int i : list) {
				ansY += (i - y) * (i - y);
			}
			for (int i : list) {
				ansY += (i - z) * (i - z);
			}
			ans = Math.min(ansX, ansY);
		}

		System.out.println(ans);
	}
}