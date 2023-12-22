import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		System.out.println(String.valueOf(a.charAt(a.length() - 1)).equals(String.valueOf(b.charAt(0))) &&
				String.valueOf(b.charAt(b.length() - 1)).equals(String.valueOf(c.charAt(0)))? "YES" : "NO");

		sc.close();

	}

}