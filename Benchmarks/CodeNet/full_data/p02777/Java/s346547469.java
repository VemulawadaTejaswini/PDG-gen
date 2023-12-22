
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();

		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		String U = sc.next();

		if(U.equals(S)) {
			System.out.println((A-1) + " "+ B);
		} else {
			System.out.println(A + " "+ (B-1) );
		}
	}
}