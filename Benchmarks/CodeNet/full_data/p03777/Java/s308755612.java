import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		if ("H".equals(a) && "H".equals(b) || "D".equals(a) && "D".equals(b)) {
			System.out.println("H");
		} else {
			System.out.println("D");
		}

		sc.close();

	}

}