import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		if (s.length() < 4) {
			System.out.println("No");
			sc.close();
			return;
		}

		System.out.println(s.substring(0, 4).equals("YAKI") ? "Yes" : "No");

		sc.close();
	}
}

