import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		String str = "";
		outside : for(int i = 0; i <= S.length() - T.length(); i++) {
			StringBuilder sb = new StringBuilder(S);
			sb = sb.replace(i, i + T.length(), T);
			for(int j = 0; j < S.length(); j++) {
				if(!sb.substring(j, j + 1).equals("?")) {
					if(j > i && j <= i + T.length()) {
					}else if(S.substring(j, j + 1).equals(sb.substring(j, j + 1))) {
					} else {
						continue outside;
					}
				} else {
					sb.replace(j, j + 1, "a");
				}
			}
			str = sb.toString();
		}
		if(str == "") {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(str);
		}
	}
}
