import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for(int i = S.length(); i > 0; i--) {
			sb.append(S.charAt(i - 1));
		}
		String R = sb.toString();

		int len = S.length();

		String start = S.substring(0, (len - 1) / 2);
		StringBuffer str = new StringBuffer();
		for(int i = start.length(); i > 0; i--) {
			str.append(start.charAt(i - 1));
		}
		String checkStart = str.toString();

		String end = S.substring((len + 3) / 2 - 1, len);
		StringBuffer en = new StringBuffer();
		for(int i = end.length(); i > 0; i--) {
			en.append(end.charAt(i - 1));
		}
		String checkEnd = en.toString();


		if(len > 5) {
			if(S.equals(R) && start.equals(checkStart) && end.equals(checkEnd)) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}else if(len == 5) {
			if(S.equals(R) && S.charAt(0) == S.charAt(1) && S.charAt(3) == S.charAt(4)) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}else {
				System.out.println("Yes");
				return;
		}
	}

}