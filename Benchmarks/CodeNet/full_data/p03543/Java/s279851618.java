import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String sl = s.next();
		String[] sa = new String[4];

		for (int i = 0; i < 4; i++) {
			sa = sl.split("");
		}

		int a = Integer.parseInt(sa[0]);
		int b = Integer.parseInt(sa[1]);
		int c = Integer.parseInt(sa[2]);
		int d = Integer.parseInt(sa[3]);

		if ((a == b && b == c) || (b == c && c == d)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
