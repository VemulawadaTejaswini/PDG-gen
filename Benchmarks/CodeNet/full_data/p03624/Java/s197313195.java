import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		// 計算
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String s : "abcdefghijklmnopqrstuvwxyz".split("")) {
			if (!s.equals("")) {
				map.put(s, 0);
			}
		}
		for (String s : S.split("")) {
			if (!s.equals("")) {
				map.put(s, map.get(s) + 1);
			}
		}
		String output = "None";
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 0) {
				output = entry.getKey();
				break;
			}
		}

		// 出力
		System.out.println(output);

		return;
	}
}
