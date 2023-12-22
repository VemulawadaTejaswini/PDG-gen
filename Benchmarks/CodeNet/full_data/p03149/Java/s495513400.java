import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(
				s.contains("1") &&
				s.contains("9") &&
				s.contains("7") &&
				s.contains("4") ? "YES" : "NO");

		sc.close();
	}
}

