
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			String s2 = "";
			String s3 = "";
			for (int j = 0; j < n; j++) {
				s2 = s.substring(0, 1 + j);
				s3 = s.substring(j + 1);
				int cnt = 0;
				List<Character> list = new ArrayList<>();
				for (int j2 = 0; j2 < s2.length(); j2++) {
					if (!list.contains(s2.charAt(j2))) {
						for (int k = 0; k < s3.length(); k++) {
							if (s2.charAt(j2) == s3.charAt(k)) {
								cnt++;
								break;
							}
						}
					}
					list.add(s2.charAt(j2));
					ans = Math.max(ans, cnt);
				}
			}
		}

		System.out.println(ans);

	}
}