import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dh = sc.next();

		if (dh.equals("A")) {
			System.out.println("T");
		} else if (dh.equals("T")) {
			System.out.println("A");
		} else if (dh.equals("G")) {
			System.out.println("C");
		} else {
			System.out.println("G");
		}
	}
}