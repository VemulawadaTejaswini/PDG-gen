import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream is = Main.class.getResourceAsStream("data.txt");
		System.setIn(is);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[1]);
		List<String> list = new ArrayList<String>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		while (m > 0) {
			String r = br.readLine();
			list.add(r);
			String[] row = r.split(" ");
			int p = Integer.parseInt(row[0]);
			int y = Integer.parseInt(row[1]);
			if (map.containsKey(p)) {
				map.get(p).add(y);
			} else {
				List<Integer> l = new ArrayList<Integer>();
				l.add(y);
				map.put(p, l);
			}
			m--;
		}
		for (List<Integer> l : map.values()) {
			Collections.sort(l);
		}

		for (String r : list) {
			String[] row = r.split(" ");
			int p = Integer.parseInt(row[0]);
			int y = Integer.parseInt(row[1]);
			int num = map.get(p).indexOf(y) + 1;
			String str1 = "000000" + p;
			String font = str1.substring(str1.length() - 6);
			String str2 = "000000" + num;
			String end = str2.substring(str2.length() - 6);
			System.out.println(font + end);
		}
	}
}
