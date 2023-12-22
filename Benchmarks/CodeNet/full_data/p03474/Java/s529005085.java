import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String p[] = s.split("-", 0);
		if (p.length != 2 || p[0].length() != a || p[1].length() != b)
			System.out.println("No");
		else if (isNumber(p[0]) && isNumber(p[1]))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}