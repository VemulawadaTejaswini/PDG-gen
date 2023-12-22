import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new TreeMap<>();
			int max = 0;
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
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
}