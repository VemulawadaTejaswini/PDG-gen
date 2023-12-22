import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String T = sc.next();
		sc.close();
		int l1 = s.length();
		int l2 = T.length();
		String ans = "";
		for(int i = 0; i <= l1 - l2; i++) {
			boolean flag = true;
			for(int j = 0; j < l2; j++) {
				char c1 = s.charAt(i + j);
				char c2 = T.charAt(j);
				if(c1 != '?' && c1 != c2) {
					flag = false;
					break;
				}
			}
			if(flag) {
				StringBuilder sb = new StringBuilder(s);
				for(int j = 0; j < l2; j++) {
					char c1 = s.charAt(i + j);
					char c2 = T.charAt(j);
					if(c1 == '?') {
						sb.replace(i + j, i + j + 1, String.valueOf(c2));
					}
				}
				for(int j = 0; j < l1; j++) {
					if(sb.charAt(j) == '?') {
						sb.replace(j, j + 1, "a");
					}
				}
				//System.out.println(sb);
				String t = sb.toString();
				if(ans.length() == 0) {
					ans = sb.toString();
				}else {
					if(ans.compareTo(t) == 1) {
						ans = t;
					}
				}
			}
		}
		if(ans.length() == 0) {
			System.out.println("UNRESTORABLE");
		}else {
			System.out.println(ans);
		}

	}
}