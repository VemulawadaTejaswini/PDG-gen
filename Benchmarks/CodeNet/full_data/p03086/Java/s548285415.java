import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length() + 1; j++) {
				String tmp = s.substring(i, j);
				if (tmp.replace("A", "").replace("T", "").replace("G", "").replace("C", "").equals("")) {
					ans = ans < (j - i) ? j - i : ans;
				}
			}
		}
		System.out.println(ans);
	}
}