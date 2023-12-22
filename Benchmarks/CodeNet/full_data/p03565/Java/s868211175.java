import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int num = -1;
		out : for(int i = S.length() - 1; i >= 0; i--) {
			for(int j = 0; j < T.length(); j++) {
				if(i - j < 0) break out;
				if(S.charAt(i - j) != T.charAt(T.length() - j - 1) && S.charAt(i - j) != '?') {
					continue out;
				}
			}
			num = i - T.length();
			break out;
		}
		
		if(num == -1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		
		for(int i = 0; i <= num; i++) {
			if(S.charAt(i) == '?') {
				System.out.print("a");
			} else {
				System.out.print(S.charAt(i));
			}
		}
		System.out.print(T);
		for(int i = num + T.length(); i < S.length() - 1; i++) {
			System.out.print("a");
		}
		System.out.println();
	}
}
