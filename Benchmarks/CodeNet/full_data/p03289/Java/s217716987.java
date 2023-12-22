import java.util.Scanner;

public class Main{
	static boolean check(String s) {
		if(s.charAt(0) != 'A') return false;
		if(s.substring(2, s.length() - 1).indexOf('C') != s.substring(2, s.length() - 1).lastIndexOf('C') || s.substring(2, s.length() - 1).indexOf('C') == -1) {
			return false;
		}
		char[] str = s.toCharArray();
		str[0] = 'a';
		str[s.substring(2, s.length() - 1).indexOf('C') + 2] = 'c';
		return String.valueOf(str).equals(s.toLowerCase());
	}
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(check(S)) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
}
