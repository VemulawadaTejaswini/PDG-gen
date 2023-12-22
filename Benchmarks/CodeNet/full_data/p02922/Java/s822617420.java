import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A = s.nextInt();
		int B = s.nextInt();
		int x = A - 1;
		int index = 1;
		for (index = 1; index > 0; index++) {
			if (A >= B) {
				break;
			} else {
				A = A + x;
			}
		}
		System.out.println(index);
	}
}