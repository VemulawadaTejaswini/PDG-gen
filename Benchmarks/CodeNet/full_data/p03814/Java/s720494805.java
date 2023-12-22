import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int na = str.length();
		int i = 0;

		int a = na;
		int z = 0;

		String ary[] = new String[na];

		for (i = 0; i < na; i++) {
			ary[i] = str.charAt(i) + "";

		}

		i = 0;
		for (i = 0; i < na; i++) {
			if (ary[i].equals("A")) {
				if (i < a) {
					a = i;
				} else {

				}
			}
			if (ary[i].equals("Z")) {
				if (i > z) {
					z = i;
				} else {

				}
			}

		}System.out.println((z-a)+1);
	}

}