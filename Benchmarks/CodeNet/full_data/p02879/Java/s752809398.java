import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		if(A <= 9 && B <= 9) {
			System.out.println(A*B);
		}
		System.out.println(-1);

	}
}