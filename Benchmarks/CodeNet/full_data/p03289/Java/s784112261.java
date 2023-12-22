import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();

		if(solve(s)) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
    }

	public static boolean solve(String s) {
		if(s.charAt(0) != 'A') return false;
		int a = 0;
		int index = 0;
		for(int i = 2; i < s.length() - 1; i++) {
			if(s.charAt(i) == 'C') {
				if(a != 0) return false;
				a++;
				index = i;
			}
		}
		if(a != 1) return false;
		for(int i = 1; i < s.length(); i++) {
			if(i == index) continue;
			if(Character.isUpperCase(s.charAt(i))) return false;
		}
		return true;
	}
}
