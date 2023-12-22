import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int		A = scan.nextInt();
		int		B = scan.nextInt();
		int		N = 0;

		if (B % A == 0 ) {
			N = B;
		} else if (A % B == 0) {
			N = A;
		} else {
			N = A * B;
		}


		System.out.println(N);
	}
}