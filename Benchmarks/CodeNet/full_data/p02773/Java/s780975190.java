import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int max = 0;
		Map<String, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {

			String n1 = sc.nextLine();
			int val = map.containsKey(n1) ? map.get(n1) + 1 : 1;
			map.put(n1, val);
			max = Math.max(max, val);

		}

		for (var entry : map.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println(entry.getKey());
			}
		}
	}

}
