import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		if (a.equals(b)) {
			System.out.println("EQUAL");
		} else if (a.compareTo(b) > 0) {
			System.out.println("GREATER");
		} else {
			System.out.println("LESS");
		}

		sc.close();
	}

}
