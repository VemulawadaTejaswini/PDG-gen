package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String count = sc.next();
		int ans = 0;
		int loopCount = 0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < Integer.parseInt(count); i++) {
			list.add(sc.next());
		}

		for (String match : list) {

			for (int j = loopCount; j < Integer.parseInt(count); j++) {

				StringBuilder sb = new StringBuilder(list.get(j));
				if (match.equals(sb.toString())) {
					continue;
				}
				for (int i = 0; i < match.length(); i++) {
					char s = match.charAt(i);
					if (sb.indexOf(String.valueOf(s)) == -1) {
						break;
					}
					sb.deleteCharAt(sb.indexOf(String.valueOf(s)));
					if (sb.length() == 0) {
						ans = ans + 1;

					}

				}
				loopCount = loopCount + 1;
			}

		}
		System.out.println(ans);
	}
}
