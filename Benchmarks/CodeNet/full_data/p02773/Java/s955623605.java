import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		Map<String, Integer> voteMap = new TreeMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String item = sc.next();

			if (voteMap.containsKey(item)) {
				voteMap.put(item, voteMap.get(item) + 1);
				if (max < voteMap.get(item)) {
					max = voteMap.get(item);
				}
			}else {
				voteMap.put(item, 0);
			}
		}

		for (String string : voteMap.keySet()) {
			if (voteMap.get(string) == max) {
				System.out.println(string);
			}
		}
	}
}