import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int k = sc.nextInt();

		if (n != 1) {
			System.out.print(n - k);
		} else {
			System.out.print("0");
		}

	}
}