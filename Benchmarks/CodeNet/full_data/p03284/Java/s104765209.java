import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (n % k == 0) {
			System.out.print("0");
		} else {
			System.out.print("1");
		}
	}
}