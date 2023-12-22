import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String S = scan.next();
		
		String half = S.substring(N / 2);
		if (S.equals(half.concat(half))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}