import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Character, Long> map = new HashMap<>();
		long count = 0;
		for (int i = 0; i < N; i++) {
			Character S = in.next().charAt(0);
			if (S == 'M' || S == 'A' || S == 'R' || S == 'C' || S == 'H') {
				if (map.containsKey(S)) {
					map.put(S, map.get(S) + 1);
				} else {
					map.put(S, 1l);
				}
				count++;
			}
		}
		long ans = 0;
		if (count >= 3) {
			ans = count * (count - 1) * (count - 2) / 6;
			for (Map.Entry<Character, Long> s : map.entrySet()) {
				if (s.getValue() >= 2) {
					long sNum = s.getValue() * (s.getValue() - 1) / 2;
					ans -= sNum * (count - s.getValue());
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}