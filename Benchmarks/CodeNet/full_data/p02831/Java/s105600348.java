import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int		A = scan.nextInt();
		int		B = scan.nextInt();
		int		temp;
		int     C = B;

		while ((temp = A%B) != 0) {
			A = B;
			B = temp;
		}
			System.out.println((C/B));
	}
}
