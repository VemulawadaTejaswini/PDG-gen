import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A = s.nextInt();
		int B = s.nextInt();

		for (int index = 1; index > 0; index++) {
			if (A >= B) {
				System.out.println(index);
				return;
			} else {
				A = A + (A - 1);
			}
		}
	}
}