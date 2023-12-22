import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String s = sc.nextLine();

		String a = s.substring(0, n / 2);
		String b = s.substring(n / 2, s.length());
		if (a.equals(b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
