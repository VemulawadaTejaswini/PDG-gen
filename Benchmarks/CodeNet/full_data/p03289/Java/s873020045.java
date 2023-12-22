import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();

		boolean ans = false;

		if(s.charAt(0) == 'A') {
			int a = 0;
			int index = 0;
			for(int i = 2; i <= s.length() - 2; i++) {
				if(s.charAt(i) == 'C') {
					a++;
					index = i;
				}
			}
			if(a == 1) {
				ans = true;
				for(int i = 3; i < s.length() - 3; i++) {
					if(i == index) continue;
					if(Character.isUpperCase(s.charAt(i))) {
						ans = false;
						break;
					}
				}
			}
		}

		if(ans) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
    }
}
