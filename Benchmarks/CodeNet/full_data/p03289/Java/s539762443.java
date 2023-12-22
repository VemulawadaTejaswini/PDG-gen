import java.util.*;

public class Main {
	static boolean check(String s) {
		if(s.charAt(0) != 'A')return false;
		boolean flag = false;
		for(int i = 1;i < s.length();i ++) {
			if(s.charAt(i) != 'C') {
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')return false;
			}
			else if(flag || i < 2 || s.length() - i < 2)return false;
			else flag = true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(check(s)) {
			System.out.println("AC");
		}
		else {
			System.out.println("WA");
		}
	}
}
