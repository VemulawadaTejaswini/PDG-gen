import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < N; i++) {
				int key = scanner.nextInt();
				if (map.containsKey(key)) {
					;
				} else {
					map.put(key, 1);
				}
			}
			System.out.println(map.size());
		}
	}
}