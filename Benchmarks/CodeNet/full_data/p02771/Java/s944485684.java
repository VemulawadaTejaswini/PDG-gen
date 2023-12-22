import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		System.out.println((a == b && b != c || a == c && b != c || c == b && b != a)? "Yes":"No");
	}
}