import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String s0 = S.substring(0, 1);
		String s1 = S.substring(1, 4);
		char[] c = S.toCharArray();
		boolean b = false;

		int pos = s1.indexOf(s0);

		switch (pos) {
			case 0:
				b = (c[2] == c[3]) && (c[0] != c[2]);
				break;
			case 1:
				b = (c[1] == c[3]) && (c[0] != c[1]);
				break;
			case 2:
				b = (c[1] == c[2]) && (c[0] != c[1]);
				break;
			default:
				break;
		}

		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
