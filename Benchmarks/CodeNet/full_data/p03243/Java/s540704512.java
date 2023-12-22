import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i < 10; i++) {
			if (n <= i * 111) {
				System.out.println(i * 111);
				break;
			}
		}

	}
}