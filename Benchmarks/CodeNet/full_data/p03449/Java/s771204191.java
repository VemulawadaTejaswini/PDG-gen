import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> line = new ArrayList<>();
		while (sc.hasNext()) {
			line.add(sc.nextInt());
		}
		sc.close();

		int result = 0;

		for (int index = 1 ; index <= n ; index++) {
			int target = 0;
			for (int i = 0 ; i < index ; i++) {
				target = target + line.get(i);
			}
			for (int k = 2 * n - 1 ; k >= n + index - 1 ; k--) {
				target = target + line.get(k);
			}
			if (result <= target) {
				result = target;
			}
		}
		System.out.println(result);
	}
}
