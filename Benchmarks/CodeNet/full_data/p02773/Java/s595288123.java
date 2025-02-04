import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			int max = 0, tmp = 0;
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				tmp = (map.containsKey(s)) ? map.get(s) + 1 : 1;
				map.put(s, tmp);
				max = Math.max(max, tmp);
			}
			List<String> list = new ArrayList<>();
			for (String key : map.keySet()) if (map.get(key) == max) list.add(key);
			Collections.sort(list);
			PrintWriter out = new PrintWriter(System.out);
			for (String s : list) out.println(s);
			out.flush();
		}
	}
}