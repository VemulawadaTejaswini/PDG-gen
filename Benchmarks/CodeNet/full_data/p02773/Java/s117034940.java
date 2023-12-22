import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		int max = 0;
		Map<String, Integer> map = new TreeMap<>();

		for(int i = 0; i < n; i++) {

			String x = scanner.nextLine();
			int val  = map.containsKey(x) ? map.get(x) + 1 : 1;
			map.put(x, val);
			max = Math.max(max, val);

		}

		for (var entry : map.entrySet()) {
			 if (entry.getValue() == max) {
				 System.out.println(entry.getKey());
	            }
		}

	}
}