import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Map<String , Integer> blue = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (!blue.containsKey(s)) {
				blue.put(s, 1);
			}else {
				blue.put(s, blue.get(s) + 1);
			}
		}

		int M = sc.nextInt();
//		Map<String, Integer> red = new HashMap<>();

		for (int i = 0; i < M; i++) {
			String t = sc.next();
			if (!blue.containsKey(t)) {
				blue.put(t, -1);
			} else {
				blue.put(t,blue.get(t) - 1);
			}
		}

		int max = 0;
		for (Map.Entry<String, Integer> entry : blue.entrySet()) {
			max = Integer.max(max, entry.getValue());
		}
		System.out.println(max);
	}
}
