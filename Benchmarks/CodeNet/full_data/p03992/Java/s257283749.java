import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		System.out.println(s.substring(0, 4) + " " + s.substring(4));
	}
}