import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String o = scan.next();
		String e = scan.next();
		int lenO = o.length();
		int lenE = e.length();
		for (int i = 0; i < lenO; i++) {
			if (i < lenO) {
				System.out.print(o.charAt(i));
			}
			if (i < lenE) {
				System.out.print(e.charAt(i));
			}
		}
		System.out.println();
	}
}