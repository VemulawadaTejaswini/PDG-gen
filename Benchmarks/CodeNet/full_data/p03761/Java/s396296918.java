import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] s = new String[n];
		int m = 0, min = 50;
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			if (s[i].length() < min) {
				min = s[i].length();
				m = i;
			}
		}

		boolean flag;
		String a;
		int l = 0;
		List<String> ans = new ArrayList<String>();
		for (int j = 0; j < min; j++) {
			a = s[m].substring(0, 1);
			flag = true;
			for (int i = 0; i < n; i++) {
				if (s[i].length() == s[i].replaceFirst(a, "").length()) {
					flag = false;
				}
				s[i] = s[i].replaceFirst(a, "");
			}
			if (flag) {
				ans.add(a);
			}
		}
		Collections.sort(ans);
		System.out.print("");
		for (String str:ans) {
			System.out.print(str);
		}
		System.out.println();
		sc.close();
	}

}
