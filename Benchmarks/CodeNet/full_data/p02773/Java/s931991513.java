import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static int N;
	public static Map<String, Integer> wordCount = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		init();
		int max = 0;
		for (int v : wordCount.values()) {
			if (v > max) {
				max = v;
			}
		}
		for (String w : wordCount.keySet()) {
			if (wordCount.get(w) == max) {
				System.out.println(w);
			}
		}
	}

	public static void init() {
		Scanner sc = new Scanner(System.in);
		try {
			N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				String w = sc.next();
				if (wordCount.containsKey(w)) {
					int count = wordCount.get(w);
					wordCount.put(w, ++count);
				} else {
					wordCount.put(w, 1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
