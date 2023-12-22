import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int ans = B;
		if (A >= 6 && A <= 12)
			ans = B / 2;
		if (A <= 5)
			ans = 0;
		System.out.println(ans);
		scanner.close();
	}
}