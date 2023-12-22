
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> word = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(word.containsKey(s)) {
				int val = word.get(s);
				val++;
				word.put(s, val);
			} else {
				word.put(s, 1);
			}
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			if(word.containsKey(s)) {
				int val = word.get(s);
				val--;
				if(val == 0) {
					word.remove(s);
				} else {
					word.put(s, val);
				}
			}
		}
		int max = 0;
		for(Map.Entry<String, Integer> e : word.entrySet()) {
			max = Math.max(max, e.getValue());
		}
		System.out.println(max);

	}

}
