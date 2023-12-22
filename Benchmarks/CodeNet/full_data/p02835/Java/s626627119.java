rt java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int add = a1 + a2 + a3;

		if (add >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}

	}
}