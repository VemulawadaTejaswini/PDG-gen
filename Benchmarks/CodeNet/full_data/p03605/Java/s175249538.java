import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextInt();

			if (n % 10 == 9) {
				System.out.println("Yes");
			} else if(n / 10 == 9) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
