import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		String w = sc.next();
		for (int i = 0; i < w.length(); i++) {
			if (map.containsKey(String.valueOf(w.charAt(i)))) {
				map.put(String.valueOf(w.charAt(i)), map.get(String.valueOf(w.charAt(i))) + 1);
			} else {
				map.put(String.valueOf(w.charAt(i)), 1);
			}
		}
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr.next();
			if (entry.getValue() % 2 != 0) {
				System.out.println("No");
				return;
			}

		}
		System.out.println("Yes");
	}

}
