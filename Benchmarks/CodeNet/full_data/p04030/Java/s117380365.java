import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("");
		String s = null;
		while (true) {
			if (null != s) {
				s = s + sc.next();
			} else {
				s = sc.next();
			}
			if (s.endsWith("B")) {
				s = s.substring(0, s.length() - 2);

			}
			System.out.println(s);
		}
	}

}