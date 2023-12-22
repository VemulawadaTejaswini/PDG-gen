import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[3];
		A[0] = scanner.nextInt();
		A[1] = scanner.nextInt();
		A[2] = scanner.nextInt();
		if (A[0] % 2 == 0 || A[1] % 2 == 0 || A[2] % 2 == 0) {
			System.out.println(0);
		} else {
			Arrays.sort(A);
			System.out.println(A[0] * A[1]);
		}
	}
}