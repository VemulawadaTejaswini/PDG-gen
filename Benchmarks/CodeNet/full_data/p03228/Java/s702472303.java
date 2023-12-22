import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put("Taka", a);
		map.put("Aoki", b);
		for (int i = 0; i < k; i++) {
			if (i % 2 == 0) {
				if (map.get("Taka") % 2 == 1) {
					map.put("Taka", map.get("Taka")-1);
				}
				map.put("Aoki", map.get("Aoki")+(map.get("Taka")/2));
				map.put("Taka", map.get("Taka")/2);
			} else {
				if (map.get("Aoki") % 2 == 1) {
					map.put("Aoki", map.get("Aoki")-1);
				}
				map.put("Taka", map.get("Taka")+(map.get("Aoki")/2));
				map.put("Aoki", map.get("Aoki")/2);
			}
		}
		System.out.println(map.get("Taka") + " " + map.get("Aoki"));
	}
}