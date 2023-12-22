import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i + 1).equals("o")) {
				cnt++;
			}
		}
		if(cnt + 15 - len >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
