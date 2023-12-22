import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		
		String halfA = S.substring(0, N / 2);
		String halfB = S.substring(N / 2, N);
		if (halfA.equals(halfB)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
