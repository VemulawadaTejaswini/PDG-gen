

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] s = new String[n];
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			s[i] = scanner.next();
			if(map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			}else {
				map.put(s[i], 1);
			}
		}
		
		int m = scanner.nextInt();
		String[] t = new String[m];
		for (int i = 0; i < m; i++) {
			t[i] = scanner.next();
			if(map.containsKey(t[i])) {
				map.put(t[i], map.get(t[i]) - 1);
			}
		}
		
		
		int max = 0;
		for(Map.Entry<String, Integer> ans: map.entrySet()) {
			max = Math.max(max, ans.getValue());
		}
		System.out.println(max);
		scanner.close();

	}

}
