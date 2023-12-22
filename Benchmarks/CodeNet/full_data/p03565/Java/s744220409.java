import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();
			StringBuilder ans = new StringBuilder();

			int startFlg = -1;

			for (int i = 0; i <= S.length() - T.length(); i++) {
				for (int j = 0; j < T.length(); j++) {
					if (S.charAt(i + j) == '?') {
					} else if (S.charAt(i + j) == T.charAt(j)) {
						startFlg = i;
					} else {
						startFlg = -1;
						break;
					}
				}
			}
			if (startFlg == -1) {
				System.out.println("UNRESTORABLE");
			} else {
				for (int i = 0; i < startFlg; i++) {
					if(S.charAt(i) == '?'){
						ans.append('a');
					}else{
						ans.append(S.charAt(i));
					}
				}
				ans.append(T);
				System.out.println(ans);
			}
		}
	}
}
