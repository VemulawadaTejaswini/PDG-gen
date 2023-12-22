import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	final static String aa = "aa";
	final static String a = "a";
	final static String bb = "bb";
	final static String b = "b";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (!s.contains(aa) && !s.contains(bb)) {
			System.out.println(1);
			return;
		}

		Map<String, String> sm = new HashMap<String, String>();
		int n = 1;

		sm.put(s, "");

		while (sm.size() > 0) {
			Map<String, String> m = new HashMap<String, String>();

			for (String str : sm.keySet()) {
				int i = 0;
				while (i >= 0) {
					i = str.indexOf(aa, i);
					if (i == -1) {
						break;
					}
					String replaced = str.substring(0, i) + b + str.substring(i + 2, str.length());
					i++;
					m.put(replaced, "");
				}
			}
			for (String str : sm.keySet()) {
				int i = 0;
				while (i >= 0) {
					i = str.indexOf(bb, i);
					if (i == -1) {
						break;
					}
					String replaced = str.substring(0, i) + a + str.substring(i + 2, str.length());
					i++;
					m.put(replaced, "");
				}
			}

			n += m.size();
			sm = m;
		}

		System.out.println(n);

		return;
	}
}
