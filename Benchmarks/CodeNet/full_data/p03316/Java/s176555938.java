import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int s = 0;

			int temp = n;
			while (temp > 0) {
				s += (temp % 10);
				temp /= 10;
			}
			if (n % s == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}