import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		boolean can = true;
		while (s.length() != 0) {
			String x = String.valueOf(s.charAt(0));
			int tmp = s.length();
			s = s.replace(x, "");
			if ((tmp - s.length()) % 2 != 0) {
				can = false;
				break;
			}
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
