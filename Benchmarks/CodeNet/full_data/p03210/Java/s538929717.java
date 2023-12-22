import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println((x % 2 == 1 && 2 < x && x < 8) ? "YES" : "NO");

		sc.close();

	}
}

