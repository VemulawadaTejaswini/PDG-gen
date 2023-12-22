import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<String, Integer> map = new HashMap<>();
		for(char c = 'a' ; c <= 'z' ; c++) {
			map.put(String.valueOf(c), 0);
		}
		for(int i = 0 ; i < s.length() ; i++) {
			map.put(String.valueOf(s.charAt(i)), 1);
		}
		int cnt = 0;
		for(char c = 'a' ; c <= 'z' ; c++) {
			if(map.get(String.valueOf(c)) == 1) cnt++;
		}
		String x = "a";
		for(String key : map.keySet()) {
			if(map.get(key) == 1 && x.compareTo(key) < 0) {
				x = key;
			}
		}
		String min = "z";
		for(String key : map.keySet()) {
			if(map.get(key) == 0 && min.compareTo(key) > 0) {
				min = key;
			}
		}
		if(s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
		} else if(cnt == 26) {
			for(int i = 0 ; i < s.length() - 1 ; i++) {
				if(s.charAt(0) > s.charAt(1)) {
					System.out.println("a");
					return;
				}
				if(s.charAt(i) > s.charAt(i + 1)) {
					String bubun = s.substring(i);
					String q = "z";
					for(int j = 0 ; j < bubun.length() ; j++) {
						if(String.valueOf(bubun.charAt(j)).compareTo(q) < 0) {
							q = String.valueOf(bubun.charAt(j));
						}
					}
					System.out.println(s.substring(0,  i - 1) + q);
					break;
				}
			}
		} else {
			System.out.println(s + String.valueOf(min));
		}

	}
}
