import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int d = sc.nextInt();
			
			int s = d * 2 + 1;
			if (n % s == 0) {
				System.out.println(n / s);
			} else {
				System.out.println(n / s + 1);
			}

		}
	}
}