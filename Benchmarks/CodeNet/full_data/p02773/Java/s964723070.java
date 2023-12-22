import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Main
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		sc.close();

		int maxDup = 1;
		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String s: S) {
			int v;
			if (m.containsKey(s)) {
				// Mapに登録済み
				v = m.get(s) + 1;
				if (v > maxDup) {
					maxDup = v;
				}
			} else {
				// Mapに未登録
				v = 1;
			}
			m.put(s, v);
		}

		ArrayList<String> list = new ArrayList<String>();
		for (Entry<String, Integer> entry : m.entrySet()) {
			if (entry.getValue() == maxDup) {
				list.add(entry.getKey());
			}
		}
		Collections.sort(list);
		for (String s: list) {
			System.out.println(s);
		}
	}
}
