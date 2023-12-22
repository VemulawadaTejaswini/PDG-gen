import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int cap  = A - B;
		int use = Math.min(C, cap);
		int ans = C - use;
		System.err.println(ans);
	}
}