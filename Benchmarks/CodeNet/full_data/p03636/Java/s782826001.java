import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char s1 = s.charAt(0), s2 = s.charAt(s.length() - 1);
		System.out.print(s1);
		System.out.print(s.length() - 2);
		System.out.print(s2);
		sc.close();
	}
}
