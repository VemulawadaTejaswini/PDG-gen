import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		final int A = scan.nextInt();
		final int B = scan.nextInt();
		scan.close();
		
		if (N * A >= B) {
			System.out.println(B);
		} else {
			System.out.println(N * A);
		}

	}

}