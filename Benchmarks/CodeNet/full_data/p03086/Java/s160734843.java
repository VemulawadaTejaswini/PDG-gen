import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int ans = 0;
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String s = S.substring(i, j);
				boolean flag = true;
				for (int l = 0; l < s.length(); l++) {
					if (s.charAt(l) != 'A' && s.charAt(l) != 'T' && s.charAt(l) != 'C' && s.charAt(l) != 'G') {
						flag = false;
						break;
					}
				}
				if (flag && s.length() > ans)
					ans = s.length();
			}
		}
		System.out.println(ans);
	}

}