import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			if(s.length() == 1) {
				System.out.println(0);
				return;
			}
			char[] c1 = s.substring(0, s.length() / 2).toCharArray();
			int half = 0;
			if(s.length() % 2 == 0) {
				half = s.length() / 2;
			} else {
				half = s.length() / 2 + 1;
			}
			char[] c2 = s.substring(half).toCharArray();
			char[] c3 = new char[c1.length];
			for(int i = 0 ; i < c1.length ; i++) {
				c3[c1.length - 1 -i] = c1[i];
			}
			char[] c4 = new char[c2.length];
			for(int i = 0 ; i < c2.length ; i++) {
				c4[c2.length - 1 -i] = c2[i];
			}
			int ans1 = 0;
			for(int i = 0 ; i < c1.length ; i++) {
				if(c2[i] != c3[i]) {
					ans1++;
				}
			}
			int ans2 = 0;
			for(int i = 0 ; i < c2.length ; i++) {
				if(c1[i] != c4[i]) {
					ans2++;
				}
			}
			System.out.println(Math.min(ans1, ans2));
		}

	}

}
