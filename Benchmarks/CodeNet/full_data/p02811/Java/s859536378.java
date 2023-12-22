import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k,x;

		k = scanner.nextInt();
		x = scanner.nextInt();

		if (500 * k >= x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}