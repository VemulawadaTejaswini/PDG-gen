import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//		int h = sc.nextInt();
		//		int x = sc.nextInt();
		//		int y = sc.nextInt();

		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i));
		}

	}
}