import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		int ax = a.length() - a.replace("a", "").length();
		int bx = b.length() - b.replace("b", "").length();
		int cx = c.length() - c.replace("c", "").length();

		int max = Math.max(ax, Math.max(bx, cx));

		if (max == ax) {
			System.out.println("A");
		} else if (max == bx) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}


		sc.close();

	}

}