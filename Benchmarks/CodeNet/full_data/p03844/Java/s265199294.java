import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = Integer.parseInt(scn.next());
		String op = scn.next();
		int B = Integer.parseInt(scn.next());

		if (op.equals("+")) {
			System.out.println(A + B);
		} else if (op.equals("-")) {
			System.out.println(A - B);
		}
	}
}