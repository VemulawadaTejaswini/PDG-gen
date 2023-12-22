import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		int n = Integer.parseInt(firstLine);
		HashMap<String, Integer> map = new HashMap<>();

		// nの文字列リストを取得
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			if (map.get(line) == null) {
				map.put(line, 1);
			} else {
				map.put(line, map.get(line) + 1);
			}
		}
		String secondLine = sc.nextLine();
		int m = Integer.parseInt(secondLine);
		// mの文字列リストを取得
		for (int i = 0; i < m; i++) {
			String line = sc.nextLine();
			if (map.get(line) == null) {
				map.put(line, -1);
			} else {
				map.put(line, map.get(line) - 1);
			}
		}
		sc.close();

		int max = 0;
		for (String key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
			}
		}
		System.out.println(max);
	}

}
