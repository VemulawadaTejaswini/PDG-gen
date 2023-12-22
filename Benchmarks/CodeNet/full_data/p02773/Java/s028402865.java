import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		Map<String, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				if(max < map.get(s) + 1) {max = map.get(s) + 1;}
				map.put(s, map.get(s) + 1);
			}else {
				if(max < 1) {max = 1;}
				map.put(s, 1);
			}
		}

		for(String key : map.keySet()) {
			if(map.get(key) == max) {
				System.out.println(key);
			}
		}

		sc.close();
	}
}
