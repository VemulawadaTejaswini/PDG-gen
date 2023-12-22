import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<String, Integer> S = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String SS = sc.next();
			if (S.containsKey(SS)) {
				S.put(SS, S.get(SS) + 1);
			} else {
				S.put(SS, 1);
			}
		}
		int max = 0;
		for (Entry<String, Integer> entry : S.entrySet()) {
			if (entry.getValue() > max)
				max = entry.getValue();
		}
		List<String> maxList = new ArrayList<String>();
		for (Entry<String, Integer> entry : S.entrySet()) {
			if (entry.getValue() == max) {
				maxList.add(entry.getKey());
			}
		}
		Collections.sort(maxList);
		for (String string : maxList) {
			System.out.println(string);
		}
	}
}