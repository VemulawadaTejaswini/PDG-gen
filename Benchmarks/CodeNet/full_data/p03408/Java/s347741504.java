import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			scanner.nextLine();

			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < count; i++) {
				String key = scanner.nextLine();
				Integer val = map.get(key);
				if (val == null) {
					val = 1;
				} else {
					val++;
				}
				map.put(key, val);
			}

			count = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < count; i++) {
				String key = scanner.nextLine();
				Integer val = map.get(key);
				if (val == null) {
					val = -1;
				} else {
					val--;
				}
				map.put(key, val);
			}

			List<Integer> list = new ArrayList<>(map.values());
			Collections.sort(list);
			int max = list.get(list.size() - 1);
			if (max > 0) {
				System.out.println(max);
			} else {
				System.out.println(0);
			}
		}
	}
}
