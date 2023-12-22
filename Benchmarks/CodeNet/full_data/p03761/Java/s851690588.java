import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		Set<String> set = new HashSet<>();
		for(char c = 'a' ; c <= 'z' ; c++) {
			map.put(String.valueOf(c), 0);
			map1.put(String.valueOf(c), 0);
		}
		for(char c = 'a' ; c <= 'z' ; c++) {
			map2.put(String.valueOf(c), 100000);
		}
		for(int i = 0 ; i < n ; i++) {
			String s = sc.next();
			for(int j = 0 ; j < s.length() ; j++) {
				for(char c = 'a' ; c <= 'z' ; c++) {
					if(s.charAt(j) == c) {
						map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
						map1.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
						set.add(String.valueOf(c));
						break;
					}
				}
			}
			for(String key : map.keySet()) {
				if(map.get(key) != 0 && map.get(key) < map2.get(key)) {
					map2.put(key, map.get(key));
				}
			}
			for(String key : map2.keySet()) {
				boolean found = false;
				for(String key2 : set) {
					if(key.equals(key2)) {
						found = true;
					}
				}
				if(!found) {
					map2.put(key, 0);
				}
			}
			for(String key : map.keySet()) {
				map.put(key, 0);
			}
			set = new HashSet<>();
		}
		StringBuilder sb = new StringBuilder();
		for(String key : map2.keySet()) {
			if(map2.get(key) == 100000) continue;
			for(int i = 0 ; i < map2.get(key) ; i++) {
				sb.append(key);
			}
		}
		System.out.println(sb.toString());
	}
}
