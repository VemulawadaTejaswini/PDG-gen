import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new TreeMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int val = map.containsKey(s) ? map.get(s) + 1 : 1;
			map.put(s, val);
			max = Math.max(max, val);
		}
		PrintWriter out = new PrintWriter(System.out);
		for (String key : map.keySet()) {
			if (map.get(key) == max) {
				out.println(key);
			}
		}
		out.flush();
	}
}