import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			System.out.print(c == '1' ? '9' : '1');
		}

		System.out.println();

		sc.close();

	}
}

