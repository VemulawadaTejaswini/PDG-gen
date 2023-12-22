import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		// APPROVED
		// DENIED

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = 1;
		String w = "";
		Map<String, Integer> map = new HashMap<>();
		List<String> strArr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			w = sc.next();
			if (map.get(w) == null) {
				map.put(w, 1);
			} else {
				map.put(w, map.get(w) + 1);
				if (map.get(w) > max) {
					max = map.get(w);
				}
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				strArr.add(entry.getKey());
			}
		}
		Collections.sort(strArr);

		for (String str : strArr) {
			System.out.println(str);
		}

	}

}