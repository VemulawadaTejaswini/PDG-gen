import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt() ;
		int A = scan.nextInt() ;
		int B = scan.nextInt() ;
		int ans = 0;

		if ( (N * A) <= B) {
			ans = N * A;
		} else {
			ans = B;
		}
		System.out.println(ans);
	}
}