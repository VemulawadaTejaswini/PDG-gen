import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if ("A".equals(S)) {
			System.out.println("T");
		} else if ("T".equals(S)) {
			System.out.println("A");
		} else if ("C".equals(S)) {
			System.out.println("G");
		} else {
			System.out.println("C");
		}
	}
}
