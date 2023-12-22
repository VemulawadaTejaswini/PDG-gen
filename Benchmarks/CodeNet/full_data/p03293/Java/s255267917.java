
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		
		String ans = "No";
		char[] list = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (j == 0) {
					list[0] = s1.charAt(s1.length() - 1);
					continue;
				}
				list[j] = s1.charAt(j - 1);
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < list.length; j++) {
				sb.append(String.valueOf(list[j]));
			}
			s1 = sb.toString();
			if (s1.equals(s2)) {
				ans = "Yes";
				break;
				
			}
		}
		System.out.println(ans);
	}
}