import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int candy = 0;

		for (int i = 1; i <= n; i++) {
			candy += i;
		}
		System.out.println(candy);
	}
}
