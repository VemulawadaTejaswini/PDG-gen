import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		
		char[] map = new char[26];
		for (int i = 'a'; i <= 'z'; i++) {
			map[i-'a'] = '0';
		}
		
		for (int i = 0; i < S.length(); i++) {
			if (map[S.charAt(i)-'a'] == '0' || map[S.charAt(i)-'a'] == T.charAt(i)) {
				map[S.charAt(i)-'a'] = T.charAt(i);
			} else {
				System.out.println("No");
				return;
			}
		}
		
		for (int i = 'a'; i <= 'z'; i++) {
			int count = 0;;
			for(char c: map) {
				if(c == i) {
					count++;
				}
			}
			
			if (count > 1) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
}
