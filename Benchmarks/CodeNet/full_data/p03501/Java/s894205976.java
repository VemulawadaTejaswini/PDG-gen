
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(N * A < B ? (N * A) : B);
		scan.close();

	}

}
