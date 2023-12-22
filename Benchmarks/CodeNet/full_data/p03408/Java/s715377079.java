import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int numBlue = stdin.nextInt();
		Map<String, Integer> strCountMap = new HashMap<>();
		List<String> listBlue = new ArrayList<>();
		for (int i = 0; i < numBlue; i++) {
			String str = stdin.next();
			int count = strCountMap.getOrDefault(str, 0) + 1;
			strCountMap.put(str, count);
		}
		int numRed = stdin.nextInt();
		for (int i = 0; i < numRed; i++) {
			String str = stdin.next();
			int count = strCountMap.getOrDefault(str, 0) - 1;
			strCountMap.put(str, count);
		}

		int max = 0;
		for (int count : strCountMap.values()) {
			max = Math.max(max, count);
		}

		System.out.println(max);
	}

}
