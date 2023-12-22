import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Long> map = new HashMap<>();
		long cnt = 0;
		for ( int i = 0; i < n; i++ ) {
			char[] s = in.next().toCharArray();
			Arrays.sort(s);
			String key = new String(s);

			if ( map.containsKey(key) ) {
				Long prev = map.get(key);
				Long d = (long) Math.sqrt(prev * 2.0) + 1;
				map.put(key, prev + d);
			} else {
				map.put(key, (long) 0);
			}
		}

		for ( Entry<String, Long> en : map.entrySet() ) {
			// System.out.println(en);
			cnt += en.getValue();
		}

		System.out.println(cnt);
		in.close();
	}
}