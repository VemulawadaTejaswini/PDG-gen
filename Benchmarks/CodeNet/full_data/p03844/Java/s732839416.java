import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		char c = sc.next().toCharArray()[0];
		long b = sc.nextInt();
		if (c == '+') {
			System.out.println(a + b);
		} else {
			System.out.println(a - b);
		}
	}
}