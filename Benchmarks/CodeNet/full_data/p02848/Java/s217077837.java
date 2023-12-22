import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if ((int) (s.charAt(i) + n) <= 90) {
				System.out.print((char) (s.charAt(i) + n));
			} else {
				{
					System.out.print((char) ((s.charAt(i) + n) % 90 + 64));
				}

			}

		}
	}
}
