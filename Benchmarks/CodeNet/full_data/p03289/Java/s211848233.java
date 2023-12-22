import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		
		System.out.print(check(S) ? "AC" : "WA"); 
	}
	
	private static boolean check (String S) {
		int len = S.length();
		int cCount = 0;
		for (int i = 0 ; i < len ; i++) {
			char ch = S.charAt(i);
			if (i == 0) {
				if (ch != 'A') {
					return false;					
				}
			} else if (i == 1) {
				if (!checkSmall(ch)) {
					return false;
				}
			} else if (i > 1 && i < len - 1) {
				if (ch == 'C') {
					cCount++;
				} else if (!checkSmall(ch)){
					return false;
				}
			} else {
				if (cCount != 1) {
					return false;
				} else if (!checkSmall(ch)){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static boolean checkSmall (char ch) {
		if (!(ch >= 0x61 && ch <= 0x7A)){
			return false;
		}
		return true;
	}
}