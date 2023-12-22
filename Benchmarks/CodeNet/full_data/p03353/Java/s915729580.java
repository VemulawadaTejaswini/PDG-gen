import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();

		TreeSet<Integer> chSet = new TreeSet<Integer>();
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - 'a';
			chSet.add(ch);
		}

		Set<Integer> idxSet = new HashSet<Integer>();
		TreeSet<String> strSet = new TreeSet<String>();
		for (int nextCh : chSet.toArray(new Integer[0])) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch - 'a' == nextCh) {
					idxSet.add(i);
				}
			}

			for (int i = 1; i <= 5 && idxSet.size() > 0; i++) {
				for (int idx : idxSet.toArray(new Integer[0])) {
					if (idx + i <= s.length()) {
						String str = s.substring(idx, idx + i);
						strSet.add(str);
					} else {
						idxSet.remove(idx);
					}
				}
			}

			if (strSet.size() >= k) {
				break;
			}
		}

		System.out.println(strSet.toArray(new String[0])[k - 1]);
	}
}
