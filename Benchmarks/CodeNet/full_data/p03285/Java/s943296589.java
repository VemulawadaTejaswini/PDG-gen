import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int d = scanner.nextInt();

		if((d % 4) == 0 || (d % 7) == 0) {
			System.out.println("Yes");
		} else {
			while((d = d -4) > 0) {
				if ((d % 7) == 0) {
					System.out.println("Yes");
					break;
				}
			}
			if (d < 0) {
				System.out.println("No");
			}
		}
		scanner.close();
	}

}