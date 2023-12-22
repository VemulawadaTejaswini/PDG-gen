import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String start = S.substring(0, 1);
		String end = S.substring(S.length() - 1, S.length());
		int num = S.length() - 2;
		System.out.println(start + Integer.toString(num) + end);
	}
}