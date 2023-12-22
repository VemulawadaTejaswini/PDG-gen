import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
		while(true) {
			int l = s.length();
			if (l==0) {
				break;
			} else if (l<5) {
				System.out.println("NO");
				return;
			}

			if (s.substring(l-5, l).equals("erase")) {
				s = s.substring(0,l-5);
			} else if (s.substring(l-5, l).equals("dream")) {
				s = s.substring(0,l-5);
			} else if (s.substring(l-6, l).equals("eraser")) {
				s = s.substring(0,l-6);
			} else if (s.substring(l-7, l).equals("dreamer")) {
				s = s.substring(0,l-7);
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
