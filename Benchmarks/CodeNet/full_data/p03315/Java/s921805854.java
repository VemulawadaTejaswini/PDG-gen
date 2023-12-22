import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		int sum = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == '+') {
				sum++;
			} else {
				sum--;
			}
		}

		System.out.println(sum);

	}
}
