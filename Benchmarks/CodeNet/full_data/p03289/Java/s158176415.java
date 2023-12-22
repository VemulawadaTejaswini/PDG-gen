import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(check(s)) {
			System.out.println("AC");
		}
		else {
			System.out.println("WA");
		}
	}
	public static boolean check(String s) {
		if(s.charAt(0)!='A') {
			return false;
		}
		int c = 0;
		for(int i = 2; i <s.length()-1; i++) {
			if(s.charAt(i)=='C') {
				c++;
			}
		}
		if(c!=1) {
			return false;
		}
		int upper = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				upper++;
			}
		}
		if(upper!=2) {
			return false;
		}
		return true;
	}
}
