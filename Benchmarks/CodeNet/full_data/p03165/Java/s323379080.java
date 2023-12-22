/* あえてbit全探索で書いてみる  */
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		int lim = (int) Math.pow(2, s.length()) - 1;
		int max = 0;
		String longestPart = "";
		for (int i = 0; i <= lim; i++) {
			int n = i;
			
			String str = "";
			for (int j = 0; j < s.length(); j++) {
				if ((n & 1) == 1) str += s.charAt(j);
				n = n >> 1;
			}
			
			String reg = "";
			for (int j = 0; j < str.length(); j++) {
				if (j == 0) reg += ".*";
				reg += str.charAt(j) + ".*";
			}
			
			if (t.matches(reg) && str.length() > max) {
				max = str.length();
				longestPart = str;
			}
		}
		
		System.out.println(longestPart);
		
		sc.close();
	}
}

